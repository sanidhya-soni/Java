import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcHandle
{
    public static void main(String[] args) throws IOException, FileNotFoundException
    {
        int arr[] = new int[4];

        try
        {
            System.out.println(5 / 0);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }

        try
        {
            System.out.println(arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Inside Finally Block");
        }

        try
        {
            Integer.parseInt("12h");
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }

        try
        {
            throw new NullPointerException("Object Undefined");
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        
        try
        {
            throw new ClassNotFoundException("Class Not Found");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Exit");
        }
    }
}
