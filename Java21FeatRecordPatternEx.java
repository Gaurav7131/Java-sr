public class Java21FeatRecordPatternEx {
    record Point(int x, int y) {
    }

    record Window(Point topleft, Point bottomright) {
    }

    public static void RecordPattern(Object obj) {
        // Direct nested Destruction of record in one statement
        if (obj instanceof Window(Point(var x1, var y1), Point(var x2, var y2))) {
            System.out.printf("Window Coordinates: (%d,%d) to (%d,%d)%n", x1, y1, x2, y2);
        } else if (obj instanceof Point(int x, int y)) {
            System.out.printf("Point coordinates: x=%d, y=%d%n", x, y);
        }
    }

    public static void main(String[] args) {
        RecordPattern(new Point(10, 12));
        RecordPattern(new Window(new Point(0, 5), new Point(10, 0)));
    }
}
