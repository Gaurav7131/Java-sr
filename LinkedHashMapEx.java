import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> h = new LinkedHashMap<>();
        h.put(95, "Math");// 1
        h.put(97, "Physics");
        h.put(99, "Chemistry");// n

        System.out.println("Linkedhashmap:" + h);// 0/p:Perist as it is in which order got enters remainas it
                                                 // is:Math,PHysics,Chemistry
    }

}
