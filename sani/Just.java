package sani;

import java.util.ArrayList;
import java.util.Scanner;

public class Just
{
    /*public static void main(String[] args)
    {
        Just j = new Just();
        LinkedList<Integer> li = new LinkedList<Integer>();
        li.add(5);
        li.add(6);
        li.add(5);
        li.add(5);
        li.add(5);
        li.add(6);
        li.addAll(li);
        System.out.println(li.size());
        j.display();
    }

    class Xyz
    {
        static String s = "New";
        void display()
        {
            System.out.println(s);
        }
    }

    static int x = 0;

    void display()
    {
        Xyz x = new Xyz();
        x.display();
    }

    static
    {
        System.out.println("Shuru");
    }
    static
    {
        System.out.println("Han Shuru");
    }*/


    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int n, d, q, x, y, i, j;
        n = sc.nextInt();
        ArrayList[] ar = new ArrayList[n];
        for(i = 0; i < n; i++)
        {
            d = sc.nextInt();
            ar[i] = new ArrayList();
            for(j = 0; j < d; j++)
            {
                ar[i].add(sc.nextInt());
            }
        }
        q = sc.nextInt();
        for(i = 0; i < q; i++)
        {
            x = sc.nextInt();
            y = sc.nextInt();
            try
            {
                System.out.println(ar[x - 1].get(y - 1));
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }
    }
}