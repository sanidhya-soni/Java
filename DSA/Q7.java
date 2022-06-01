package DSA;

public class Q7
{
    public static void main(String[] args)
    {
        int arr[] = {40, 85, 96, 85, 74, 85, 63, 80, 102, 854, 96, -5, -6, -85, -96, -40};
        if(arr.length >= 1)
        {
            int i, max = arr[0], min = arr[0];
            for(i = 1; i < arr.length; i++)
            {
                if(arr[i] > max)
                {
                    max = arr[i];
                }
                if(arr[i] < min)
                {
                    min = arr[i];
                }
            }
            System.out.println("Min = " + min + "\nMax = " + max);
        }
        else
        {
            System.out.println("Array is empty !");
        }
    }
}
