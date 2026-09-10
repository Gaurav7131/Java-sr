import java.util.TreeMap;

public class Java15FeatTreeMethodsEx {
    public static void main(String[] args) {
        TreeMap<String, Integer> ex = new TreeMap<>();
        ex.put("Metrics", 100);
        ex.put("Audit", 1);
        ex.put("Logs", 2);

        ex.computeIfPresent("Metrics", (k, v) -> v + 50);// if present compute it
        ex.merge("AuditsLogs", 3, (k, v) -> k + v);

        System.out.println(ex.containsValue(150));// true
        ex.compute("Audit,Logs", (k, v) -> 1 + 1);// ops

        ex.putIfAbsent("Latency", 200);// if absent add(put)

        System.out.println("Updated Treemap:" + ex);
    }
}
