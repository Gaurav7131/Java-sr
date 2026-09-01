//Clarifies the intent and timeline of deprecated APIs. since indicates when it was marked, and forRemoval = true warns that the API will be deleted in a future release.
public class DeprecationDemo {
    @Deprecated(since = "9", forRemoval = true)
    public void legacyMethod() {
        System.out.println("Legacy methods");
    }

    public static void main(String[] args) {
        DeprecationDemo demo = new DeprecationDemo();
        demo.legacyMethod();

    }
}
