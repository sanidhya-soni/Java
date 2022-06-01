package cca_pro.stages;

import java.util.Scanner;

public class Stage2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        sc.close();
    }
}
