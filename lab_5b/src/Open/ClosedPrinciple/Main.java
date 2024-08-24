package Open.ClosedPrinciple;

public class Main {
    public static void main(String[] args) {
       
        Shape rectangle = new Rectangle(10, 5);
        Shape circle = new Circle(7);

        double rectangleArea = rectangle.calculateArea();
        double circleArea = circle.calculateArea();

        System.out.println("Area of the Rectangle: " + rectangleArea);
        System.out.println("Area of the Circle: " + circleArea);
    }
}
