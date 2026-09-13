import java.util.TreeMap;

public class Java17FeatComputeIfAbsentResolnEx {
    public static void main(String[] args) {

        TreeMap<String, String> map = new TreeMap<>();
        map.put("token", null);// key present but value is null

        // Java 17:computeIfAbsent detects the null value and evaluates the lambda
        map.computeIfAbsent("token", k -> "Token_XYZ");

        System.out.println("Resolved Value:" + map.get("token"));// Token_XYZ

    }
}
