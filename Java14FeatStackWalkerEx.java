public class Java14FeatStackWalkerEx {
    public static void main(String[] args) {
        Thread current = Thread.currentThread();
        try {
            current.countStackFrames();// deprecated since java 1.2 bcoz its inherenly prone to deadlock
        } catch (UnsupportedOperationException e)// java13
        {
            System.out.println("CounterFrames unconditionally throws:" + e.getClass().getSimpleName());
        }

        // Modern approach:stackwalker
        long walker = StackWalker.getInstance().walk(s -> s.count());
        System.out.println("Proper stackwalker frame count:" + walker);
    }
}
