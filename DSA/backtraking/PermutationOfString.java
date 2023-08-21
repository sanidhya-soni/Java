package dsa.backtraking;

public class PermutationOfString
{
    void permutation(String str, String perm)
    {
        if(str.length() == 0)
        {
            System.out.println(perm);
            return;
        }
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutation(newStr, perm + ch);
        }
    }

    public static void main(String[] args)
    {
        PermutationOfString ob = new PermutationOfString();
        String s = new String("ABC");
        ob.permutation(s, "");
    }
}
