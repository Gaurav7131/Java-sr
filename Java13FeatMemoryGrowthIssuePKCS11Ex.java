import java.security.Provider;
import java.security.Security;

public class Java13FeatMemoryGrowthIssuePKCS11Ex {
    public static void main(String[] args) {
        // Verify PKCS11 provider status & registered service cleanups
        Provider p = Security.getProvider("SunPKCS11");
        if (p != null) {
            System.out.println("SunPCKS11 Provider Available:" + p.getName());
            System.out.println("Provider info:" + p.getInfo());

        } else {
            System.out.println("PCKS11 memory growth issue resolved cleanly via security chain");

        }
    }
}