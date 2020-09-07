import java.lang.Math;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    private double halvedPerimeter;

    public Triangle(String name) {
        super(name);
    }

    public Triangle setDimensions(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.halvedPerimeter = (side1 + side2 + side3)/2;
        return this;
    }

    @Override
    public void printDimensions() {
        System.out.println(side1);
        System.out.println(side2);
        System.out.println(side3);
    }

    @Override
    public double getArea(){
        return Math.sqrt(halvedPerimeter* ((halvedPerimeter-side1) * (halvedPerimeter-side2) * (halvedPerimeter-side3)));
    }

}
