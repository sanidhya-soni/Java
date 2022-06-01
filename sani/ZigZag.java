package sani;

import java.util.Scanner;

public class ZigZag
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        int numRows, i, j;  
        System.out.print("Enter the String : ");
        s = sc.nextLine();
        System.out.print("Enter Number of Rows : ");
        numRows = sc.nextInt();
        for(i = 1; i <= numRows; i++)
        {
            for(j = 0; j < s.length(); j += numRows + 1)
            {
                System.out.println();
            }
        }
        sc.close();
    }
}
