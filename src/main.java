import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("triangle dude");
        EquilateralTriangle equalTriangle = new EquilateralTriangle("equaltriangle chick");
        Square square = new Square("square boy");
        Circle circle = new Circle("routundous");

        System.out.println("What shape do you want to calculate the area for? (Enter either: 'Sqaure', 'Triangle', or 'Circle')");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        switch (input) {
            case "Triangle":
                System.out.println("Is it equalateral? Y or N?");
                try{
                if(sc.next("Y").equals("Y")){
                    System.out.println("Please enter the dimension of a side and we will return the area for you");
                    if(sc.hasNextDouble()){
                        Double side = sc.nextDouble();
                        equalTriangle.setDimensions(side);
                        System.out.println("The name of this object is: " + equalTriangle.getName());
                        System.out.println("Dimension(s) you entered: ");
                        equalTriangle.printDimensions();
                        System.out.println("Area: " + equalTriangle.getArea());
                    } else {
                        System.out.println("That's not a valid entry...");
                    }
                } else if (sc.next("N").equals("N")){
                    System.out.println("Please enter the dimensions of the all sides, after you enter all three we will return the area for you");
                    if(sc.hasNextDouble()){
                        Double side1 = sc.nextDouble();
                        System.out.println("side 1: ");
                        Double side2 = sc.nextDouble();
                        System.out.println("side 2: ");
                        Double side3 = sc.nextDouble();
                        System.out.println("side 3: ");
                        triangle.setDimensions(side1, side2, side3);
                        System.out.println("The name of this object is: " + triangle.getName());
                        System.out.println("Dimension(s) you entered: ");
                        triangle.printDimensions();
                        System.out.println("Area: " + triangle.getArea());
                    } else {
                        System.out.println("That's not a valid entry...");
                        break;
                    }
                } } catch (Exception e){
                        System.out.println("You didn't enter a valid entry...");
                    }
            case "Square":
                try {
                    System.out.println("Please enter the length: ");
                    Double length = sc.nextDouble();
                    System.out.println("Please enter the height: ");
                    Double height = sc.nextDouble();
                    square.setDimensions(length, height);
                    System.out.println("The name of this object is: " + square.getName());
                    System.out.println("Dimension(s) you entered: ");
                    square.printDimensions();
                    System.out.println("Area: " + square.getArea());
                } catch (Exception e) {
                    System.out.println("You didn't enter a valid entry...");
                }
            case "Circle":
                try {
                    System.out.println("Please enter the radius: ");
                    Double radius = sc.nextDouble();
                    circle.setDimensions(radius);
                    System.out.println("The name of this object is: " + circle.getName());
                    System.out.println("Dimension(s) you entered: ");
                    square.printDimensions();
                    System.out.println("Area: " + circle.getArea());
                } catch (Exception e) {
                    System.out.println("You didn't enter a valid entry...");
                }
            default:
                System.out.println("That's not a valid entry...");
                break;

        }
    }

}
