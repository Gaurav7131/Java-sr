import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;

public class Java13FeatDeutcheRootCARemovalEx {
    public static void main(String[] args) throws Exception {
        String home = System.getProperty("java.home");
        File cacerts = new File(home, "lib/security/cacerts");

        KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
        ks.load(new FileInputStream(cacerts), "changeit".toCharArray());

        // check for removal of outdated,expired root certs
        boolean hasExpiredCA = ks.containsAlias("deutschetelekomrootca2");// expired certs
        System.out.println("Expired Deutsche Telekom Root CA 2 present:" + hasExpiredCA);// return boolean value(T/F)

    }
}
