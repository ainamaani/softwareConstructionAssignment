public class Circle extends Shape{
    private double radius;

    public Circle(Posn center, double radius) {
        super(center);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}
