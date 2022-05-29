package Thread;

import static java.lang.Thread.sleep;

class MyCounter extends Thread
{
   private int threadNo;

    public MyCounter(int threadNo) {
        this.threadNo = threadNo;
    }
    public void run()
    {
        countMe();
    }


    public void countMe() {
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println("The value of i is "+i+" and the thread no.is "+threadNo);
        }
    }

}

public class Demo1 {
    public static void main(String[] args) {

        MyCounter c1=new MyCounter(1);
        MyCounter c2=new MyCounter(2);
        long startTime=System.currentTimeMillis();

        c1.start();
        System.out.println("________________");
        c2.start();
        long endTime=System.currentTimeMillis();
        System.out.println("Total Time: "+(endTime-startTime));

    }
}
