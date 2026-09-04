public class Java12FeatNewStrMethodEx {
    public static void main(String[] args) {
        // indent():add or remove leading spaces of ech line from multiline str
        String str = "Line1 \nLine2";
        System.out.println(str.indent(10));// +(right)
        str.indent(-1);// left(negative)

        // transform():lets u pipe string through transformation without breaking
        // str-chain logic
        String pipe = "Hello Everyone";
        System.out.println("Tranformed Str:" + pipe.transform(s -> s.toUpperCase() + " HOWS GOING?"));
    }
}
