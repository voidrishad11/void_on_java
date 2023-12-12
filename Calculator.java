import java.util.*;
public class Calculator 
{

    private int numberOne, numberTwo, float rad, double ;

    public Calculator(int numberOne, int numberTwo) //int numberOne, int numberTwo egula class er variable
    {
        // ekhane Calculator ekta Alternate Constructor (jodi vitore kichu na ditam taile Default constr.)
        this.numberOne = numberOne;
        // 'this' is current object
        this.numberTwo = numberTwo;
    }
    public Calculator(float numberThree) //int numberOne, int numberTwo egula class er variable
    {
        this.numberThree = rad;
    }public Calculator(double numberFour) //int numberOne, int numberTwo egula class er variable
    {
        this.numberFour = rad;
    }
    public void add() 
    {
        System.out.println(numberOne + numberTwo);
    }
    public void shape() 
    {
        double area = numberOne * numberTwo;
        System.out.println("Rectangle Area = \t");
        System.out.print(area);
    }
    public void shape(float side) 
    {
        double area = numberOne * numberOne;
        System.out.println("Square Area = \t");
        System.out.print(area);
        System.out.println();
    }
    public void shape(double radius) 
    {
        double area = radius * radius * 3.1415 ;
        System.out.println("Circle Area = \t");
        System.out.print(area);
        System.out.println();
    }

    public static class TestCalculator 
    {
        Calculator calc1, calc2, calc3, calc4;

        public TestCalculator()
        {
            Scanner scn = new Scanner(System.in);
            int x = scn.nextInt();
            int y = scn.nextInt();
            float a = y;
            double b = y;
            calc1 = new Calculator(x, y); 
            calc2 = new Calculator (a);
            calc3 = new Calculator (b);
        }
    }

    public static void main(String[] args)
    {
        Calculator.TestCalculator testCalculator = new Calculator.TestCalculator();

        testCalculator.calc1.add();
        testCalculator.calc1.shape();
        testCalculator.calc2.shape();
        testCalculator.calc3.shape();
    }
}