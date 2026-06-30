import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InvokeAllAnyEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService manager = Executors.newFixedThreadPool(3);// 3 thread

        // return something(h20)
        Callable<String> frd1 = () -> {
            Thread.sleep(1000);
            return "Moderate";
        };
        Callable<String> frd2 = () -> {
            Thread.sleep(500);
            return "fastest";// time
        };
        Callable<String> frd3 = () -> {
            Thread.sleep(2000);
            return "Slowst";
        };

        List<Callable<String>> frds = Arrays.asList(frd1, frd2, frd3);

        // invokeAny()
        String fastservice = manager.invokeAny(frds);
        System.out.println(" Got " + fastservice);

        manager.shutdown();
    }
}
