
public class DeadlockEx {
    static final Object BAT = new Object();
    static final Object BALL = new Object();

    public static void main(String[] args) {
        // Thread 1:t1
        Thread t1 = new Thread(() -> {
            synchronized (BAT) {
                System.out.println("BAt locked");

                try {

                    Thread.sleep(1000);
                } catch (Exception e) {

                }
                synchronized (BALL) {
                    System.out.println("BAll locked- Playing");
                }
            }
        });

        // Thread2:t2
        Thread t2 = new Thread(() -> {
            // BAT<>BALL to avoid deadlock
            synchronized (BALL) {
                System.out.println("BAt locked");

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }
                // BAT<>BALL to avoid deadlock
                synchronized (BAT) {
                    System.out.println("Ball locked-Playing");
                }
            }

        });

        t1.start();
        t2.start();

    }
}
