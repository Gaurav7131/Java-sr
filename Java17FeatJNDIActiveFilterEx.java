public class Java17FeatJNDIActiveFilterEx {
    public static void main(String[] args) {
        // Enforce an allowlist on JNDI class factory instantiation
        System.setProperty("jdk.jndi.object.factoriesFilter", "com.myworkspace.trusted.**;!*");

        String activeFilter = System.getProperty("jdk.jndi.object.factoriesFilter");
        System.out.println("Active JNDI Factory Filter:" + activeFilter);
    }
}
