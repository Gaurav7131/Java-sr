import java.security.Security;
import java.util.Arrays;

public class Java17FeatPKCSChaCha20PolyEx {
    public static void main(String[] args) {
        // Java SunPKCS11 provider now exposes them directly via standard JCA Cipher and
        // KeyGenerator interfaces without requiring custom third-party JNI bridges.
        boolean available = Arrays.stream(Security.getProviders()).flatMap(p -> p.getServices().stream())
                .anyMatch(s -> s.getAlgorithm().equalsIgnoreCase("ChaCha20-Poly1305"));

        System.out.println("PKCS11-ChaCha20 Registered:" + available);
    }
}
