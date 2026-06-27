class BankAccount {
    int balance = 0;

    // method-process if we add synchronized here we can fix this issue
    public void deposit() {
        balance++;// it performs 3 ops simulatneosly(concurently):checkbal,add 1 , saved_bal

    }
}

// runnable creat thread
class BrotherTask implements Runnable {
    BankAccount account;

    // 2 thread that works on same BankAccount
    BrotherTask(BankAccount account) {
        this.account = account;
    }

    // task=process
    public void run() {
        // every thread add 1 1000x
        for (int i = 0; i < 100; i++) {
            account.deposit();
        }

    }

}

public class ConcurrentCollision {
    public static void main(String[] args) throws InterruptedException {
        BankAccount ba = new BankAccount();

        // 2 thread works on same Bankacount
        Thread t1 = new Thread(new BrotherTask(ba));
        Thread t2 = new Thread(new BrotherTask(ba));

        t1.start();
        t2.start();

        // same ops stopat same time
        t1.join();
        t2.join();

        System.out.println("Final Check:" + ba.balance);// it will gives wrong & direct anwer everytime

    }

}
