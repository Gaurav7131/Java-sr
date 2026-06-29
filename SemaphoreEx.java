import java.util.concurrent.Semaphore;

class MallParking {
    // (3 Permits)
    Semaphore parkingSlots = new Semaphore(3);// get 3 parkpermit

    public void parkCar() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting outside...");

            // (Acquire Permit)
            parkingSlots.acquire();
            System.out.println(" " + Thread.currentThread().getName() + " PARKED the car. (Permits left: "
                    + parkingSlots.availablePermits() + ")");

            // wait for 2 sec
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // (Release Permit)
            System.out.println(" " + Thread.currentThread().getName() + " LEFT the parking.");
            parkingSlots.release();
        }
    }
}

class SemaphoreEx {
    public static void main(String[] args) {
        MallParking m = new MallParking();
        // we want to test 5 car to park
        for (int i = 1; i <= 5; i++) {

            Thread t1 = new Thread(() -> {
                m.parkCar();
            });

            t1.start();

        }

    }
}