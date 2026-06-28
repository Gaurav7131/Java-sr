public class ThreadRunMethod implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread going to sleep");
            Thread.sleep(1);// throws checked exception
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public static void main(String[] args) {
        new Thread(new ThreadRunMethod()).start();

    }
}
