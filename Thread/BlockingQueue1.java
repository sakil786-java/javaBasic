package Thread;
// BlockingQueue nothing but a thread safe collection
// producer consumer Problem


import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable{
    private ArrayBlockingQueue<Integer> queue;

    public Producer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true)
        {
            try {
                Thread.sleep(1000);
                queue.put(BlockingQueue1.counter3++);
                System.out.println("Value added in the queue: "+BlockingQueue1.counter3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable{
    private ArrayBlockingQueue<Integer> queue;

    public Consumer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true)
        {
            try {
                Thread.sleep(5000);
                queue.take();
                BlockingQueue1.counter3--;
                System.out.println("Value remove from the queue: "+BlockingQueue1.counter3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class BlockingQueue1 {
    static int counter3=0;
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue=new ArrayBlockingQueue<>(10);
        Producer produce=new Producer(queue);
        Thread producerThread=new Thread(produce);
        producerThread.start();

        Consumer consume=new Consumer(queue);
        Thread consumerThread=new Thread(consume);
        consumerThread.start();
    }
}
