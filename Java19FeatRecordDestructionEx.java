public class Java19FeatRecordDestructionEx {
    record Point(int x, int y) {
    }

    record Rectangle(Point top, Point bottom) {
    }

    public static void printDetails(Object obj) {
        // Direction destruction of Point record components
        if (obj instanceof Point(int x, int y)) {
            System.out.println("Point Coordinates:x=" + x + "\ty=" + y);
        }

        // nested destruction of Rectangle record components
        if (obj instanceof Rectangle(Point(int x1, int y1), Point(int x2, int y2))) {
            int width = Math.abs(x2 - x1);
            int height = Math.abs(y2 - y1);
            System.out.println("Rectangle Dimesions:" + width + "x" + height);
        }
    }

    public static void main(String[] args) {
        printDetails(new Point(10, 13));
        printDetails(new Rectangle(new Point(10, 0), new Point(0, 5)));

    }
}
