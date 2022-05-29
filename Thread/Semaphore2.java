package Thread;
//Synchronized could be used when only 1 thread wants to execute a code at the same time
//if the number of concurrent threads executing the same piece of code>1 time then use Semaphore

import java.util.concurrent.Semaphore;

class Task implements Runnable {

    Semaphore sem = new Semaphore(1);//1 thread to execute concurrently.

    @Override
    public void run() {
        try {
            sem.acquire();
            System.out.println("Being Run By: " + Thread.currentThread().getName());
            for (int i = 0; i < 5; i++) {
                System.out.println("Running thread : " + Thread.currentThread().getName());
                Thread.sleep(500);
            }
            sem.release();// if we comment line release method then it should not go for second thread and deadlock condo=ition
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


public class Semaphore2 {
    public static void main(String[] args) {
        Task task = new Task();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t1.start();
        t2.start();
    }
}
