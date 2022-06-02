package asd.recurssion;

public class LinearSearch
{
    int search(int arr[], int n, int key)
    {
        if(n == -1) {
            return -1;
        }
        if(arr[n] == key) {
            return n + 1;
        }
        return search(arr, n - 1, key);
    }

    public static void main(String[] args)
    {
        LinearSearch ob = new LinearSearch();
        int arr[] = {1, 5, 7, 9, 3, 2, 8};
        System.out.println(ob.search(arr, arr.length - 1, 80));
    }
}
