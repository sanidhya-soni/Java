package asd.recurssion;

public class SayDigit
{
    void digits(int n)
    {
        if(n == 0)
        {
            return;
        }
        digits(n/10);
        System.out.println(n%10);
        // digits(n/10);
    }

    public static void main(String[] args)
    {
        SayDigit ob = new SayDigit();
        ob.digits(58946);
    }
}
