import java.util.LinkedHashMap;

public class InsertnAccessOrderEx {
    public static void main(String[] args) {
        // while access order we want:(initial capacity,load factor,Acccessrder=true)
        LinkedHashMap<String, String> book = new LinkedHashMap<>(16, 0.75f, true);

        book.put("Math", "Math's book:");
        book.put("Physics", "Physics's book:");
        book.put("Chemistry", "Chemistry's book:");

        System.out.println("All Book:" + book.keySet());// o/p:Math,Physics,Chemistry

        // I access only math then
        book.get("Math");

        System.out.println("Order:" + book.keySet());// o/p:Physics,Chemistry.Math >> Placed at the last(latest)
    }
}
