package Thread;

// if we create two object synchronized method not work properly
// thats why we use static Synchronization
class Brakets4 {
    synchronized public void generate() {
        for (int i = 0; i < 10; i++) {
            if (i <= 5)
                System.out.print("[");
            else
                System.out.print("]");
        }
        System.out.println();
    }

}

public class Synchronization4 {
    public static void main(String[] args) {
        Brakets4 br1 = new Brakets4();
        Brakets4 br2 = new Brakets4();
        //br.generate();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    br1.generate();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    br2.generate();
                }
            }
        }).start();


    }
}
/*

[[[[[[]]]]
[[[[[[]]]]
[[[[[[[[[[[[]]]]
[[[[[[]]]]
[[[[[]]]][]]]]
[[[[
[[[[[[]]]]
[[[[[[]]]]
[[]]]]
[[[[[[]]]]
 */