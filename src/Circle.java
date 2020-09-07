import java.lang.Math;

public class Circle extends Shape{
    private double radius;

    public Circle(String name) {
        super(name);
    }

    public Circle setDimensions(double radius){
        this.radius = radius;
        return this;
    }

    @Override
    public void printDimensions() {
        System.out.println(radius);
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

}
