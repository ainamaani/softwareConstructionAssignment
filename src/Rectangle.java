public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(Posn center, double width, double length) {
        super(center);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    @Override
    public double perimeter() {
        return 2 *(this.width + this.length);
    }

    @Override
    public double area() {
        return this.width * this.length;
    }

    @Override
    public boolean contains(Posn p) {
        double x = p.getX();
        double y = p.getY();
        double cx = getCenter().getX();
        double cy = getCenter().getY();
        return Math.abs(x - cx) < length / 2 && Math.abs(y - cy) < width / 2;
    }
}
