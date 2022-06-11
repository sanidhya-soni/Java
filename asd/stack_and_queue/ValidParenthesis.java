package asd.stack_and_queue;

import java.util.Stack;

public class ValidParenthesis
{
    boolean validParenthesis(String s, int i, Stack<Character> braces)
    {
        if(s.length() == i && braces.size() > 0)
        {
            return false;
        }

        if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(')
        {
            braces.push(s.charAt(i));
            return validParenthesis(s, i + 1, braces);
        }
        if(braces.peek() == s.charAt(i))
        {
            braces.pop();
        }
        else
        {
            return false;
        }
        if(braces.size() == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        ValidParenthesis ob = new ValidParenthesis();

        String s = "{}";
        Stack<Character> braces = new Stack<Character>();
        System.out.println(ob.validParenthesis(s, 0, braces));
    }
}
