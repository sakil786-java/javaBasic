package Thread;

import java.util.concurrent.ArrayBlockingQueue;

class ProducerExample implements Runnable {
    private ArrayBlockingQueue<Integer> queue;

    public ProducerExample(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                queue.put(ProducerConsumerExample.c++);
                System.out.println("Value add in the queue: " + ProducerConsumerExample.c);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ConsumerExample implements Runnable {
    private ArrayBlockingQueue<Integer> queue;

    public ConsumerExample(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
                queue.take();
                ProducerConsumerExample.c--;
                System.out.println("Value remove from the queue: " + ProducerConsumerExample.c);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumerExample {
    static int c = 0;

    public static void main(String[] args) {

        ArrayBlockingQueue<Integer> q = new ArrayBlockingQueue<>(10);
        ProducerExample produce = new ProducerExample(q);
        Thread producerThread = new Thread(produce);
        producerThread.start();
        ConsumerExample consume = new ConsumerExample(q);
        Thread consumerThread = new Thread(consume);
        consumerThread.start();


    }
}
