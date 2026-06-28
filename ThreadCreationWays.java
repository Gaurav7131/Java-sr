import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread extends Thread {
    public void run() {
        System.out.println("Extending Thread:");
    }
}

// runnable
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Implementing Runnable:");
    }
}

public class ThreadCreationWays {
    public static void main(String[] args) {
        // way1:Exteding Thread
        Thread t1 = new MyThread();// new MyThread
        t1.start();

        // way2:implementing Runnable
        Thread t2 = new Thread(new MyRunnable());
        t2.start();

        // way3:Lambda Expression
        Thread t3 = new Thread(() -> System.out.println("Lambda Expression:"));
        t3.start();

        // way4:anonymous class-no name
        Thread t4 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Anonomous Thread");
            }
        });
        t4.start();

        // way5:Executor(Thread Pool Manager)
        ExecutorService ex = Executors.newSingleThreadExecutor();
        ex.execute(() -> System.out.println("Executor:"));
        ex.shutdown();

    }

}
