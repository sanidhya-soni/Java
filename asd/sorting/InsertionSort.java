package asd.sorting;

public class InsertionSort
{
    int[] sort(int arr[])
    {
        int i, j, temp;
        for(i = 1; i < arr.length; i++)
        {
            temp = arr[i];
            for(j = i - 1; j >= 0; j--)
            {
                if(temp < arr[j])
                {
                    arr[j + 1] = arr[j];
                }
                else
                {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args)
    {
        InsertionSort ob = new InsertionSort();
        int arr[] = {5, 7, 6, 3, 10, 12, 1};
        ob.sort(arr);
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}
