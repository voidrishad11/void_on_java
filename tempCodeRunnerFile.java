import Inhertance.Rectangle;
import Inhertance.Square;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public void display() {
        System.out.println("Length is " + length);
    }
}

public class Square extends Rectangle {
    public Square(double length) {
        super(length, length);
    }

    @Override
    public double area() {
        return length * length;
    }

    @Override
    public double perimeter() {
        return 4 * length;
    }
}

public class Test {
    public Test() {
        Square square = new Square(6.8);
        square.display();
        System.out.println("Area is " + square.area());
        System.out.println("Perimeter is " + square.perimeter());
    }

    public static void main(String[] args) {
        // Create an instance of the Test class to run the code
        Test test = new Test();
    }
}
