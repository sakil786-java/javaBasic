package Thread;
//Synchronized method
class Brakets
{
   synchronized public void generate()
    {
        for(int i=0;i<10;i++)
        {
            if(i<=5)
                System.out.print("[");
            else
                System.out.print("]");
        }
        System.out.println();
    }

}
public class Synchronization2 {
    public static void main(String[] args) {
        Brakets br=new Brakets();
        //br.generate();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++)
                {
                    br.generate();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++)
                {
                    br.generate();
                }
            }
        }).start();

        // if we create two object synchronized method not work properly
    }
}
