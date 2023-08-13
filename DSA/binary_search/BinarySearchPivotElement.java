package DSA.binary_search;

public class BinarySearchPivotElement
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

    public static void main(String[] args)
    {
        BinarySearchPivotElement ob = new BinarySearchPivotElement();
        int arr[] = {3, 1};
        System.out.println(ob.findPivot(arr, arr.length));
    }
}
