package Thread;

public class WaitAndNotify {
    static public int balance = 0;

    public void withdraw(int amount) {
        synchronized ((this)) {
            if (balance <= 0) {
                try {
                    System.out.println("Current balance:" + balance);
                    System.out.println("Waiting for balance updation");
                    wait();
                    System.out.println("Withdrow amount: " + amount);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        balance = balance - amount;
        System.out.println("Withdraw successful ,Now balance is:" + balance);
    }

    public void deposit(int amount) {
        System.out.println("Depositing amount :" + amount);
        balance = balance + amount;
        synchronized (this) {
            notifyAll();
        }
    }

    public static void main(String[] args) {
        WaitAndNotify obj1 = new WaitAndNotify();

        Thread t1 = new Thread((new Runnable() {
            @Override
            public void run() {
                obj1.withdraw(750);
            }
        }));
        t1.setName("Thread1");
        t1.start();

        Thread t2 = new Thread((new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                obj1.deposit(2000);
            }
        }));
        t2.setName("Thread2");
        t2.start();
    }
}
