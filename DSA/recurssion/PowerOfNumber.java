package dsa.recurssion;

public class PowerOfNumber
{

    int power(int a, int b)
    {
        if(b == 0)
        {
            return 1;
        }
        return (a * power(a, --b));
    }

    public static void main(String[] args)
    {
        PowerOfNumber ob = new PowerOfNumber();
        int a = ob.power(3, 3);
        System.out.println("Sum = " + a);
    }
}
