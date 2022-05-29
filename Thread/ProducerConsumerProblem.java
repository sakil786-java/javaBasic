package Thread;

import java.util.concurrent.ArrayBlockingQueue;

// BlockingQueue nothing but a thread safe collection
// producer consumer Problem


class Producer1 implements Runnable {
    private ArrayBlockingQueue<Integer> queue;

    public Producer1(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                queue.put(ProducerConsumerProblem.counter3++);
                System.out.println("Value added in the queue: " + ProducerConsumerProblem.counter3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer1 implements Runnable {
    private ArrayBlockingQueue<Integer> queue;

    public Consumer1(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
                queue.take();//Retrieves and removes the head of this queue.
                ProducerConsumerProblem.counter3--;
                System.out.println("Value remove from the queue: " + ProducerConsumerProblem.counter3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumerProblem {
    static int counter3 = 0;

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

        Producer1 produce = new Producer1(queue);
        Thread producerThread = new Thread(produce);
        producerThread.start();

        Consumer1 consume = new Consumer1(queue);
        Thread consumerThread = new Thread(consume);
        consumerThread.start();
    }
}
