package mypkg;

import java.util.Scanner;

public class MonteCarlo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, total = 0;
        System.out.print("Enter total no. of entries: ");
        n = sc.nextInt();
        String catagory[] = {"Filling", "crown", "cleaning", "extracting", "checkup"};
        int time_required[] = {45, 60, 15, 45, 15};
        int no_of_patients[] = {40, 15, 15, 10, 20};
        double prob[] = new double[n];
        double cumi_prob[] = new double[n];
        double cumi_sum = 0.0;
        int random_no[] = {40, 82, 11, 34, 25, 66, 17, 79};


        // Finding probability and cumulative probability
        for(int i = 0; i < n; i++)
        {
            prob[i] = no_of_patients[i] * 1.0 / total;
            cumi_sum = cumi_sum + prob[i];
            cumi_prob[i] = cumi_sum;
            System.out.println(prob[i] + " " + cumi_prob[i]);
        }

        
        
        sc.close();
    }
}
