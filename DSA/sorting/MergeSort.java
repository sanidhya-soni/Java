package dsa.sorting;

public class MergeSort
{

    void merge(int[] arr, int start, int mid, int end)
    {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i = 0; i < n1; i++)
        {
            left[i] = arr[start + i];
        }
        for(int i = 0; i < n2; i++)
        {
            right[i] = arr[i + mid + 1];
        }

        int i = 0, j = 0, k = start;

        while(i < n1 && j < n2)
        {
            if(left[i] < right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else
            {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < n1)
        {
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < n2)
        {
            arr[k] = right[j];
            k++;
            j++;
        }
    }

    void sort(int[] arr, int start, int end)
    {
        if(start < end)
        {
            int mid = start + (end - start) / 2;

            sort(arr, start, mid);
            sort(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {5, 4, 9, 7, 3, 1, 8};
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);
        for(int i: arr)
        {
            System.out.print(i + " ");
        }
    }
}
