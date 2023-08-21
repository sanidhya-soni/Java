package dsa.stack_and_queue;

import java.util.ArrayList;
// import java.util.Stack;

public class StackClass
{
    ArrayList<Integer> stack = new ArrayList<Integer>();

    public boolean isEmpty()
    {
        return stack.size() == 0;
    }

    public void push(int x)
    {
        stack.add(x);
    }

    public int pop()
    {
        if(isEmpty())
            return -1;

        return stack.remove(stack.size() - 1);
    }

    public int peek()
    {
        if(isEmpty())
            return -1;

        return stack.get(stack.size() - 1);
    }

    public void display()
    {
        if(isEmpty())
            return;
        int x = this.pop();
        System.out.println(x);
        display();
        this.push(x);
    }

    public static void main(String[] args)
    {
        StackClass s = new StackClass();
        // Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        // System.out.println(s.peek());
        // System.out.println(s.pop());
        // System.out.println(s.peek());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        s.display();
        System.out.println(s.peek());
    }
}
