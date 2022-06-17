package asd.arrays;

public class MoveZeros
{
    void moveZeros(int arr[], int n)
    {
        int i, non_zero = 0;
        for(i = 0; i < n; i++)
        {
            if(arr[i] != 0)
            {
                int temp = arr[non_zero];
                arr[non_zero] = arr[i];
                arr[i] = temp;
                non_zero++;
            }
        }
    }

    public static void main(String[] args)
    {
        MoveZeros ob = new MoveZeros();
        int arr[] = {2, 0, 3, 5, 0, 7, 0};
        ob.moveZeros(arr, arr.length);
        for (int i : arr)
        {
            System.out.println(i);
        }
    }
}
