package asd.binary_search;

public class BinarySearchMountainArrayPeak
{

    int findPeak(int arr[], int size)
    {
        int start = 0;
        int end = size - 1;
        int mid;

        mid = start + (end - start)/2;

        while(start < end)
        {
            if(arr[mid] < arr[mid + 1])
            {
                start = mid + 1;
            }
            else
            {
                end = mid;
            }

            mid = start + (end - start)/2;
        }

        return arr[start];
    }

    public static void main(String[] args)
    {
        BinarySearchMountainArrayPeak ob = new BinarySearchMountainArrayPeak();
        int arr[] = {1, 2, 3, 7, 2, 1};
        System.out.println(ob.findPeak(arr, arr.length));
    }
}
