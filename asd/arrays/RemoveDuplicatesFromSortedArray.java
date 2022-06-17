package asd.arrays;

public class RemoveDuplicatesFromSortedArray
{
    int removeDup(int nums[])
    {
        int i, j, x = 1;
        for(i = 0; i < nums.length - x;)
        {
            if(nums[i] == nums[i + 1])
            {
                for(j = i; j < nums.length - x; j++)
                {
                    nums[j] = nums[j + 1];
                }
                x++;
            }
            else
            {
                i++;
            }
        }
        return nums.length - x + 1;
    }
<<<<<<< HEAD
=======

    public static void main(String[] args)
    {
        
    }
>>>>>>> 42c08e32b99c03f60208e6b6b38165a5da3de7a4
}
