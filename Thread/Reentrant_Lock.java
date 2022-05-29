package Thread;
// We can manually lock and unlock the thread for better control.
// prevent Deadlock by using re entrant lock

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Reentrant_Lock {
    static int counter4 = 0;
    static Lock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();//re entrant lock apply..single thread executed unless we call the unlock method.
                for (int i = 1; i <= 1000; i++) {
                    Reentrant_Lock.counter4++;
                }
                lock.unlock();//Releases the lock.
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                for (int i = 1; i <= 1000; i++) {
                    Reentrant_Lock.counter4++;
                }
                lock.unlock();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("The final value of counter is: " + Reentrant_Lock.counter4);
    }
}
