package Thread;
//semaphore use for control access for some resources
//A counting semaphore. Conceptually, a semaphore maintains a set of permits.
// Each acquire blocks if necessary until a permit is available, and then takes it.
// Each release adds a permit, potentially releasing a blocking acquirer.
// However, no actual permit objects are used; the Semaphore just keeps a count of the number available and acts accordingly.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

class Connection {// singleton

    private static Connection instance = new Connection();

    private Semaphore sem = new Semaphore(10, true);

    private int connections = 0;

    private Connection() {

    }

    public static Connection getInstance() {
        return instance;
    }

    public void connect() {
        try {
            sem.acquire();//decrement by 1
        } catch (InterruptedException e1) {

            e1.printStackTrace();
        }

        try {
            doConnect();
        } finally {

            sem.release();// increment by 1
        }
    }

    public void doConnect() {

        synchronized (this) {
            connections++;
            System.out.println("Current connections is: " + connections);
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (this) {
            connections--;
        }

    }
}

public class Semaphore1 {
    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newCachedThreadPool();//Creates a thread pool that creates new threads as needed,
        // but will reuse previously constructed threads when they are available.

        for (int i = 0; i < 200; i++) {
            executor.submit(new Runnable() {
                public void run() {
                    Connection.getInstance().connect();
                }
            });
        }

        executor.shutdown();

        executor.awaitTermination(1, TimeUnit.DAYS);
    }

}
