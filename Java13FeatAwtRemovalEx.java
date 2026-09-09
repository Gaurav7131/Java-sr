//The unsafe entrypoint through awt.toolkit:bypass JVM system protections,unauth gui subsystem exploitation,introducing vulnerabilities
public class Java13FeatAwtRemovalEx {
    public static void main(String[] args) {
        // Trying to read or overrride prop(unsafe,coz system exploitation)
        String s = System.getProperty("awt.toolkit");
        System.out.println("Accessed Property:" + s);// java 13 removed support
    }
}
