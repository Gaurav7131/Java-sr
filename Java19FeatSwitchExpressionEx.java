public class Java19FeatSwitchExpressionEx {
    public static String evaluate(Object obj) {
        return switch (obj) {
            case null -> "Null value Passed";
            case Integer i -> "Integer value:" + i;
            // Java 19:String s && s.length() replace with when clause|| &&~=when
            case String s when s.length() > 5 -> "Long String:" + s;
            default -> "Unknown Type" + obj.getClass().getPackageName();
        };
    }

    public static void main(String[] args) {
        System.out.println(evaluate(null));
        System.out.println(evaluate(12));
        System.out.println(evaluate("Adoptium JDK"));
    }
}
