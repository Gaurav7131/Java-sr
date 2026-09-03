public class Java11featStrMethodsEx {
    public static void main(String[] args) {
        // 1.isBlank vs isEmpty()
        System.out.println(" ".isBlank());// true bcz its contains invisible spaces
        System.out.println(" ".isEmpty());// false fully empty

        // strip():both ends,stripLeading():front,stripTrailing():end
        String padded = " \u2026 Hello Gaurav  ";
        System.out.println("'" + padded.strip() + "'");
        System.out.println("'" + padded.stripLeading() + "'");
        System.out.println("'" + padded.stripTrailing() + "'");

        // repeat(n):repeat n times
        System.out.println("java".repeat(3));

        // lines
        String multiLines = "Line1 \nLine2 \nLine3";
        multiLines.lines().forEach(System.out::println);
    }
}
