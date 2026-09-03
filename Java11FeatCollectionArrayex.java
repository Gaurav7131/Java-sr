import java.util.List;

public class Java11FeatCollectionArrayex {
    public static void main(String[] args) {
        List<String> frameworkList = List.of("Java", "SpringBoot", "Postgreysql");

        // clean,type-safed conversion using method reference String[]::new
        String[] fwArray = frameworkList.toArray(String[]::new);

        for (String fw : fwArray) {
            System.out.println(fw);
        }
    }
}
