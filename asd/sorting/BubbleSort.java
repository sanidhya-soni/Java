package asd.sorting;

public class BubbleSort
{
    int[] sort(int arr[])
    {
        int i, j, temp;
        for(i = 0; i < arr.length - 1; i++)
        {
            // boolean swapped = false;     // For optimizing the code
            for(j = 0; j < arr.length - 1 - i; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    temp = arr[j];;
                    arr[j] = arr[j + 1];
                    arr[j + 1] =  temp;
                    // swapped = true;     // For optimizing the code
                }
            }
            /* if(swapped == false)    // For optimizing the code
                break; */
        }
        return arr;
    }

    public static void main(String[] args)
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {5, 7, 6, 3, 10, 12, 1};
        ob.sort(arr);
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}
