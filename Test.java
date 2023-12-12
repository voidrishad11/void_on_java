public class Test
{
    public Test()
    {
        Rectangle rec = new Rectangle(6.0,8.0);
        rec.display();
        //square.display();
        System.out.println("Area is "+ rec.area());
        System.out.println("Perimeter is "+ rec.perimeter());
    }
    public static void main(String[] args) {
        // Create an instance of the Test class to run the code
        Test test = new Test();
    }
}