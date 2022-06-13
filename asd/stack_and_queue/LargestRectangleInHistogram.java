package asd.stack_and_queue;

import java.util.Stack;

public class LargestRectangleInHistogram
{

    public int[] nextSmallerElement(int[] arr)
    {
        int ans[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        stack.push(-1);

        for(int i = arr.length - 1; i >= 0; i--)
        {
            int x = arr[i];
            while(x <= stack.peek() && stack.peek() != -1)
            {
                stack.pop();
            }
            ans[i] = stack.peek();
            stack.push(x);
        }
        
        return ans;
    }

    public int[] prevSmallerElement(int[] arr)
    {
        int ans[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        stack.push(-1);

        for(int i = 0; i < arr.length; i++)
        {
            int x = arr[i];
            while(x <= stack.peek() && stack.peek() != -1)
            {
                stack.pop();
            }
            ans[i] = stack.peek();
            stack.push(x);
        }
        
        return ans;
    }

    public int largestRectangleArea(int[] heights)
    {
        int[] next = new int[heights.length];
        next = nextSmallerElement(heights);
        
        int[] prev = new int[heights.length];
        prev = nextSmallerElement(heights);
        
        int area = -10000;
        
        for(int i = 0; i < heights.length; i++)
        {
            int l = heights[i];
            if(next[i] == -1)
                next[i] = heights.length;
            int b = next[i] - prev[i] - 1;
            int newArea = l * b;
            area = Math.max(area, newArea);
        }
        
        return area;
    }

    public static void main(String[] args)
    {
        LargestRectangleInHistogram ob = new LargestRectangleInHistogram();
        int area = ob.largestRectangleArea(new int[] {2, 1, 5, 6, 2, 3});
        System.out.println("Area = " + area);
    }
}
