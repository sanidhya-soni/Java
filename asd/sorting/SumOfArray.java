package asd.sorting;

import java.util.concurrent.SubmissionPublisher;

public class SumOfArray
{
    int sum(int arr[], int n)
    {
        if(n == 0)
            return 0;
        
        return arr[n - 1] + sum(arr, n - 1);
    }

    public static void main(String[] args)
    {
        SumOfArray ob = new SumOfArray();
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(ob.sum(arr, arr.length));
    }
}
