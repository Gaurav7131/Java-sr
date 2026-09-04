import java.lang.constant.ClassDesc;

public class Java12FeatNominalDeskJEPEx {
    public static void main(String[] args) {
        // JEP 334: JVM Constants API:extract constant pool(classes,methods,constants
        // without initilizinng it) we dont need to digged in it.
        ClassDesc desk = ClassDesc.of("java.lang.String");

        System.out.println("Nominal Descriptor:" + desk.descriptorString());
    }
}
