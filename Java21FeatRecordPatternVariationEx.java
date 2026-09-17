public class Java21FeatRecordPatternVariationEx {
    record Point(int x, int y) {
    }

    static void process(Object obj) {
        // Deconstruct only 'x', ignore 'y'
        // if (obj instanceof Point(int x, _)) {
        // System.out.println("X coordinate: " + x);
        // }
    }

    public static void main(String[] args) {
        // process(new Point(1, 3));

    }
}