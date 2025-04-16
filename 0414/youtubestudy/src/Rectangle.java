public class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this(new Point(0, 0), width, height);
    }

    Rectangle(Point p, double width, double height) {
        super.p = p;
        this.width = width;
        this.height = height;
    }

    double calcArea() {
        return width * height;
    }

    boolean isSquare() {
        boolean b;
        b = (width == height);
        return b;
    }
}
