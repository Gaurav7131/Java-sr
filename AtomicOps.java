import java.util.concurrent.atomic.AtomicInteger;

class AtomicEx {
    AtomicInteger a = new AtomicInteger(0);

    public void increment() {
        a.incrementAndGet();// one shot dont need lock
    }
}

public class AtomicOps {
    public static void main(String[] args) {
        AtomicEx ex = new AtomicEx();

        Thread t1 = new Thread(() -> {
            ex.increment();
        });

        t1.start();

        System.out.println("atomic ops:" + t1);

    }
}