package asd.stack_and_queue;

import java.util.Stack;

public class MinimumBracketReversal
{

    void removeValid(String s)
    {

        Stack<Character> st = new Stack<>();
        st.push('\0');

        // int opening = 0, closing = 0;
        int reverse = 0;
        char ch;
        for(int i = 0; i < s.length(); i++)
        {
            ch = s.charAt(i);
            if(ch == '}' && st.peek() == '{')
            {
                st.pop();
                // opening--;
            }
            else
            {
                st.push(ch);
                // int a = (ch == '{')? opening++: closing++;
            }
        }

        System.out.println(st);
        // System.out.println("Opening = " + opening);
        // System.out.println("Closing = " + closing);
        
        int count = 0;
        while(st.peek() == '{')
        {
            count++;
            st.pop();
        }

        if(count % 2 != 0)
        {
            st.pop();
            reverse = count / 2 + 2;
        }
        else
        {
            reverse = count / 2;
        }

        reverse = reverse + (st.size() - 1) / 2;

        System.out.println(reverse);

    }

    public static void main(String[] args)
    {
        MinimumBracketReversal ob = new MinimumBracketReversal();
        ob.removeValid("{}}}}{{}");
    }
}
