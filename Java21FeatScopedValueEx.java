public class Java21FeatScopedValueEx {
    // A lightweight, immutable alternative to ThreadLocal that allows sharing
    // bounded, read-only data across child threads and scopes without memory leaks
    public static ScopedValue<String> USER_ID = ScopedValue.newInstance();

    public static void main(String[] args) {
        ScopedValue.where(USER_ID, "user_1213").run(() -> {
            System.out.println("Current Respective User:" + USER_ID.get());
        });

    }
}
