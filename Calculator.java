import java.util.*;
public class Calculator 
{

    private int numberOne, numberTwo;

    public Calculator(int numberOne, int numberTwo) //int numberOne, int numberTwo egula class er variable
    {
        // ekhane Calculator ekta Alternate Constructor (jodi vitore kichu na ditam taile Default constr.)
        this.numberOne = numberOne;
        // 'this' is current object
        this.numberTwo = numberTwo;
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
    }
    public void shape(float radius) 
    {
        double area = radius * radius * 3.1415 ;
        System.out.println("Circle Area = \t");
        System.out.print(area);
    }

    public static class TestCalculator 
    {
        Calculator calc1, calc2, calc3, calc4;

        public TestCalculator()
        {
            Scanner scn = new Scanner(System.in);
            int x = scn.nextInt();
            int y = scn.nextInt();
            calc1 = new Calculator(x, y); 
        }
    }

    public static void main(String[] args)
    {
        Calculator.TestCalculator testCalculator = new Calculator.TestCalculator();

        testCalculator.calc1.add();
        testCalculator.calc1.shape();

    }
}