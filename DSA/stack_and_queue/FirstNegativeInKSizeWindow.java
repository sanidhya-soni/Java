package DSA.stack_and_queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class FirstNegativeInKSizeWindow
{

    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        Queue<Integer> q = new ArrayDeque<Integer>();
        long[] arr = new long[N - K + 1];
        int i;
        
        if(N == 1)
        {   
            if(A[0] > 0)
                arr[0] = 0;
            else
                arr[0] = A[0];
            return arr;
        }

        for(i = 0; i < K; i++)
        {
            if(A[i] < 0)
                q.add(i);
        }

        for(i = 0; i < N - K; i++)
        {
            if(!q.isEmpty())
            {
                // System.out.println(A[q.peek()]);
                arr[i] = A[q.peek()];
            }
            else
            {
                // System.out.println(0);
                arr[i] = 0;
            }
            
            if(!q.isEmpty() && q.peek() < i + 1)
                q.poll();

            if(A[i + K] < 0)
                q.add(i + K);
        }
        // System.out.println(A[q.peek()]);
        if(!q.isEmpty())
            arr[i] = A[q.peek()];
        return arr;
    }

    public static void main(String[] args)
    {
        long[] arr = {-8, 2, 3, -6, 10, -9, -8, 2};
        FirstNegativeInKSizeWindow ob = new FirstNegativeInKSizeWindow();
        for (long l : ob.printFirstNegativeInteger(arr, arr.length, 2)) 
        {
            System.out.println(l);
        }
    }
}
