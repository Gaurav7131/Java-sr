public class SetPriorityThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Thread1"), "T1");
        Thread t2 = new Thread(() -> System.out.println("VIP Thread"), "T2");

        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);// vip will execute first depends on os

        t1.start();
        t2.start();
    }

}
