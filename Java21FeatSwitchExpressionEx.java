public class Java21FeatSwitchExpressionEx {
    public static String switchExp(Object obj) {
        return switch (obj) {
            case null -> "Null Value Passed";
            case Integer i -> "Integer Value:" + (i * 2);
            case Long l -> "Long Value:" + l.toOctalString(20);
            case String s when s.length() > 5 -> "String:" + s.toUpperCase();
            case String ss -> "Short String:" + ss.toLowerCase();
            default -> "Unknown Type:" + obj.getClass().getPackageName();
        };
    }

    public static void main(String[] args) {
        System.out.println(switchExp(10));// Integer Value:10*2=20
        System.out.println(switchExp(2000));// 20
        System.out.println(switchExp("Gaurav"));// String
        System.out.println("Gpt");
        System.out.println(switchExp(null));

    }
}
