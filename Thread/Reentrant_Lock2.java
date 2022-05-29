package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Reentrant_Lock2 {

    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(2);

            final Counter counter = new Counter();
            Runnable task1 = new Runnable() {

                public void run() {
                    for (int i = 1; i <= 1000; i++) {
                        counter.increment();
                    }
                }
            };

            Runnable task2 = new Runnable() {

                public void run() {
                    for (int i = 1; i <= 2000; i++) {
                        counter.increment();
                    }
                }
            };
            executorService.submit(task1);
            executorService.submit(task2);

            executorService.awaitTermination(3, TimeUnit.SECONDS);//Blocks until all tasks have completed execution after a shutdown request,
            // or the timeout occurs, or the current thread is interrupted, whichever happens first.
            System.out.println(counter.getCount());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (executorService != null)
                executorService.shutdown();
        }
    }

}

class Counter {
    private final Lock lock = new ReentrantLock();

    private int count = 0;

    // Thread Safe Increment
    public void increment() {
        lock.lock();
        try {
            count = count + 1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (lock != null) {
                lock.unlock();
            }
        }
    }

    public int getCount() {
        return count;
    }
}