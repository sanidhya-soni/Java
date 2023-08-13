package DSA.doubley_linked_list;

import java.util.Scanner;

public class Source
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Node head = null, temp = null, newnode = null, tail = null;
        int ch = 1;
        while(ch == 1)
        {
            newnode = new Node();
            System.out.print("Enter Data : ");
            newnode.data = sc.nextInt();
            if(head == null)
            {
                head = newnode;
            }
            else
            {
                newnode.prev = temp;
                temp.next = newnode;
            }
            temp = tail = newnode;
            System.out.print("Enter 1 for entering more entries or enter other number to exit : ");
            ch = sc.nextInt();
        }
        Node n = tail;

        Node current = head;
        temp = null;
        while(current != null)
        {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        head = tail;

        while(head != null)
        {
            System.out.println(head.data);
            head = head.next;
        }
        sc.close();
    }
}
