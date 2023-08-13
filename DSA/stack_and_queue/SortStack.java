package DSA.stack_and_queue;

import java.util.Stack;

public class SortStack
{
    void sortStack(Stack<Integer> nums)
    {
        if(nums.isEmpty())
        {
            return;
        }
        int x = nums.pop();
        sortStack(nums);
        rightPlace(nums, x);
    }

    void rightPlace(Stack<Integer> nums, int z)
    {
        if(nums.isEmpty() || (!nums.isEmpty() && nums.peek() < z))
        {
            nums.push(z);
            return;
        }
        int a = nums.pop();
        rightPlace(nums, z);
        nums.push(a);
    }

    public static void main(String[] args)
    {
        SortStack ob = new SortStack();

        Stack<Integer> nums = new Stack<>();
        
        nums.push(14);
        nums.push(15);
        nums.push(16);
        nums.push(10);
        nums.push(11);
        nums.push(12);
        nums.push(13);
        
        ob.sortStack(nums);

        System.out.println(nums);

    }
}
