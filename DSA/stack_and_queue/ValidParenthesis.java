package DSA.stack_and_queue;

import java.util.Stack;

public class ValidParenthesis
{

    boolean validParenthesis(String s, Stack<Character> braces)
    {
        int i;
        for(i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
            {
                braces.push(s.charAt(i));
            }
            else
            {
                if(!braces.isEmpty())
                {   char ch = s.charAt(i);
                    if(braces.peek() == '(' && ch == ')' || braces.peek() == '{' && ch == '}' || braces.peek() == '[' && ch == ']')
                    {
                        braces.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
        }
        if(braces.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        ValidParenthesis ob = new ValidParenthesis();
        String s = "{{(){}}})";
        Stack<Character> braces = new Stack<Character>();
        System.out.println(ob.validParenthesis(s, braces));
    }
}
