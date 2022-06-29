package sani;

import java.util.Stack;

public class NextSmaller
{

    int[] nextSmaller(int arr[])
    {
        int ans[] = new int[arr.length];

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for(int i = arr.length - 1; i >= 0; i--)
        {
            while(stack.peek() > arr[i])
            {
                stack.pop();
            }
            ans[i] = stack.peek();
            stack.push(arr[i]);
        }
        
        return ans;
    }

    public static void main(String[] args)
    {
        NextSmaller ob = new NextSmaller();
        int arr[] = {2, 5, 4, 3, 2, 1};
        arr = ob.nextSmaller(arr);
        for (int i : arr)
            System.out.print(i + ", ");
    }
}
