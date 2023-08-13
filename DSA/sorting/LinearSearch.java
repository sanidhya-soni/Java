package DSA.sorting;

public class LinearSearch
{
    boolean search(int[] arr, int size, int n)
    {
        if(size == 0)
            return false;

        if(arr[size - 1] == n)
            return true;
            
        return search(arr, size - 1, n);
    }

    public static void main(String[] args)
    {
        LinearSearch ob = new LinearSearch();
        int[] arr = {1, 5, 7, 9, 3, 2, 8};
        System.out.println(ob.search(arr, arr.length, 2));
    }
}
