package Thread;

//Synchronized block
class Brakets3 {
    public void generate() {
        synchronized (this) {//this refers for current object
            for (int i = 0; i < 10; i++) {
                if (i <= 5)
                    System.out.print("[");
                else
                    System.out.print("]");
            }
        }
        System.out.println();
    }

}

public class Synchronization3 {
    public static void main(String[] args) {
        Brakets3 br = new Brakets3();
        //br.generate();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    br.generate();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    br.generate();
                }
            }
        }).start();

        // if we create two object synchronized method not work properly then we use synchronized block
        //synchronized block take less time then method
    }
}
