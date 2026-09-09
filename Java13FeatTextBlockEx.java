//TextBlock:eliminate use of messy string concat+ & \n for multiline formatting;textblock allows u multiline formatting,ignore indentation,dont require to escape to single,doubl equote
public class Java13FeatTextBlockEx {
    public static void main(String[] args) {
        String jsonPayload = """
                {
                    "Service":"Cloud-Service",
                    "Service Provider":"Amazon",
                    "SLA":"3 YR"
                }
                            """;
        System.out.println("Text Block JSONPayload:\n" + jsonPayload);
    }
}
