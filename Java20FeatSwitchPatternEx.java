public class Java20FeatSwitchPatternEx {
    // java 20 allows to inspect shape of object,add custom boolean rules to each
    // case arm,simplifies grammer and + enum constant handling
    sealed interface Shape permits Circle, Rectangle {
    }

    record Circle(double radius) implements Shape {
    };

    record Rectangle(double w, double h) implements Shape {
    };

    public static String calculateArea(Shape shape) {
        return switch (shape) {
            case Circle c when c.radius() > 10 -> "Large circle of radius: " + c.radius();
            case Circle c -> "Small Circle:" + c.radius();
            case Rectangle(double w, double h) -> "Area of Rectangle:" + (w * h);

        };
    }

    public static void main(String[] args) {
        System.out.println(calculateArea(new Circle(10.0)));
        System.out.println(calculateArea(new Rectangle(2.5, 1.3)));

    }
}
