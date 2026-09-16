public class Java20FeatScopedValueEx {
    public static final ScopedValue<String> CURRENT_USER = ScopedValue.newInstance();

    public static void main(String[] args) {
        // Strictly bind "value" for the duration of lambda
        ScopedValue.where(CURRENT_USER, "Gaurav").run(() -> {
            serverRequest();
        });
        // current_user scope is no longer accessible outside the block
    }

    // serverRequest()
    static void serverRequest() {
        System.out.println("Processing User request:" + CURRENT_USER.get());
    }
}
