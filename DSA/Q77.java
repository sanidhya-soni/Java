import java.util.Scanner;

public class Q77
{
    public static void main(String[] args)
    {
        Q77 ob = new Q77();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();

        for(int i = 0; i < s.length() - 1; i++)
        {
            for(int j = i + 1; j < s.length(); j++)
            {
                if((j + 1 != s.length() && ob.isPallindrome(s.substring(i, j + 1))) || (j + 1 == s.length() && ob.isPallindrome(s.substring(i))))
                {
                    // System.out.println("True");
                }
            }
        }
        sc.close();
    }

    boolean isPallindrome(String s)
    {
        String s_new = new String();
        for(int i = s.length() - 1; i >= 0; i--)
        {
            s_new = s_new + s.charAt(i);
        }
        if(s.equals(s_new))
            System.out.println(s);
        return s.equals(s_new);
    }
}



/*
 * Thissijlolji
 */