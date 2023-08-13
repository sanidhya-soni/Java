public class QuickSort {

    static int partition(int arr[], int s, int e) {
        int pivotIndex = s;
        int pivotElement = arr[s];
        int count = 0;
        for(int i = s + 1; i <= e; i++) {
            if(arr[i] <= pivotElement) {
                count++;
            }
        }
        pivotIndex = s + count;
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[s];
        arr[s] = temp;
        int i = s, j = e;
        while(i < pivotIndex && j > pivotIndex) {
            while(arr[i] <= pivotElement) {
                i++;
            }
            while(arr[j] > pivotElement) {
                j--;
            }
            if(i < pivotIndex && j > pivotIndex) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return pivotIndex;
    }

    static void quickSort(int arr[], int s, int e) {
        if(s >= e) {
            return;
        }
        int pivotIndex = partition(arr, s, e);
        quickSort(arr, s, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, e);
    }

    public static void main(String[] args) {
        int arr[] = {6, 5, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 14, 9, 9, 9, 9, 9, 9, 1, 1, 1, 1, 1, 1, 1, 7};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
