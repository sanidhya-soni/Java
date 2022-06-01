package DSA;

public class Q9
{
    public static void main(String[] args)
    {
        int a[] = {1, 0, 2, 1, 1, 0, 2, 2, 1, 1, 0, 0, 2, 0};

        //      Single scan using three-way partitioning

        int low = 0, mid = 0, high = a.length - 1, x = 0;
        while(mid <= high)
        {
            if(a[mid] == 0)
            {
                a[mid] = a[low];
                a[low] = 0;
                low++;
                mid++;
            }
            else if(a[mid] == 1)
            {
                mid++;
            }
            else if(a[mid] == 2)
            {
                a[mid] = a[high];
                a[high] = 2;
                high--;
            }
            x++;
        }

        //      Double Traversal (Brute Force approach)

        /* int i, x = 0, zero = 0, one = 0, two = 0;
        for(i = 0; i < a.length; i++)
        {
            if(a[i] == 0)
            {
                zero++;
            }
            else if(a[i] == 1)
            {
                one++;
            }
            else if(a[i] == 2)
            {
                two++;
            }
            x++;
        }
        for(i = 0; i < a.length; i++)
        {
            if(zero > 0)
            {
                a[i] = 0;
                zero--;
            }
            else if(one > zero)
            {
                a[i] = 1;
                one--;
            }
            else if(two > 0)
            {
                a[i] = 2;
                two--;
            }
            x++;
        } */
        for(int z : a)
        {
            System.out.print(z + " ");
        }
        System.out.println("\n" + x);
    }
}
