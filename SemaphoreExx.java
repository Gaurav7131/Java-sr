import java.util.concurrent.Semaphore;

public class SemaphoreExx {
    public static void main(String[] args) throws InterruptedException {
        Semaphore sp = new Semaphore(2);// 2 cars only

        Runnable car = (() -> {
            try {
                System.out.println(Thread.currentThread().getName() + "Looking for parking");
                sp.acquire();// request a permit
                System.out.println(Thread.currentThread().getName() + "Parked ");

                Thread.sleep(1000);// wait for 1 sec
                System.out.println(Thread.currentThread().getName() + "Left");
                sp.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        for (int i = 1; i <= 4; i++) {
            new Thread(car, "Porsche" + i).start();
        }
    }
}
