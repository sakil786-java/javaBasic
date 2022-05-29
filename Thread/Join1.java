package Thread;

public class Join1 {
    public int counter=0;
    public static void main(String[] args) {
        Join1 j1=new Join1();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++)
                {
                    j1.counter++;
                }

            }
        });
        t1.start();
        try {
            t1.join();//main thread will wait until complete the t1 executaion
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The value of counter: "+j1.counter);
    }
}
