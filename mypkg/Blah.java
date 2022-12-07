package mypkg;

import java.io.IOException;

public class Blah
{
    public static void main(String[] args) throws InterruptedException, IOException
    {
       for (int x =0 ; x <=10000 ; x++)
       {
           String data = "\r" + x;
           System.out.print(data);
           Thread.sleep(1);
       }
    }
}
