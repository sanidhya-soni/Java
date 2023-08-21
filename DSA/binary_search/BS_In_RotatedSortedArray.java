package dsa.binary_search;

public class BS_In_RotatedSortedArray
{

    int findPivot(int arr[], int size)
    {
        int start = 0;
        int end = size - 1;
        int mid;

        mid = start + (end - start)/2;

        while(start < end)
        {
            if(arr[mid] >= arr[0])
            {
                start = mid + 1;
            }
            else
            {
                end = mid;
            }

            mid = start + (end - start)/2;
        }

        return start;
    }

    int binarySearch(int arr[], int s, int e, int key)
    {
        int start = s;
        int end = e;
        int mid;
        mid = start + (end - start)/2;
        while(start <= end)
        {
            if(arr[mid] == key)
            {
                return mid;
            }

            if(key > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }

            mid = start + (end - start)/2;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        BS_In_RotatedSortedArray ob = new BS_In_RotatedSortedArray();

        int arr[] = {7, 8, 9, 1, 2, 3, 4, 5};
        int pivot = ob.findPivot(arr, arr.length);
        int key = 2;
        System.out.println("Pivot = " + pivot);
        if(arr[pivot] <= key && key <= arr[arr.length - 1])
        {
            System.out.println(ob.binarySearch(arr, pivot, arr.length - 1, key));
        }
        else
        {
            System.out.println(ob.binarySearch(arr, 0, pivot - 1, key));
        }
    }
}
