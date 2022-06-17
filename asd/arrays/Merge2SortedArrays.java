package asd.arrays;

public class Merge2SortedArrays
{
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int i, j, temp;
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
        }

        /* int arr[] = new int[m + n];
        
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
        
        for(i = 0; i < m + n; i++)
        {
            nums1[i] = arr[i];
        } */
    }

    
    public static void main(String[] args)
    {
        
    }
}
