public class Java13FeatSwitchYieldEx {
    public static void main(String[] args) {
        String day = "THU";// "SAT,SUN"

        // switch yield: return values
        int workHr = switch (day) {
            case "MON", "FRI" -> 8;
            case "TUE", "WED", "THU" -> {
                System.out.println("Detected Working Day:" + day);
                yield 9;// java 13:eliminate break loop confused and return value
            }
            case "SAT", "SUN" -> 0;
            default -> throw new IllegalArgumentException("Unknow Day:" + day);
        };
        System.out.println("Assigned Work hours:" + workHr);
    }
}
