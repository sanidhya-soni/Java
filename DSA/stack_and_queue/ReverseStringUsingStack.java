package DSA.stack_and_queue;

import java.util.Stack;

public class ReverseStringUsingStack
{
    String reverse(String s)
    {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            st.push(s.charAt(i));
        }
        String rev = new String();
        while(!st.isEmpty())
        {
            rev = rev + st.pop();
        }
        return rev;
    }

    public static void main(String[] args)
    {
        ReverseStringUsingStack ob = new ReverseStringUsingStack();
        String s = new String("ayhdinaS");
        System.out.println(ob.reverse(s));
    }
}
