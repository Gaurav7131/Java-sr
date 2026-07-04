public class MigrationStategies {
    // 1. Define tokens at the class level (Best Practice)
    public static final ThreadLocal<String> THREAD_LOCAL_TOKEN = new ThreadLocal<>();
    public static final ScopedValue<String> SCOPED_TOKEN = ScopedValue.newInstance();

    public static void main(String[] args) {

        System.out.println("--- BEFORE: Legacy ThreadLocal ---");
        THREAD_LOCAL_TOKEN.set("XYZ-TOKEN-OLD");
        try {
            callDatabaseLegacy();
        } finally {
            // Prone to memory leaks if developers forget this!
            THREAD_LOCAL_TOKEN.remove();
        }
        System.out.println("Token after remove: " + THREAD_LOCAL_TOKEN.get());

        System.out.println("\n--- AFTER: Modern Scoped Values ---");
        // Automatically cleaned up after the runnable completes!
        ScopedValue.where(SCOPED_TOKEN, "XYZ-TOKEN-NEW").run(() -> {
            callDatabaseScoped();
        });

        // Trying to access SCOPED_TOKEN.get() here would throw a NoSuchElementException
        // because it is safely unbound outside the scope.
        System.out.println("Scoped operation completed successfully.");
    }

    // Dummy method to simulate database call using ThreadLocal
    private static void callDatabaseLegacy() {
        String token = THREAD_LOCAL_TOKEN.get();
        System.out.println("Authenticating DB with Legacy Token: " + token);
    }

    // Dummy method to simulate database call using ScopedValue
    private static void callDatabaseScoped() {
        String token = SCOPED_TOKEN.get();
        System.out.println("Authenticating DB with Scoped Token: " + token);
    }
}