public abstract class Shape {
    //instance variable declaration
    private Posn center;

    //constructor
    public Shape(Posn center){
        this.center = center;
    }
    //Getters
    public Posn getCenter(){
        return this.center;
    }

    //Abstract methods
    public abstract double area();
    public abstract double perimeter();
    public abstract boolean contains(Posn p);

}
