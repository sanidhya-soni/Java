package DSA.binary_search;

public class BinarySearch
{

    int binarySearch(int arr[], int size, int key)
    {
        int start = 0;
        int end = size - 1;
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
        BinarySearch ob = new BinarySearch();
        int evenArr[] = {11, 27, 54, 64, 78, 96};
        int oddArr[] = {7, 11, 21, 65, 87};
        System.out.println(ob.binarySearch(evenArr, evenArr.length, 78));
        System.out.println(ob.binarySearch(oddArr, evenArr.length, 7));
    }
}
