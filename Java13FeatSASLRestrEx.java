import java.security.Security;
import java.util.Arrays;

public class Java13FeatSASLRestrEx {
    public static void main(String[] args) {

        String[] mechanism = new String[] { "PLAIN", "DIGEST-MD5", "SCRAM-SHA-256" };
        System.out.println("Mechanisms Set:" + Arrays.toString(mechanism));

        // restrict sasl globally via Security.setPropertie()
        Security.setProperty("jdk.sasl.disabledMechanisms", "PLAIN,DIGEST-MD5");

        // retrieve and verify enforced policy by getProperties
        String disabledMech = Security.getProperty("jdk.sasl.disabledMechanisms");
        // restrict sasl to strong authenciation by policy or prop
        // Disallow cleartext or weak hashing
        System.out.println("Disable auth by Policy:" + disabledMech);

        // client will reject disabledmechanisms and only negotiate SCRAM-SHA-256
        System.out.println("Sasl mechanisms enforced by runtime properties");
    }
}
