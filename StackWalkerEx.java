//StackWalker:A lazy, efficient stream-based replacement for Throwable.getStackTrace(), allowing filtering and skipping stack frames without capturing the entire stack.
public class StackWalkerEx {
    public static void main(String[] args) {

        StackWalker walker = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE);
        walker.walk(frames -> frames.filter(f -> f.getMethodName().startsWith("main")).findFirst())
                .ifPresent(f -> System.out.println("Frame:" + f.getClassName() + " \swith:" + f.getMethodName()));

    }
}
