public class Java15FeatTextBlockEx {
    public static void main(String[] args) {
        // 2 sequence:/ for line continuation and \s:preserving trailing spaces
        String sqlQuery = """
                {
                SELECT emp_id,name,email \s
                 from employee \
                where status="ACTIVE" \
                ORDER BY created_at DESC;
                }
                        """;
        System.out.println(sqlQuery);
    }
}
