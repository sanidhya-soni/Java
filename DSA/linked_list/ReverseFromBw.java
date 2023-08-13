package DSA.linked_list;

import DSA.recurssion.IsSorted;

public class ReverseFromBw
{
    Node head, temp;
    int length;

    ReverseFromBw()
    {
        this.head = null;
        this.temp = null;
        this.length = 0;
    }

    void insertAtEnd(int x)
    {
        Node newNode = new Node(x);
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            temp.next = newNode;
        }
        temp = newNode;
        length++;
    }
    
    void display()
    {
        System.out.println("\n");
        Node p;
        p = head;
        while(p != null)
        {
            System.out.println(p.data);
            p = p.next;
        }
        System.out.println("\n");
    }

    void reverseFromBw(int s, int e)
    {
        int i;
        Node start = head, current = head;
        for(i = 1; i < s; i++)
        {
            start = current;
            current = current.next;
        }

        Node prev = null, next = null, tempCurr = current;
        for(i = s; i <= e; i++)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        if(s > 1)
        {
            start.next = prev;
        }
        
        tempCurr.next = next;

        if(s == 1)
        {
            head = prev;
        }

    }

    public static void main(String[] args)
    {
        ReverseFromBw list = new ReverseFromBw();
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.insertAtEnd(15);
        list.insertAtEnd(20);
        list.insertAtEnd(25);
        list.display();
        list.reverseFromBw(1, 4);
        list.display();
    }
}
