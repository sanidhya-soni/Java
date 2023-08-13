public class InsertionSort {

    void insert(int arr[], int pos, int i) {

    }

    public static void main(String[] args) {
        int arr[] = {6, 5, 2, 14, 9, 7};
        int len = arr.length, i, j;
        for (i = 1; i < len; i++) {
            int temp = arr[i];
            for(j = i-1; j >= 0; j--) {
                if(arr[j] > temp) {
                    arr[j+1] = arr[j];
                    continue;
                }
                break;
            }
            arr[j+1] = temp;
        }
        for (int k : arr) {
            System.out.println(k);
        }
    }
}
