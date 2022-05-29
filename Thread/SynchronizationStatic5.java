package Thread;
//Static Synchronization

class Brakets5 {
    synchronized static public void generate(String threadCode) {
        for (int i = 1; i <= 10; i++) {
            if (i <= 5) {
                System.out.print("[");
            } else {
                System.out.print("]");
            }
        }
        System.out.println("Generated by thread: " + threadCode);
    }

}

public class SynchronizationStatic5 {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    Brakets5.generate("Thread 1");
                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    Brakets5.generate("Thread 2");
                }

            }
        }).start();


    }

}