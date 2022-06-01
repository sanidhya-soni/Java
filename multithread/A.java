package multithread;

public class A extends Thread
{
    @Override
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(i);
            try
            {
                sleep(1000);
            }
            catch (Exception c)
            {

            }
        }
    }
}
