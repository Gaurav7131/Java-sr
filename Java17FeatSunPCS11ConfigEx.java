import java.security.Provider;
import java.security.Security;

public class Java17FeatSunPCS11ConfigEx {
    public static void main(String[] args) {

        Provider p = Security.getProvider("SunPKCS11");
        if (p != null) {
            System.out.println("Provider Name:" + p.getName());
            System.out.println("Get info:" + p.getInfo());
        }
    }
}
