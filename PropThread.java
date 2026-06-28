public class PropThread {
    public static void main(String[] args) {
        // thread
        Thread worker = new Thread(() -> System.out.println("Worker start doing their job"));
        worker.start();

        // Name
        worker.setName("Alexa");
        System.out.println("Name:" + worker.getName());

        // id
        System.out.println("ID:" + worker.threadId());// getID deprecated and we cant set id it has been set by java

        // Priority
        worker.setPriority(10);
        System.out.println("Priority:" + worker.getPriority());

        // daomon-bg cleaner
        worker.setDaemon(true);
        System.out.println("Daemon:" + worker.isDaemon());

    }

}
