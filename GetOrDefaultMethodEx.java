import java.util.HashMap;

public class GetOrDefaultMethodEx {
    public static void main(String[] args) {

        // Fruit array
        String[] bag = { "Apple", "Banana", "Apple", "Mango", "Banana", "Apple" };

        // For Counting Fruits
        HashMap<String, Integer> fruitCount = new HashMap<>();

        for (String fruit : bag) {

            // if had fruit add oldcount,else 0 aand write 1 into Hashmap
            fruitCount.put(fruit, fruitCount.getOrDefault(fruit, 0) + 1);
        }
        // final result print
        System.out.println("Total:" + fruitCount); // Total:{Apple=3, Mango=1, Banana=2}
    }
}