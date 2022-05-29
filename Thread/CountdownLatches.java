package Thread;
// CountdownLatches locking mechanism
//it is a kind of synchronizer which allows one thread to wait for one or more threads before starts processing

import java.util.concurrent.CountDownLatch;

class SomeThread1 extends Thread {
    private CountDownLatch latch;

    public SomeThread1(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Thread running with thread name " + Thread.currentThread().getName());
        System.out.println("Thread execution completed");
        System.out.println("*************************");
        latch.countDown();// unfold the latch one time
    }

}

public class CountdownLatches {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(4);
        SomeThread1 thread1 = new SomeThread1(latch);
        SomeThread1 thread2 = new SomeThread1(latch);
        SomeThread1 thread3 = new SomeThread1(latch);
        SomeThread1 thread4 = new SomeThread1(latch);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


        try {
            latch.await();//await method is force to main method to wait until lock is release...
            // Causes the current thread to wait until the latch has counted down to zero, unless the thread is interrupted.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I am in main thread");
    }

}

