package DSA.linked_list;

import java.io.IOException;

public class MidOfLinkedList
{
    int findMid(Node head)
    {
        Node slow = head, fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public static void main(String[] args)throws IOException
    {
        MidOfLinkedList ob = new MidOfLinkedList();
        Source list = new Source();
        list.create();
        Node head = list.head;
        System.out.println(ob.findMid(head));
    }
}
