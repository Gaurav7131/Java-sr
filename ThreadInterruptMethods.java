class Waiter extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Work" + i);
        }

        if (Thread.currentThread().isInterrupted()) {
            System.out.println("Note 1(Unitnrer)" + Thread.currentThread().isInterrupted());
            System.out.println("Note 2(uninterpted" + Thread.currentThread().isInterrupted());
        }

        // interrupted-checked and desotry all evudence
        System.out.println("Note 3(interrpted" + Thread.interrupted());

        System.out.println("Note 4" + Thread.currentThread().isInterrupted());

    }
}

public class ThreadInterruptMethods {
    public static void main(String[] args) {
        Waiter w = new Waiter();
        w.start();

        System.out.println("Interrupt");
        w.interrupt();// stikcy notes

    }
}