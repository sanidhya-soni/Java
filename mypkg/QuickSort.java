package mypkg;

public class QuickSort
{

    void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    int partition(int[] arr, int s, int e)
    {
        int pivotIndex, pivot = arr[s], count = 0, i, j;

        for(i = s + 1; i <= e; i++)
        {
            if(arr[i] < pivot)
            {
                count++;
            }
        }
        pivotIndex = s + count;
        swap(arr, s, pivotIndex);

        i = s;
        j = e;

        while(i < pivotIndex && pivotIndex < j)
        {
            while(arr[i] <= arr[pivotIndex])
            {
                i++;
            }
            while(arr[j] >= arr[pivotIndex])
            {
                j--;
            }
            if(i < pivotIndex && j > pivotIndex)
            {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    void quickSort(int[] arr, int s, int e)
    {
        if(s >= e)
        {
            return;
        }

        int p = partition(arr, s, e);

        quickSort(arr, s, p - 1);

        quickSort(arr, p + 1, e);
    }

    public static void main(String[] args)
    {
        int[] arr = {5, 6, 8, 3, 7, 1};
        QuickSort ob = new QuickSort();
        ob.quickSort(arr, 0, arr.length - 1);
        for(int i: arr)
        {
            System.out.print(i + " ");
        }
    }
}
