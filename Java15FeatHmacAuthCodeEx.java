import java.nio.charset.StandardCharsets;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

public class Java15FeatHmacAuthCodeEx {
    public static void main(String[] args) {
        try {
            // Generate a key
            KeyGenerator kg = KeyGenerator.getInstance("HmacSHA3-256");// HmacSHA3-224,HmacSHA3-256,HmacSHA3-384,512
            SecretKey key = kg.generateKey();

            // Initialize a mac instance
            Mac mac = Mac.getInstance("HmacSHA3-256");
            mac.init(key);

            // Data
            byte[] payload = "AuthenticateThisData".getBytes(StandardCharsets.UTF_8);
            byte[] result = mac.doFinal(payload);

            StringBuilder hexString = new StringBuilder();
            for (byte b : result) {
                hexString.append(String.format("%02x", b));
            }
            System.out.println("Algorithm tag:" + hexString);

        } catch (Exception e) {
            System.out.println("No Algorithms Tag Found:" + e);
        }
    }

}
