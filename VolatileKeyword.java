class SharedData {
    volatile boolean stopFlag = false;// volatile:if not used while loop unlimted
}

class VolatileKeword {
    public static void main(String[] args) throws InterruptedException {
        SharedData data = new SharedData();

        Thread t1 = new Thread(() -> {
            System.out.println("Worker started");
            while (!data.stopFlag) {
                // run unitl stopFlag becomes true;
            }
            System.out.println("Worker Stopped");
        });

        t1.start();

        Thread.sleep(1000);// main thread wait for 1 sec

        data.stopFlag = true;
        System.out.println("Main Thread changed flag");

    }
}