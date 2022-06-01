package asd.recurssion;

public class MergeSort
{
    void merge(int arr[], int s, int e)
    {
        int mid = s + (e - s)/2;
        int temp[] = new int[e - s + 1];
        int i = s, j = mid + 1, k = 0;
        while(i <= mid && j <= e)
        {
            if(arr[i] <= arr[j])
            {
                temp[k] = arr[i];
                i++; k++;
            }
            else
            {
                temp[k] = arr[j];
                j++; k++;
            }
        }

        while(i <= mid)
        {
            temp[k] = arr[i];
            i++; k++;
        }

        while(j <= e)
        {
            temp[k] = arr[j];
            j++; k++;
        }

        for(i = s; i <= e; i++)
        {
            arr[i] = temp[i - s];
        }
    }

    void mergeSort(int arr[], int s, int e)
    {
        if(s >= e)
            return;

        int mid = s + (e - s)/2;

        mergeSort(arr, s, mid);

        mergeSort(arr, mid + 1, e);

        merge(arr, s, e);
    }

    public static void main(String[] args)
    {
        MergeSort ob = new MergeSort();
        int arr[] = {5, 7, 6, 3, 10, 12, 1};
        ob.mergeSort(arr, 0, arr.length - 1);
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}
