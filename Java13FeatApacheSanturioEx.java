import javax.xml.crypto.dsig.XMLSignatureFactory;

public class Java13FeatApacheSanturioEx {
    public static void main(String[] args) {
        // Factory delgates JDk's internal Xml to Apache Santurio v1.3 to Resolve
        // parsing vulnerabilities,resolve performance bottlencks,entity resoln hazards
        XMLSignatureFactory xf = XMLSignatureFactory.getInstance("DOM");
        System.out.println("Name:" + xf.getProvider().getName());
        System.out.println("Info:" + xf.getProvider().getInfo());
    }
}
