package collections;

import java.util.LinkedList;
import java.util.Collections;

public class Linked_List
{
    public static void main(String[] args)
    {

        // Declare a list
        LinkedList<Integer> list = new LinkedList<Integer>();

        // Add elements to a list
        list.add(5);
        list.add(15);
        list.add(20);
        // list.add(2); // For sorting
        System.out.println(list);

        // Add element at particular position
        list.add(1, 10);
        System.out.println(list);

        // Get element at a particular position
        System.out.println(list.get(2));

        // Change element at particular position
        list.set(3, 25);
        System.out.println(list);

        // Delete element
        list.remove(2);
        System.out.println(list);

        // Calculate size
        System.out.println(list.size());

        // Loop through LinkedList
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        // Sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
