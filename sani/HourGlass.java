package sani;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class HourGlass
{
    public static void main(String[] args)
    {
        int r, c, i, j;
        List<List<Integer>> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        r = sc.nextInt();
        System.out.print("Enter Columns : ");
        c = sc.nextInt();

        System.out.println("Enter elements of matrix");
        for(i = 0; i < r; i++)
        {
            arr.add(new ArrayList<Integer>());
            for (j = 0; j < c; j++)
            {
                arr.get(i).add(sc.nextInt());
            }
        }

        System.out.println("Your Matrix is\n");
        for(i = 0; i < r; i++)
        {
            for(j = 0; j < c; j++)
            {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }

        System.out.println(hourglassSum(arr));

        /*for(i = 0; i < r - 2; i++)
        {
            for(j = 0; j < c - 2; j++)
            {
                System.out.println(a[i][j] + " " + a[i][j + 1] + " " + a[i][j + 2]);
                System.out.println("  " + a[i + 1][j + 1]);
                System.out.println(a[i + 2][j] + " " + a[i + 2][j + 1] + " " + a[i + 2][j + 2]);
            }
            System.out.println();
        }*/
    }

    public static int hourglassSum(List<List<Integer>> arr)
    {
        int max_sum = Integer.MIN_VALUE, i, j, sum = 0;
        for(i = 0; i < arr.size() - 2; i++)
        {
            for(j = 0; j < arr.get(i).size() - 2; j++)
            {
                sum = 0;
                sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1) +
                        arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                if(sum > max_sum)
                {
                    max_sum = sum;
                }
            }
        }
        return max_sum;
    }
}
