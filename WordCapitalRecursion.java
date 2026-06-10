//First word capital while rest character at attached to it as it is.
public class WordCapitalRecursion {

    // recursive method
    static String WordCapital(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        // base condn
        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println("First Letter is:");
        System.out.println(WordCapitalRecursion.WordCapital("capital of india is delhi"));

    }
}