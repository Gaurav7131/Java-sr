public class Java21FeatStringTemplateEx {
    // Offers safe string interpolation via template processors like STR."Hello
    // \{name}" to compose strings with dynamic variables without SQL/script
    // injection risks.
    public static void main(String[] args) {
        String name = "Gaurav";
        int release = 21;
        String result = STR."Java\{release} welcomes\{name}!"//template processor
         System.out.println(result);
    }_
}
