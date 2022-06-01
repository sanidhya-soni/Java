package cca_pro.stages;

import java.util.Scanner;
import java.io.*;

public class Stage3
{
    public static void main(String[] args) throws IOException
    {
        // Asking Name
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = sc.nextLine();
        sc.close();

        // Creating File
        File names = new File("names.txt");
        names.createNewFile();

        // Writing File
        FileWriter fw = new FileWriter(names);
        fw.write(name);
        fw.close();

        // Reading File
        Scanner reader = new Scanner(names);
        String read_name = reader.nextLine();
        reader.close();

        // Printing Message
        System.out.println("Hello " + read_name);
    }
}
