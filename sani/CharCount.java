package sani;

public class CharCount
{
    char c = 'e';
    int x = 0;
    public static void main(String[] args)
    {
        CharCount ob = new CharCount();
        String s = "Hello Hello";
        // char c = 'l';
        ob.count(s);
        System.out.println(ob.x);
    }
    void count(String s)
    {
        if(s.indexOf(c) != -1)
        {
            count(s.substring(s.indexOf(c) + 1));
            x++;
        }
        return;
    }
}
