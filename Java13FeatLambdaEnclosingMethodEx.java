public class Java13FeatLambdaEnclosingMethodEx {
    public static void main(String[] args) {
        Runnable r = () -> {
            // local class inside lambda exp
            class LocalHelperEx {
                void greet() {
                    System.out.println("Say hello to Everybody:)");
                }
            }
            LocalHelperEx helperEx = new LocalHelperEx();
            helperEx.greet();

            // Reflectively inspecting EnclosingMethod:javac produces metadata,reject
            // corrupted class files
            System.out.println("Enclosing Method:" + helperEx.getClass().getEnclosingMethod());
            System.out.println("Enclosing Class:" + helperEx.getClass().getEnclosingClass().getSimpleName());
        };
        r.run();

    }
}
