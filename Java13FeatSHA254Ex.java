
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Java13FeatSHA254Ex {
    public static void main(String[] args) throws Exception {
        // prev javac used SHA1,MD5 internal hasing algo but java 13 upgraded to SHA-254
        // to reolsve collision integrity checks.
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] classByteCode = "SyntheticClassBytesForIntegrity".getBytes(StandardCharsets.UTF_8);
        byte[] hash = digest.digest(classByteCode);

        // SHA-256 string
        StringBuilder hexStr = new StringBuilder();
        for (byte b : hash) {
            hexStr.append(String.format("%02x", b));// Append stringhash
        }
        System.out.println("SHA-256 class Hash" + hexStr);// hashstr appended
    }
}
