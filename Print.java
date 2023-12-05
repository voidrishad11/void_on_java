import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.util;
public class Print 
{
    public static void main(String[] args) 
    throws IOException
    //main must be static
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scn = new Scanner(System.in);
        //scn is now the scanner stack
        String username = reader.readLine();
        int rollno = scn.nextInt();
        double marks = scn.nextDouble();
        System.out.println();
        System.out.print(rollno);
        System.out.print("\t" + username);
        System.out.print("\t" + marks);
    }
    

}
        