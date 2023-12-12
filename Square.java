public class Square extends Rectangle
{
    public Square (double length)
    {
        super(length,length); 
        // parent er jotota perameter thik totobar 
        // likhte hbe orthat slot fillup korbo
    }
    public double area()
    {
        return length*length;
    }
    public double perimeter()
    {
        return 4*(length);
    }
}