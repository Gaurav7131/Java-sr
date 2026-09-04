public class Java12FeatPatternMatchingEx {
    public void checkObj(Object obj) {
        // checks types and bind var s directly
        if (obj instanceof String s) {
            System.out.println("String:" + s.length());// no cast needed
        }
    }

    public static void main(String[] args) {
        Java12FeatPatternMatchingEx ex = new Java12FeatPatternMatchingEx();
        ex.checkObj("Hiiiii");// 6
        System.out.println(ex);
    }
}
