package DSA;

public class Q6
{
    public static void main(String[] args)
    {
        int i;
        int arr[] = {1, 2};
        for(i = 0; i < arr.length / 2; i++)
        {
            arr[i] = arr[i] + arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i] - arr[arr.length - i - 1];
            arr[i] = arr[i] - arr[arr.length - i - 1];
        }
        for(i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
