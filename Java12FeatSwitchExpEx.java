public class Java12FeatSwitchExpEx {
    public static void main(String[] args) {
        String day = "MON";// "":default

        // java 12--enable-preview replace switch exp. eliminated fall-through
        // break and return value through exp;replace break value with yield
        int letters = switch (day) {
            case "MON", "TUE", "WED" -> 6;
            case "THU" -> 7;
            case "FRI" -> 8;
            default -> 9;
        };
        System.out.println(letters);
    }
}
