class BankAccount {
    int balance = 100;

    // synchronized-key:withdraw money one at a time
    public synchronized void withdraw(int amount, String person) {
        if (balance >= amount) {
            System.out.println("Withdrawing:" + amount + " Rs.");
            balance = balance - amount;
            System.out.println("Remaining balance:" + balance + " Rs.");
        } else {
            System.out.println("Insufficient Rs." + person);
        }
    }
}

public class ThreadSyncro {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.withdraw(10, "Ram");// i/p10
        System.out.println(b);

    }
}
