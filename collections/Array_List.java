package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List
{
    public static void main(String[] args)
    {

        // Declare a list
        ArrayList<Integer> a = new ArrayList<Integer>();

        // Add elements to a list
        a.add(5);
        a.add(15);
        a.add(20);
        // a.add(2); // For sorting
        System.out.println(a);

        // Add element at particular position
        a.add(1, 10);
        System.out.println(a);

        // Get element at a particular position
        System.out.println(a.get(2));

        // Change element at particular position
        a.set(3, 25);
        System.out.println(a);

        // Delete element
        a.remove(2);
        System.out.println(a);

        // Calculate size
        System.out.println(a.size());

        // Loop through arraylist
        for(int i = 0; i < a.size(); i++)
        {
            System.out.println(a.get(i));
        }

        // Sorting
        Collections.sort(a);
        System.out.println(a);
    }
}
