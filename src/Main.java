public class Main {
    public static void main(String[] args) {
        Posn center = new Posn(0, 0);

        Rectangle rectangle = new Rectangle(center, 4, 3);
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle contains (0, 0): " + rectangle.contains(new Posn(0, 0)));

        Square square = new Square(center, 2);
        System.out.println("Square perimeter: " + square.perimeter());
        System.out.println("Square area: " + square.area());
        System.out.println("Square contains (0, 0): " + square.contains(new Posn(0, 0)));

        Circle circle = new Circle(center, 2);
        System.out.println("Circle circumfrence: " + circle.perimeter());
        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle contains (0, 0): " + circle.contains(new Posn(0, 0)));

    }
}