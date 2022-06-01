package sani;

public class Bubble
{
    public static void main(String[] args)
    {
        int a[] = {5, 7, 9, 2, 5, 1, 7, 20, 14};
        int i, j;
        for(i = 0; i < a.length - 1; i++)
        {
            for(j = 0; j < a.length - i - 1; j++)
            {
                if(a[j] > a[j + 1])
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for(i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
