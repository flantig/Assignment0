public class Square extends Shape{
    private double length;
    private double height;

    public Square(String name) {
        super(name);
    }

    public Square setDimensions(double length, double height){
        this.length = length;
        this.height = height;
        return this;
    }

}
