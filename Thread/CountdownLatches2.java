package Thread;
// https://youtu.be/59oQfkdn5mA
/*
Once Development team work is finshed then Quality assurance team get the chance.
we can achieve through the join method.but using join method cant achieve through the two scenarios.
when we use Executaor servive instead of thread class we cant use join method.

****       Join Vs CountdownLatch
Thread join method waits for other thread to finish before further executing current thread.
If t1.join is called in main thread, then main thread will wait at that point until t1 finishes its job.

CountDownLatch on the other end wait for its counter to reach 0 before executing current thread.
When latch.countDown is called, associated counter will be decremented and as soon as it reaches 0,
main thread which was blocked at line latch.await() proceeds further.

We can call join method when we have control over the threads but while using ExecutorService
 we don't have control over individual threads instead we deal with just submitting the task to framework
  and it internally manages threads in this situation using CountDownLatch is right approach.

Example above in difference 1 can be used as Reference
Example 1:
CountDownLatch is useful in Multiplayer games, Lets say we have a online chess game that can only be played when two player joins, in this case we will initialize the CountDownLatch to 2 and starts the game only after 2 threads(player) joins(calls countDown()).



 */

import java.util.concurrent.CountDownLatch;

public class CountdownLatches2 {
    public static void main(String[] args) throws InterruptedException {
        //Created CountDownLatch for 2 threads
        CountDownLatch countDownLatch = new CountDownLatch(2);

        //Created and started two threads
        DevTeam teamDevA = new DevTeam(countDownLatch, "dev-A");
        DevTeam teamDevB = new DevTeam(countDownLatch, "dev-B");

        teamDevA.start();
        teamDevB.start();

        //When two threads(dev-A and dev-B)completed tasks are returned
        countDownLatch.await();

        //Now execution of thread(QA team) started..
        QATeam qaTeam = new QATeam("QA team");
        qaTeam.start();
    }
}

class DevTeam extends Thread {
    private CountDownLatch countDownLatch;

    public DevTeam(CountDownLatch countDownLatch, String name) {
        super(name);
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Task assigned to development team " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Task finished by development team " + Thread.currentThread().getName());

        //Each thread calls countDown() method on task completion.
        countDownLatch.countDown();//when it will be 0 then call the QA team
    }
}

class QATeam extends Thread {

    public QATeam(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Task assigned to " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Task finished by " + Thread.currentThread().getName());
    }
}