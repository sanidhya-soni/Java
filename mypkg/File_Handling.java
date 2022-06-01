package mypkg;

import java.util.*;
import java.io.*;

public class File_Handling
{
    public static void main(String[] args)throws IOException
    {
        File myfile = new File("test.txt");
        myfile.createNewFile();
        FileWriter fw = new FileWriter(myfile);
        fw.write("Sanidhya Soni");
        // System.out.println(myfile.getName());
        fw.close();
    }
}
