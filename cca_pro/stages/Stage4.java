package cca_pro.stages;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Stage4
{
    public static void main(String[] args)throws IOException
    {

        // Create File
        File names = new File("names.txt");
        names.createNewFile();

        // Write File
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter(names);
        System.out.println("Enter Names: (Enter 0 to stop entering)");
        String name = "";
        while(true)
        {
            System.out.print("Name: ");
            name = sc.nextLine();
            if(name.equals("0"))
            {
                break;
            }
            else
            {
                fw.write(name + "\n");
            }
        }
        sc.close();
        fw.close();

        // Read File
        Scanner reader = new Scanner(names);
        while(reader.hasNext())
        {
            System.out.println("Hello " + reader.nextLine());
        }
        reader.close();
    }
}
