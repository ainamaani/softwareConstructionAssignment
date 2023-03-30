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

    @Override
    public boolean contains(Posn p) {
        double x = p.getX();
        double y = p.getY();
        double cx = getCenter().getX();
        double cy = getCenter().getY();
        double distance = Math.sqrt((x - cx) * (x - cx) + (y - cy) * (y - cy));
        return distance < this.radius;
    }
}
