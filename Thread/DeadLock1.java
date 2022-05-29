package Thread;
//How Deadlock Occur
public class DeadLock1 {


    public static void main(String[] args) {
        String lock1 = "lock1";
        String lock2 = "lock2";
        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {

                synchronized (lock1) {
                    System.out.println("Inside thread1 on lock 1");
                    synchronized (lock2) {
                        System.out.println("Inside thread1 on lock 2");
                    }
                }


            }
        });

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                synchronized (lock2) {
                    System.out.println("Inside thread2 on lock 2");
                    synchronized (lock1) {
                        System.out.println("Inside thread2 on lock 1");
                    }
                }

            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Inside main method");

    }

}
// Here synchronized block executed but two different object lock .thats why they got executed simultaneously,till the time they dont share
//common lock; when thread1 lock2 wants to execute but thread2 hold lock1,same as thread 2
