public class ThreadGroupInterruptExample {
    public static void main(String[] args) {

        // 1. taskgroup
        ThreadGroup tg = new ThreadGroup("Developers Group");

        // 5.task
        Runnable task = () -> {
            String name = Thread.currentThread().getName();
            try {
                while (true) {
                    System.out.println(name + " is writing code...");
                    Thread.sleep(1000); // writing code after 1 sec
                }
            } catch (InterruptedException e) {
                // when tg stop, threads will come here
                System.out.println(" this " + name + " was INTERRUPTED! Stopping work.");
            }
        };

        // 2.create thread(worker) & add in tg
        Thread t1 = new Thread(tg, task, "Dev-1");
        Thread t2 = new Thread(tg, task, "Dev-2");
        Thread t3 = new Thread(tg, task, "Dev-3");

        // 3. start
        t1.start();
        t2.start();
        t3.start();

        // 6.Manager wait for 3 sec to finish thier stuff
        try {
            System.out.println(" Manager: Let them work for 3 seconds...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 4. on click stop all interrupt()
        System.out.println(" Manager: STOP WORKING! Interrupting the whole group...");
        tg.interrupt();// one click stop all
    }
}