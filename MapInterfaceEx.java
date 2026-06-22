import java.util.HashMap;
import java.util.Map;

public class MapInterfaceEx {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();

        // add element in Map:put
        m.put(101, "Ajay");
        m.put(102, "Vijay");
        m.put(103, "Sanjay");

        System.out.println("Total:" + m);

        // Method:checkKey:true/F check whether the key is present or not
        System.out.println("Check:" + m.containsKey(101));
        // get
        System.out.println("get:" + m.get(103));

        // Iteration> and Map.entry gets entire row of rollno and Name from entire MAp
        for (Map.Entry<Integer, String> r : m.entrySet()) {
            System.out.println(" RollNo: " + r.getKey() + " Value: " + r.getValue());
        }

    }
}
