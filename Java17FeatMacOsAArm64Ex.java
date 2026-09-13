public class Java17FeatMacOsAArm64Ex {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        String arch = System.getProperty("os.arch");

        System.out.println("OS:" + os);
        // Prints aarch64(MacOs-m1,m2)eliminate translate overhead via Rosseta
        System.out.println("Architexture:" + arch);
    }
}
