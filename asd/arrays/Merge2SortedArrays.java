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
    }

    public static void main(String[] args)
    {
        
    }
}
