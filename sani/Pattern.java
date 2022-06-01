package sani;

public class Pattern
{
    public static void main(String[] args)
    {
        int n = 3, i, j, sp = n - 1, star = n;
        for(i = 1; i <= n / 2 + 1; i++, sp--)
        {
            for(j = 1; j <= sp; j++)
            {
                System.out.print("  ");
            }

            for(j = 1; j <= star; j++)
            {
                System.out.print("* ");
            }

            star+=2;
            System.out.println();
        }

        star-=4;
        sp+=2;

        for(i = n / 2; i >= 1; i--, sp++)
        {
            for(j = 1; j <= sp; j++)
            {
                System.out.print("  ");
            }

            for(j = 1; j <= star; j++)
            {
                System.out.print("* ");
            }

            star-=2;
            System.out.println();
        }
    }
}


 /*    * * *
     * * * * *
       * * *      */