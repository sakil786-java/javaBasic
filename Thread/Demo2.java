package Thread;
class MyCounter2 implements Runnable {
    private int threadNo;

    public MyCounter2(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        for(int i=0;i<=9;i++)
        {
            System.out.println("The value of i is "+i+" and the thread no.is "+threadNo);
        }
    }
}
public class Demo2 {
    public static void main(String[] args) {
        /*
        Thread t1=new Thread(new MyCounter2(1));
        Thread t2=new Thread(new MyCounter2(2));
        t1.start();
        t2.start();
         */
        //Annoynoumus class
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++)
                {
                    System.out.println(i);
                }
            }
        }).start();

    }
}
