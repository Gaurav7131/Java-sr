
public class JavaInterface {

    interface Vehicle {
        void drive();// only one abstact method

        // default implementation:java 8 features
        default void accelerate() {
            System.out.println("Accelerating");
        }

        // static implementation:utiliy method bind directly to interface
        static void run() {
            System.out.println("running");
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle() {

            @Override
            public void drive() {
                throw new UnsupportedOperationException("Unimplemented method 'drive'");
            }

        };
        v.accelerate();
        // not run()

    }
}
