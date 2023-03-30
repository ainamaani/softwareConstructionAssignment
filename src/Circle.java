public class Circle extends Shape{
    private double radius;

    public Circle(Posn center, double radius) {
        super(center);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
}
