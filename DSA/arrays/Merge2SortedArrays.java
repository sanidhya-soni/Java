package DSA.arrays;

public class Merge2SortedArrays
{
    public int[] merge(int[] nums1, int m, int[] nums2, int n)
    {
        /* int i, j, temp;
        for(i = 0; i < n; i++)
        {
            temp = nums2[i];
            for(j = i + m - 1; j >= 0; j--)
            {
                if(temp < nums1[j])
                {
                    nums1[j + 1] = nums1[j];
                }
                else
                {
                    break;
                }
            }
            nums1[j + 1] = temp;
        } */

        int arr[] = new int[m + n];
        
        int i = 0, j = 0, k = 0;
        
        while(i < m && j < n)
        {
            if(nums1[i] < nums2[j])
            {
                arr[k] = nums1[i];
                k++;
                i++;
            }
            else
            {
                arr[k] = nums2[j];
                k++;
                j++;
            }
        }
        
        
        while(i < m)
        {
            arr[k] = nums1[i];
            k++;
            i++;
        }
        
        while(j < n)
        {
            arr[k] = nums2[j];
            k++;
            j++;
        }

        return arr;
    }

    
    public static void main(String[] args)
    {
        Merge2SortedArrays ob = new Merge2SortedArrays();
        int nums1[] = {1, 2, 3, 5, 8, 9};
        int nums2[] = {0, 4, 6, 7};

        int arr[] = ob.merge(nums1, nums1.length, nums2, nums2.length);

        for (int i : arr) {
            System.out.println(i);
        }

        
    }
}
