package Thread;


public class Join2 {
    public int counter2=0;
    public static void main(String[] args) {
        Join2 j2=new Join2();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++)
                {
                    j2.counter2++;
                }

            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t1.join();// thread 2 will wait for thread 1....1st thread1 execute then
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for(int i=0;i<1000;i++)
                {
                    j2.counter2++;
                }

            }
        });
        t1.start();
        t2.start();
        try {
            t2.join();//main thread will wait for thread 2
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The value of counter2: "+j2.counter2);
    }
}