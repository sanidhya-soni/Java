package mypkg;

public class Test
{
    public static void show()
    {
        System.out.println("show ");
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try
        {
            System.out.print("Hi ");
            show();
        }
        catch (Exception e)
        {
            System.out.print("caught ");
        }
        finally {
            System.out.print("finally ");
        }
        System.out.println("Last");
    }
}