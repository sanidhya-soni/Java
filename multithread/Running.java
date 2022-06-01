package multithread;

public class Running
{
    public static void main(String[] args)
    {
        // System.out.println(Thread.currentThread().getName());
        A ob1 = new A();
        B ob2 = new B();
        // ob1.setName("Alan");
        ob1.setPriority(1);
        ob1.start();
        try
        {
            Thread.sleep(10);
        }
        catch (Exception c)
        {

        }
        ob2.start();
    }
}
