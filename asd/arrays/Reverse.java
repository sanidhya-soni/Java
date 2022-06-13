package asd.arrays;

public class Reverse
{

    int[] reverse(int[] arr)
    {
        int i;
        for(i = 0; i < arr.length / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args)
    {
        Reverse ob = new Reverse();
        int arr[] = {1, 2, 3, 4, 5, 6};
        arr = ob.reverse(arr);
        for (int i : arr)
        {
            System.out.println(i);
        }
    }
}
