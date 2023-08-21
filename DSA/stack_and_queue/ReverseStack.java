package dsa.stack_and_queue;

import java.util.Stack;

public class ReverseStack
{
    public void insertAtEnd(Stack<Integer> s, int n)
    {
        if(s.isEmpty())
        {
            s.push(n);
            return;
        }
        int x = s.pop();
        insertAtEnd(s, n);
        s.push(x);
    }

    void reverse(Stack<Integer> s)
    {
        if(s.isEmpty())
            return;
        int x = s.pop();
        reverse(s);
        insertAtEnd(s, x);
    }

    public static void main(String[] args)
    {
        ReverseStack ob = new ReverseStack();
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s);
        ob.reverse(s);
        System.out.println(s);
    }
}
