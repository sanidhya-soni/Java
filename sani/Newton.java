package sani;
import java.util.Scanner;
public class Newton
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        for(int u = 1; u <= p; u++)
        {
            int n = sc.nextInt();
            int m = n, i, j;
            int x = 0;
            for(i = 1; i <= n; i++)
            {
                for(j = 0; j < i; j++)
                {
                    if(j * 2 == i)
                    {
                        m--;
                        x = 1;
                        break;
                    }
                }
                if(x == 1)
                {
                    i = j + 1;
                }
            }
            System.out.println(m);
        }
        sc.close();
    }
}
