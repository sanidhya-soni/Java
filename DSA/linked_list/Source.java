package DSA.linked_list;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Source
{
    Node head, temp;
    int length;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Source()
    {
        this.head = null;
        this.temp = null;
        this.length = 0;
    }

    public static void main(String[] args)throws IOException
    {
        Source src = new Source();
        byte ch;
        boolean toRun = true;
        while(toRun)
        {
            System.out.println("Enter 1 to create list or inset in the list");
            System.out.println("Enter 2 to inset in the beginning of the list");
            System.out.println("Enter 3 to inset in the end of the list");
            System.out.println("Enter 4 to inset in particular position in the list");
            System.out.println("Enter 5 to delete from beginning in the list");
            System.out.println("Enter 6 to delete from end in the list");
            System.out.println("Enter 7 to delete from particular position in the list");
            System.out.println("Enter 8 to reverse the list");
            System.out.println("Enter 9 to sort the list");
            System.out.println("Enter 10 to display the list");
            System.out.println("Enter 11 to terminate the application\n");
            System.out.print("Enter Your Choice : ");
            ch = Byte.parseByte(br.readLine());
            switch(ch)
            {
                case 1:
                    src.create();
                    break;
                case 2:
                    src.insertAtBeginning();
                    break;
                case 3:
                    src.insertAtEnd();
                    break;
                case 4:
                    src.insertAtParticularPosition();
                    break;
                case 5:
                    src.deleteFromBeginning();
                    break;
                case 6:
                    src.deleteFromEnd();
                    break;
                case 7:
                    src.deleteFromParticularPosition();
                    break;
                case 8:
                    src.reverse(null, src.head);
                    break;
                case 9:
                    // src.sort();
                    break;
                case 10:
                    src.display();
                    break;
                case 11:
                    toRun = false;
                    break;
                default:
                    System.out.println("Enter Right Choice !");
                    break;
            }
        }
    }

    void create()throws IOException
    {
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
            length++;
            System.out.print("Enter 1 to Input more numbers or 0 to stop : ");
            ch = Byte.parseByte(br.readLine());
        }
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

    void insertAtBeginning()throws IOException
    {
        int data;
        System.out.print("Enter Data to be Inserted : ");
        data = Integer.parseInt(br.readLine());
        Node newNode = new Node(data);
        if(head != null)
        {
            newNode.next = head;
        }
        head = newNode;
        length++;
    }

    void insertAtEnd()throws IOException
    {
        int data;
        System.out.print("Enter Data to be Inserted : ");
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
        length++;
    }

    void insertAtParticularPosition()throws IOException
    {
        Node p = head;
        int data, pos, i;
        System.out.print("Enter position at which data is to be inserted : ");
        pos = Integer.parseInt(br.readLine());
        if(pos == 1)
        {
            insertAtBeginning();
        }
        else if(pos == length)
        {
            deleteFromEnd();
        }
        else if(pos > 1 && pos < length)
        {
            System.out.print("Enter Data to be Inserted : ");
            data = Integer.parseInt(br.readLine());
            Node newNode = new Node(data);
            for(i = 0; i < pos - 2; i++)
            {
                p = p.next;
            }
            newNode.next = p.next;
            p.next = newNode;
        }
    }

    void deleteFromBeginning()
    {
        head = head.next;
        length--;
    }

    void deleteFromEnd()
    {
        Node p = head;
        while(p.next.next != null)
        {
            p = p.next;
        }
        p.next = null;
        temp = p;
        length--;
    }

    void deleteFromParticularPosition()throws IOException
    {
        int pos, i;
        Node p = head;
        System.out.print("Enter the positin from which element is to be removed : ");
        pos = Integer.parseInt(br.readLine());
        for(i = 0; i < pos - 2; i++)
        {
            p = p.next;
        }
        p.next = p.next.next;
    }

    void reverse()
    {
        Node prev = null, current = head, next = null;
        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        System.out.println("List Reversed Succesfully !");
    }
    
    void reverse(Node prev, Node curr)
    {
        if(curr == null)
        {
            head = prev;
            return;
        }
        Node next  = curr.next;
        reverse(curr, next);
        curr.next = prev;
    }

}
