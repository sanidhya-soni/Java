package DSA.linked_list;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Merge
{
    Node head1, head2, merge;
    int len1, len2;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException
    {
        Merge m = new Merge();
        System.out.println("For Linked List 1\n");
        m.head1 = m.create();
        m.len1 = m.length(m.head1);
        m.sort(m.head1, m.len1);
        System.out.println("For Linked List 2\n");
        m.head2 = m.create();
        m.len2 = m.length(m.head2);
        m.sort(m.head2, m.len2);
        m.display(m.head1);
        m.display(m.head2);
        m.merge();
    }

    Node create() throws IOException
    {
        Node head = null, temp = null;
        int data;
        byte ch = 1;
        while(ch == 1)
        {
            System.out.print("\nEnter Data to be Inserted : ");
            data = Integer.parseInt(br.readLine());
            Node newNode = new Node(data);
            if(head == null)
            {
                head = newNode;
            }
            else
            {
                temp.next = newNode;
            }
            temp = newNode;
            System.out.print("Enter 1 to Input more numbers or 0 to stop : ");
            ch = Byte.parseByte(br.readLine());
        }
        return head;
    }

    int length(Node head)
    {
        int len = 0;
        if(head == null)
        {
            return len;
        }
        while(head.next != null)
        {
            len++;
            head = head.next;
        }
        len++;
        return len;
    }

    void sort(Node head, int len)
    {
        Node p;
        int i, j;
        for(i = 1; i < len; i++)
        {
            p = head;
            for(j = 1; j <= len - i; j++)
            {
                if(p.data > p.next.data)
                {
                    swap(p);
                }
                p = p.next;
            }
        }
    }

    void swap(Node p)
    {
        int x;
        x = p.data;
        p.data = p.next.data;
        p.next.data = x;
    }

    void merge()
    {
        if(head1 == null && head2 != null)
        {
            merge = head2;
        }
        else if(head1 != null && head2 == null)
        {
            merge = head1;
        }
        else if(head1 != null && head2 != null)
        {
            
        }
    }

    void display(Node head)
    {
        System.out.println("\n");
        Node p;
        p = head;
        while(p != null)
        {
            System.out.println(p.data);
            p = p.next;
        }
    }
}
