import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Java14FeatSerialFilterEx {
    public static void main(String[] args) throws Exception {
        // Set Dynamic Filter that allows String while rejects everything else
        ObjectInputFilter filter = ObjectInputFilter.Config.createFilter("java.lang.String;!*");

        byte[] serializeData = serialize("SafePayload");

        try (ByteArrayInputStream bais = new ByteArrayInputStream(serializeData);
                ObjectInputStream ois = new ObjectInputStream(bais)) {
            ois.setObjectInputFilter(filter);// set filter
            Object obj = ois.readObject();
            System.out.println("Deserialized Successfully:" + obj);
        } catch (Exception e) {
            System.out.println("Failed or Blocked:" + e.getMessage());
        }
    }

    // Explicit method for byte[] serialize
    private static byte[] serialize(Object obj) {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(obj);
            return baos.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
