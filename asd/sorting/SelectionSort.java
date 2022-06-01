package asd.sorting;

public class SelectionSort
{
    int[] sort(int arr[])
    {
        int i, j, min, temp;
        for(i = 0; i < arr.length - 1; i++)
        {
            min = i;
            for(j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }

            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static void main(String[] args)
    {
        SelectionSort ob = new SelectionSort();
        int arr[] = {5, 7, 6, 3, 10, 12, 1};
        ob.sort(arr);
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}
