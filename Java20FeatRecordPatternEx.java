public class Java20FeatRecordPatternEx {
    record Point(int x, int y) {
    }

    record Box<T>(T content) {
    }

    public static void main(String[] args) {
        Object obj = new Box<>(new Point(10, 20));

        // 1. Nested record pattern deconstruction using 'var'
        if (obj instanceof Box(Point(var x, var y))) {
            System.out.println("Extracted coordinates: x=" + x + ", y=" + y);
        }

        // 2. Enhanced for-loop: Use 'var' for the loop variable
        Point[] points = { new Point(1, 2), new Point(3, 4) };
        for (var p : points) {
            var px = p.x();
            var py = p.y();
            System.out.println("Loop point: " + px + ", " + py);
        }

        // 3. Pattern matching with 'var' inside the loop
        for (var item : points) {
            if (item instanceof Point(var px, var py)) {
                System.out.println("Pattern point: " + px + ", " + py);
            }
        }
    }
}