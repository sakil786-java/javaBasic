package Thread;

import java.util.concurrent.Semaphore;

class Task3 implements Runnable {

    Semaphore sem = new Semaphore(2);//2 thread to execute concurrently.

    @Override
    public void run() {
        try {
            sem.acquire();
            System.out.println("Being Run By: " + Thread.currentThread().getName());
            for (int i = 0; i < 5; i++) {
                System.out.println("Running thread : " + Thread.currentThread().getName());
                Thread.sleep(500);
            }
            sem.release();// if we comment line release method then it should not go for third thread and deadlock condition
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


public class Semaphore3 {
    public static void main(String[] args) {
        Task3 task = new Task3();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");
        t1.start();
        t2.start();
        t3.start();
    }
}
