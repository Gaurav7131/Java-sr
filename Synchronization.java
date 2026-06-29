class Atm {
    public void useAtm() {
        // unsynchronized no lock-concurency possible if we use synchronized before void
        // in method then one at a time
        System.out.println(Thread.currentThread().getName() + "is outside");

        // synchrinied(lock) on this block only 1 at a time
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + "is using");
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println("Interupted thread" + e);
            }
            System.out.println(Thread.currentThread().getName() + "came out");

        }
    }
}

class Synchronization {
    public static void main(String[] args) {
        Atm atm = new Atm();

        Thread t1 = new Thread(() -> {
            atm.useAtm();
        });

        Thread t2 = new Thread(() -> {
            atm.useAtm();
        });
        t1.start();
        t2.start();
    }
}