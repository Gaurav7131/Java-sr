//Convert Int to RomanLetter
public class IntToRomanRecursion {
    static String IntToRoman(int n) {
        int[] values = { 1000, 800, 700, 600 };
        String[] romanLetters = { "m", "k", "i", "u" };
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (n >= values[i]) {
                n -= values[i];
                sb.append(romanLetters[i]);

            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Dec to Roman is:" + IntToRoman(600));
    }

}