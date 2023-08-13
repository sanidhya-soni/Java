package DSA.stack_and_queue;

import java.util.Stack;

public class RemoveMidFromStack
{
    void removeMid(Stack<Integer> num, int mid)
    {
        if(mid == num.size())
        {
            num.pop();
            return;
        }
        int x = num.pop();
        removeMid(num, mid);
        num.push(x);
    }

    public static void main(String[] args)
    {
        RemoveMidFromStack ob = new RemoveMidFromStack();

        Stack<Integer> num = new Stack<Integer>();
        num.push(5);
        num.push(6);
        num.push(7);
        num.push(8);
        num.push(9);
        num.push(10);
        num.push(11);
        num.push(11);

        System.out.println(num);
        ob.removeMid(num, num.size() / 2 + 1);
        System.out.println("\n" + num);

    }
}
