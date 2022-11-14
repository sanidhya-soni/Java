package sani;

import java.util.Vector;

public class Inter
{

    int perfectBreaker(int arr[])
    {
        int b[] = new int[arr.length];
        int c[] = new int[arr.length];
        int count = 0;

        for(int i = 0; i < arr.length; i++)
        {
            b[i] = 0;
            c[i] = arr[i];
        }

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                // if(check(arr, b, c))
                {
                    count++;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args)
    {
        
    }
}
