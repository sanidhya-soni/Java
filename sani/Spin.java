package sani;

public class Spin
{
    private static void spin(int milliseconds)
    {
        long sleepTime = milliseconds * 1000000L;
        long startTime = System.nanoTime();
        while((System.nanoTime() - startTime) < sleepTime)
        {

        }
    }

    public static void main(String[] args)
    {
        // final int NUM_TESTS = 1000;
        // long start = System.nanoTime();
        // for(int i = 0; i < NUM_TESTS; i++)
        // {
        //     spin(500);
        // }
        // System.out.println("Took" + (System.nanoTime() - start)/1000000 + "ms(expected" + (NUM_TESTS * 500) + ")");

        while(true)
        {
            System.out.println("");
        }
    }
}
