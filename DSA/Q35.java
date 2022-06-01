package DSA;

import java.util.Scanner;

public class Q35
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, m, i;
        int[] a;
        System.out.print("Enter Array Size : ");
        n =sc.nextInt();
        a = new int[n];
        System.out.println("\nEnter Number of chocolates in packets.\n");
        for(i = 0; i < n; i++)
        {
            System.out.print("No. of chocolates in packet " + (i + 1) + " = ");
            a[i] = sc.nextInt();
        }
        System.out.print("\nEnter Number of Students : ");
        m = sc.nextInt();

//      Finding Minimum Difference starts from here.

        sc.close();
    }
}
