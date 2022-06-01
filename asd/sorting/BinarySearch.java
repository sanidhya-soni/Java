package asd.sorting;

public class BinarySearch
{
    boolean search(int arr[], int start, int end, int n)
    {
        if(start > end)
        {
            return false;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == n)
        {
            return true;
        }
        else if(arr[mid] > n)
        {
            end = mid - 1;
        }
        else
        {
            start = mid + 1;
        }
        return search(arr, start, end, n);
    }

    public static void main(String[] args)
    {
        BinarySearch ob = new BinarySearch();
        int evenArr[] = {11, 27, 54, 64, 78, 96};
        int oddArr[] = {7, 11, 21, 65, 87};
        System.out.println(ob.search(evenArr, 0, evenArr.length - 1, 7));
        System.out.println(ob.search(oddArr, 0, evenArr.length - 1, 7));
    }
}
