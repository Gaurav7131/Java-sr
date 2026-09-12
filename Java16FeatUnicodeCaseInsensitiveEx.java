public class Java16FeatUnicodeCaseInsensitiveEx {
    public static void main(String[] args) {
        String upperChar = "\uD801\uDC00";// 00
        String lowerChar = "\uD801\uDC28";// 28

        boolean matches = upperChar.equalsIgnoreCase(lowerChar);
        int comparison = String.CASE_INSENSITIVE_ORDER.compare(upperChar, lowerChar);

        System.out.println("Case Insensitive Matches:" + matches);
        System.out.println("Case Insensitive Comparison:" + comparison);
    }
}
