import java.util.concurrent.TimeUnit;

public class ThreadTimeunit {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sleeping for 3 seconds.");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Wakes up");

    }
}
