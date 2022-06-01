package sani;

public class Rec
{

    // Pattern


    /* public static void main(String[] args)
    {
        Rec r = new Rec();
        r.level1(5);
        
    }
    void level1(int x)
    {
        if(x == 0)
        {
            return;
        }
        else
        {
            level1(x - 1);
            level2(x);
            System.out.println();
        }
    }

    void level2(int x)
    {
        if(x == 0)
        {
            return;
        }
        else
        {
            level2(x - 1);
            System.out.print(x + " ");
        }
    } */

    static int a[] = {5, 7, 9, 2, 5, 1, 7, 20, 14};

    public static void main(String[] args)
    {
        Rec r = new Rec();
        r.sort1(a.length - 2);     //     Problem solves if we replace 2 with 1
        for(int i : a)
        {
            System.out.print(i + " ");
        }
    }

    void sort1(int x)
    {
        if(x == -1)
        {
            return;
        }
        else
        {
            sort1(x - 1);
            sort2(x);
        }
    }

    void sort2(int x)
    {
        if(x == -1)
        {
            return;
        }
        else
        {
            sort2(x - 1);
            if(a[x] > a[x + 1])
            {
                int temp = a[x];
                a[x] = a[x + 1];
                a[x + 1] = temp;
            }
            for(int i : a)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
