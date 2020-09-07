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

    @Override
    public void printDimensions() {
        System.out.println(length);
        System.out.println(height);
    }

    @Override
    public double getArea(){
        return length*height;
    }

}
