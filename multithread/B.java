package multithread;

public class B extends Thread
{
    @Override
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(Thread.currentThread());
            try
            {
                sleep(1000);
            }
            catch (Exception e)
            {
                
            }
        }
    }
}
