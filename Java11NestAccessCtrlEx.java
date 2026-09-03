import java.lang.reflect.Method;

public class Java11NestAccessCtrlEx {
    // Outer class method: private
    private void privateOuterMethod() throws Exception {
        System.out.println("Hello from outer method");
    }

    // Inner class: method (public)
    class InnerJava11NestAccessCtrlEx {
        public void execute() throws Exception {
            // Direct bytecode nestmate access
            privateOuterMethod();

            // Reflection across nestmates: pass ONLY the pure method name
            Method method = Java11NestAccessCtrlEx.class.getDeclaredMethod("privateOuterMethod");

            // JEP 181 allows reflection across nestmates without setAccessible(true)
            method.invoke(Java11NestAccessCtrlEx.this);
        }
    }

    public static void main(String[] args) throws Exception {
        Java11NestAccessCtrlEx ex = new Java11NestAccessCtrlEx();
        InnerJava11NestAccessCtrlEx ex2 = ex.new InnerJava11NestAccessCtrlEx();
        ex2.execute();

        // Verification APIs (Java 11+)
        System.out.println("Inner class: " + InnerJava11NestAccessCtrlEx.class.getNestHost().getSimpleName());
        System.out.println(
                "Are Nestmates: " + Java11NestAccessCtrlEx.class.isNestmateOf(InnerJava11NestAccessCtrlEx.class));
    }
}