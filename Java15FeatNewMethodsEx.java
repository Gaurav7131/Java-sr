public class Java15FeatNewMethodsEx {
    public static void main(String[] args) {
        // formatted():instance method works like string.format()
        String formatString = "Hello,%s Whats the time: %d pm".formatted("Gaurav", 5);// %s:String,%d:int ~ c,c++
        System.out.println(formatString);

        // stripIndent();remove common leading whitespaces
        String stripString = "   Hello bob Hows Going?  ";
        System.out.println(stripString.stripIndent());

        // translateEscape:translate(convert)escape seq like \n,\t,\s into actual char
        String rawTranslateEscString = "Line1\\nLine2\\tTabbed";
        System.out.println(rawTranslateEscString.translateEscapes());
    }
}
