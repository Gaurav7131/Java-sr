import java.util.concurrent.Phaser;

public class PhaserEx {
    public static void main(String[] args) {
        Phaser p = new Phaser(1);// register main thread

        Runnable task = (() -> {
            p.register();// dyanmically register new thread
            System.out.println(Thread.currentThread().getName() + "completed L1");
            p.arriveAndAwaitAdvance();

            System.out.println("Complete l2");
            p.arriveAndDeregister();// leave the game
        });

        new Thread(task, "Player1").start();
        new Thread(task, "Player2").start();

        // main thread wait and advances
        p.arriveAndAwaitAdvance();// end of l1
        System.out.println("Level 1 Completed");

        p.arriveAndAwaitAdvance();// end of l2
        System.out.println("Level 2 completed");

        p.arriveAndDeregister();

    }
}