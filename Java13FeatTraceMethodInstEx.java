public class Java13FeatTraceMethodInstEx {
    public static void main(String[] args) {

        long s = Runtime.getRuntime().traceMethods(true);// deprecated since java 13
        System.out.println("Invoking traceMethods,traceInstruction:" + s);
    }
}
