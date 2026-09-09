//Historically,even after Thread.isAlive==false if we called them it yields inconsistent thread state.but java 13 promotos even though we know that thread is terminated we want to know isAlive==false then Thread.isInterrupted is used without halting thread life cycle.
public class Java14FeatInterruptedThreadEx {
    public static void main(String[] args) throws Exception {
        Thread worker = new Thread(() -> {
            System.out.println("Worker Executed");
        });

        worker.start();
        worker.join();// wait for thread to finished

        // Acccessing the thread state whether it is terminated or isalive
        System.out.println("is Worker Alive:" + worker.isAlive());// false

        // interrupting terminated thread and querying its state
        // Promotes Java13:Thread.isInterrupted())
        worker.interrupt();// interrupted
        System.out.println("Thread interrupted:" + worker.isInterrupted());// true
    }
}
