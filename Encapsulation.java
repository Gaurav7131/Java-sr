class Piggy {
    // hidden data
    private int balance = 0;

    /*
     * public method 1)addcoin only addcoin and checkbal permits rather than balance
     * access
     */
    public void addCoin(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Add" + amount + "Coins");
        }

    }

    // 2)checkbalace:check money
    public int checkbalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Piggy p = new Piggy();
        p.addCoin(10);

        // optional step
        p.checkbalance();
        System.out.println("Balaces is" + p + "");// it gives hashcode

    }
}