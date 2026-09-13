
import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Java17FeatSunJCEKeySwapperEx {
    public static void main(String[] args) throws Exception {
        KeyGenerator kg = KeyGenerator.getInstance("AES");
        kg.init(256);

        SecretKey sk = kg.generateKey();// key for encryption
        SecretKey dataKey = kg.generateKey();// Payload(data) to protect

        // Wrap the Payload
        Cipher cipher = Cipher.getInstance("AES/KW/NoPadding", "SunJCE");// added to default SunJCE
        cipher.init(cipher.WRAP_MODE, sk);// wrap-init
        byte[] wrappedKeyBytes = cipher.wrap(dataKey);// wrap datakey

        // Unwrap payload
        cipher.init(Cipher.UNWRAP_MODE, sk);// unwrap-init
        Key unwrappedKeyBytes = cipher.unwrap(wrappedKeyBytes, "AES", Cipher.SECRET_KEY);

        System.out.println("Key Matches:" + dataKey.equals(unwrappedKeyBytes));// true

    }
}
