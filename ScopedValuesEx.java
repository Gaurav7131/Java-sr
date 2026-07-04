public class ScopedValuesEx {
    @SuppressWarnings("preview")
    // 1. Create a Scoped Value
    public static final ScopedValue<String> USER = ScopedValue.newInstance();

    public static void main(String[] args) {
        // 2. Bind a value to a specific scope and run the task
        ScopedValue.where(USER, "Rahul_30LPA").run(() -> {
            // Inside this scope, USER value is accessible
            processUser();
        });
        // Outside the run() block, USER value does not exist!
    }

    public static void processUser() {
        // Read the value seamlessly without passing it in method parameters
        System.out.println("Working securely for: " + USER.get());
    }
}