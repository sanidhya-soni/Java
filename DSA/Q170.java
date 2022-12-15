package DSA;

import java.util.Stack;

public class Q170
{
    void multiply(Node h1, Node h2)
    {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();

        while(h1 != null)
        {
            s1.push(h1.data);
            h1 = h1.next;
        }
        while(h2 != null)
        {
            s2.push(h2.data);
            h2 = h2.next;
        }

        int a, b, c, carry = 0;

        while(!s1.isEmpty() && !s2.isEmpty())
        {
            a = s1.pop();
            b = s2.pop();
            c = a * b + carry;
            carry = c / 10;
            System.out.print(c % 10 + "");
        }
        while(!s1.isEmpty())
        {
            c = s1.pop() + carry;
            carry = c / 10;
            System.out.print(c + "");
        }
        while(!s2.isEmpty())
        {
            c = s2.pop() + carry;
            carry = c / 10;
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        
    }
}
