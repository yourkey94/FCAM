public class Circle extends Shape {
    double r;

    Circle(double r) {
        this(new Point(0, 0), r);
    }

    Circle(Point p, double r) {
        super.p = p;
        this.r = r;
    }

    double calcArea() {
        return Math.pow(r, 2) * Math.PI;
    }
}
