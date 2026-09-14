public class Java18FeatSwitchPatternObjectEx {
    /*
     * Java 18:switch pattern matching allows switching directly on Object types
     * with built type-casting inside case label,handling null values
     * explicitly,using guarded pattern(&& and when)
     */
    public static String processValue(Object obj) {
        return switch (obj) {

            case null -> "Null Value Passed";
            case Integer i -> "Integer Value:" + i;
            case String s -> "String length:" + s;
            case Double d -> "Double precision:" + d;
            default -> "Unknown Type:" + obj.toString();
        };
    }

    public static void main(String[] args) {
        System.out.println(processValue(12));
        System.out.println(processValue("Gaurav Thakare Java18"));
        System.out.println(processValue(null));// case null
    }
}
