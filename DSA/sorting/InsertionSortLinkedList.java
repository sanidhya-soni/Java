package dsa.sorting;

// import java.util.Stack;

class Node
{
    int data;
    Node next;
    public Node(int x)
    {
        this.data = x;
        this.next = null;
    }
}

public class InsertionSortLinkedList
{

    Node head, temp, newNode;

    void insertInList(int x)
    {
        int data;
        data = x;;
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
    }

    void display(Node p)
    {
        while(p != null)
        {
            System.out.println(p.data);
            p = p.next;
        }
    }

    void insertAtBeginning(Node p)
    {
        p.next = head;
        head = p;
    }

    void insertAtSortedPos(Node curr)
    {
        if(curr.data <= head.data)
        {
            insertAtBeginning(curr);
            return;
        }
        Node start = head;
        while(start.data < curr.data && start.next != curr)
        {
            start = start.next;
        }
        start.next = curr;
    }

    void insertionSort(Node head)
    {
        Node i, temp;

        i = head.next;

        while(i != null)
        {
            temp = i.next;
            insertAtSortedPos(i);
            i = temp;
        }
    }

    public static void main(String[] args)
    {
        InsertionSortLinkedList ob = new InsertionSortLinkedList();
        
        ob.insertInList(50);
        ob.insertInList(40);
        ob.insertInList(30);
        ob.insertInList(20);
        ob.insertInList(10);
        ob.insertionSort(ob.head);
        ob.display(ob.head);
    }
}
