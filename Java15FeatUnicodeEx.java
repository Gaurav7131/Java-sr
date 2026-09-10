public class Java15FeatUnicodeEx {
    public static void main(String[] args) {
        String ninja = "\uD83E\uDD77";// Ninja unicode
        System.out.println("Ninja Unicode:" + ninja);
        System.out.println("Character Defined:" + Character.isDefined(ninja.codePointAt(0)));

    }

}
