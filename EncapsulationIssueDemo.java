import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class EncapsulationIssueDemo {

    public static void main(String[] args) {
        try {
            ByteBuffer buffer = ByteBuffer.allocateDirect(1024);

            // Attempting the deep reflection into JDK internals so target java.nio.Buffer
            // with Address field
            Field addressField = Buffer.class.getDeclaredField("address");

            // Requires:java --add-opens java.base/java.nio=ALL-UNNAMED
            addressField.setAccessible(true);

            long memoryAddress = addressField.getLong(buffer);
            System.out.println("Success Native Adress:" + memoryAddress);
        } catch (NoSuchFieldException e) {
            System.out.println("Field not Found" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Blocked by Strong Encapsulation:" + e.getMessage());
        }
    }
}