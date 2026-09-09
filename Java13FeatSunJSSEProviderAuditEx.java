import java.security.Provider;
import java.security.Security;

public class Java13FeatSunJSSEProviderAuditEx {
    public static void main(String[] args) {
        Provider p = Security.getProvider("SunJSSE");// Target Provider
        if (p != null) {
            // verifies Provider registration
            System.out.println("Provider Name:" + p.getName());
            System.out.println("Provider info:" + p.getInfo());
            // prev SunJSSE provider has duplicate internal mapping for RSa impl instead of
            // mapping to dedicated SunRsaSign.Java 13 cleans up provider
            // registration,ensuring seperation of cocnerns across jdk's security modules
        }
    }
}
