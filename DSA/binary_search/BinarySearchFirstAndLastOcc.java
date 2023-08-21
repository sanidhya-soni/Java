package dsa.binary_search;

public class BinarySearchFirstAndLastOcc {

    int firstOccurance(int arr[], int size, int key)
    {
        int start = 0;
        int end = size - 1;
        int mid;
        int pos = -1;

        mid = start + (end - start)/2;

        while(start <= end)
        {
            if(arr[mid] == key)
            {
                pos = mid;
                end = mid - 1;
            }
            else if(arr[mid] > key)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
            
            mid = start + (end - start)/2;
        }
        return pos;
    }

    int lastOccurance(int arr[], int size, int key)
    {
        int start = 0;
        int end = size - 1;
        int mid;
        int pos = -1;

        mid = start + (end - start)/2;

        while(start <= end)
        {
            if(arr[mid] == key)
            {
                pos = mid;
                start = mid + 1;
            }
            else if(arr[mid] > key)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
            
            mid = start + (end - start)/2;
        }
        return pos;
    }

    public static void main(String[] args)
    {
        BinarySearchFirstAndLastOcc ob = new BinarySearchFirstAndLastOcc();
        int arr[] = {0, 1, 1, 1, 1, 2, 2, 2, 3};
        System.out.println(ob.firstOccurance(arr, arr.length, 2));
        System.out.println(ob.lastOccurance(arr, arr.length, 2));
    }
}
