public class Square extends Rectangle {
    public Square(Posn center, double side) {
        super(center, side, side);
    }

    public double getSide() {
        return getWidth();
    }
}
