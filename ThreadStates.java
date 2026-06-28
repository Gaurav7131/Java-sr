public class ThreadStates {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);// TIME-WAITIG

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Get State:" + t1.getState());// new state->Before start(),new obj created,wait for start()

        t1.start();
        System.out.println("Get state:" + t1.getState());// Invoked runnable(runing),inside run()

        Thread.sleep(500);// main thread wait so that t1 sleeps
        System.out.println("Get state:" + t1.getState());

        t1.join();// wait for t1 to realese res/lock
        System.out.println("Get state:" + t1.getState());// terminated out of run()
    }
}
