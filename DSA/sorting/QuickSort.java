package DSA.sorting;

public class QuickSort
{
    void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    int partition(int arr[], int s, int e)
    {
        int pivot = arr[s], pivotIndex, count = 0;
        for(int i = s + 1; i <= e; i++)
        {
            if(arr[i] < pivot)
            {
                count++;
            }
        }
        pivotIndex = count + s;
        swap(arr, s, pivotIndex);
        
        int i = s, j = e;

        while(i < pivotIndex && j > pivotIndex)
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

    void quickSort(int arr[], int s, int e)
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
        QuickSort ob = new QuickSort();
        int arr[] = {5, 7, 6, 3, 10, 12, 1};
        ob.quickSort(arr, 0, arr.length - 1);
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}
