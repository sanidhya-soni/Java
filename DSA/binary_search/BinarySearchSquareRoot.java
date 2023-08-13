package DSA.binary_search;

public class BinarySearchSquareRoot
{

    int sqrtInteger(int n)
    {
        int start = 0;
        int end = n;
        int mid = start + (end - start)/2;
        int sqrt = -1;
        while(start <= end)
        {
            if(mid * mid == n)
                return mid;

            if(mid * mid > n)
            {
                end = mid - 1;
            }
            else
            {
                sqrt = mid;
                start = mid + 1;
            }
            mid = start + (end - start)/2;
        }

        return sqrt;
    }

    double addPrecision(int n, int precision, int intsqrt)
    {
        double factor = 1.0;
        double sol = intsqrt, x;

        for(int i = 1; i <= precision; i++)
        {
            factor /= 10.0;
            /* for(j = 0; j <= 9; j++)
            {
                x = (sol + (factor * j)) * (sol + (factor * j));
                if(x > n)
                {
                    break;
                }
            }
            sol = sol + (factor * (j - 1)); */

            for(double j = sol; j * j < n; j += factor)
            {
                sol = j;
            }
        }
        return sol;
    }

    public static void main(String[] args)
    {
        int n = 37;
        BinarySearchSquareRoot ob = new BinarySearchSquareRoot();
        int sqrt = ob.sqrtInteger(n);
        System.out.println(ob.addPrecision(n, 3, sqrt));
    }
}
