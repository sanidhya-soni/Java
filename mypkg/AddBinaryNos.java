package mypkg;
import java.util.Scanner;
import java.util.Stack;

public class AddBinaryNos
{

    String add(String[] nos, int max)
    {
        String ans = new String();
        Stack<Character> s1 = new Stack<Character>();
        Stack<Character> s2 = new Stack<Character>();

        for(int i = 0; i < max; i++)
        {
            for(int j = 0; j < nos.length; j++)
            {
                s1.push((nos[j].length() > 0)? nos[j].charAt(nos[j].length() - 1): '0');
            }
            while(!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
            int one_c = 0;
            while(!s1.isEmpty())
            {
                char x = s1.pop();
                if(x == '1')
                    one_c++;
                
                if(one_c == 2)
                {
                    s2.push('1');
                    one_c = 0;
                }
            }
            if(one_c == 1)
            {
                ans = "1" + ans;
            }
            else
            {
                ans = "0" + ans;
            }
        }
        
        return ans;
    }

    // String recc(Stack<Character> s)
    // {
    //     int x = s.size();
    //     for(int i = 0; i < x; i++)
    //     {
            
    //     }
    // }

    public static void main(String[] args)
    {
        AddBinaryNos ob = new AddBinaryNos();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of binary numbers you want to add: ");
        int n = sc.nextInt();
        String[] nos = new String[n];
        int max = 0;

        System.out.println("Enter " + n + " nos. one by one followed by an enter: ");
        sc.nextLine();
        for(int i = 0; i < n; i++)
        {
            nos[i] = sc.nextLine();
            if(nos[i].length() > max)
            {
                max = nos[i].length();
            }
        }

        String ans = ob.add(nos, max);
        System.out.println("Ans: " + ans);
        sc.close();
    }
}
