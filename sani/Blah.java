package sani;

public class Blah
{
    public static void main(String[] args)
    {
        int[] nums = {3, 2, 2, 3};
        int val = 2;
        int j = 0, i;
        for(i = 0; i < nums.length; i++)
        {
            if(nums[i] != val)
            {
                nums[j] = nums[i];
                j++;
            }
        }
        for(i = 0; i < j; i++)
        {
            System.out.println(nums[i]);
        }
    }
}
