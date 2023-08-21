package dsa.recurssion;

public class Factorial
{

    int findFactorial(int a)
    {
        if(a == 0)
        {
            return 1;
        }
        return a * findFactorial(--a);
    }

    public static void main(String[] args)
    {
        Factorial ob = new Factorial();
        System.out.println(ob.findFactorial(5));
    }
}
