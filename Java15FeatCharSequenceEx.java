public class Java15FeatCharSequenceEx {
    public static void main(String[] args) {
        // cs implemented by String,StringBuulder,StrBuffer,CharBuffer() //
        CharSequence seq1 = new StringBuilder();// previosly,needs explcit cs.length==0
        CharSequence seq2 = "Not Empty";

        System.out.println("Seq1 is empty:" + seq1.isEmpty());// Java 15: default boolean isEmpty() true
        System.out.println("Seq2 is empty:" + seq2.isEmpty());// false
    }
}
