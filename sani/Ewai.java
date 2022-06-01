package sani;

public class Ewai
{
    public static void main(String[] args)
    {
        int n = 5, sp = n * 2 - 2, i, j;
        for(i = 1; i <= n; i++, sp -= 2)
        {
            System.out.print('*');

            for(j = 1; j <= i - 2; j++)
            {
                System.out.print(' ');
            }

            if(i > 1)
            {
                System.out.print('*');
            }

            for(j = 1; j <= sp; j++)
            {
                System.out.print(' ');
            }

            if(i > 1)
            {
                System.out.print('*');
            }

            for(j = 1; j <= i - 2; j++)
            {
                System.out.print(' ');
            }

            System.out.print('*');
            System.out.println();
        }

        sp += 2;
        
        for(i = n; i >= 1; i--, sp += 2)
        {
            System.out.print('*');

            for(j = 1; j <= i - 2; j++)
            {
                System.out.print(' ');
            }

            if(i > 1)
            {
                System.out.print('*');
            }

            for(j = 1; j <= sp; j++)
            {
                System.out.print(' ');
            }

            if(i > 1)
            {
                System.out.print('*');
            }

            for(j = 1; j <= i - 2; j++)
            {
                System.out.print(' ');
            }

            System.out.print('*');
            System.out.println();
        }
    }
}
