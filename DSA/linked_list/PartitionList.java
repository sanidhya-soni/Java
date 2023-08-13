package DSA.linked_list;

public class PartitionList
{

    Node head, temp;

    void arrToLinkedList(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            Node newNode = new Node(arr[i]);
            if(i == 0)
            {
                head = newNode;
            }
            else
            {
                temp.next = newNode;
            }
            temp = newNode;
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

    Node partition(Node head, int p)
    {
        return head;
    }

    public static void main(String[] args)
    {
        PartitionList ob = new PartitionList();
        int arr[] = {1, 2, 3, 2, 4, 6};
        ob.arrToLinkedList(arr);
        ob.head = ob.partition(ob.head, 3);
        ob.display();
    }
}
