package Thread;
//Multiple Thread are working on Common Data there may be some inconsistency
public class Synchronization {
    public static int counter=0;
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++)
                {
                    Synchronization.counter++;
                }
                System.out.println("Thread 1 loop end here");
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++)
                {
                    Synchronization.counter++;
                }
                System.out.println("Thread 2 loop end here");
            }
        });
        t1.start();
        t2.start();
        Thread.sleep(500);
        System.out.println("The value of Counter :"+Synchronization.counter);

    }
}
