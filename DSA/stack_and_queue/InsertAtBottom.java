package dsa.stack_and_queue;

import java.util.Stack;

public class InsertAtBottom
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

    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        s.push(25);
        InsertAtBottom ob = new InsertAtBottom();
        ob.insertAtEnd(s, 0);
        System.out.println(s);
    }
}
