package Thread;

class Customer {
    int balance = 10000;

    synchronized void withdraw(int amount) {
        System.out.println("Withdraw....");
        if (balance < amount) {
            System.out.println("Less Balance ,Wait for deposit,Current Balance is:" + balance + " and You want to withdraw " + amount);

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        balance = balance - amount;
        System.out.println(amount + " Withdraw Completed..");
        System.out.println(balance + " Current Balance: ");
    }

    synchronized void deposit(int amount) {
        System.out.println("Going for deposit..");
        balance = balance + amount;
        System.out.println(amount + " Deposit complete");
        notify();
    }

}


public class WaitAndNotifyExampl {
    public static void main(String[] args) {
        Customer c = new Customer();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                c.withdraw(15000);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                c.deposit(25000);
            }
        });

        t1.start();
        t2.start();

    }
}
