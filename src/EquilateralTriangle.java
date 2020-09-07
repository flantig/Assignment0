public class EquilateralTriangle extends Triangle{
    private double side;
    private double halvedPerimeter;

    public EquilateralTriangle(String name) {
        super(name);
    }

    public Triangle setDimensions(double side){
        this.side = side;
        this.halvedPerimeter = (3*side)/2;
        return this;
    }

    @Override
    public void printDimensions() {
        System.out.println(side);
    }

    @Override
    public double getArea(){
        return Math.sqrt(halvedPerimeter* (3*(halvedPerimeter-side)));
    }
}
