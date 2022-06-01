package linked_list;

public class SelectionSort
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

    void sort(int len)
    {
        Node p = head, q = head, min;
        for(p = head; p.next != null; p = p.next)
        {
            min = p;
            for(q = p.next; q != null; q = q.next)
            {
                if(q.data < min.data)
                {
                    min = q;
                }
            }
            int temp = p.data;
            p.data = min.data;
            min.data = temp;
        }
    }

    public static void main(String[] args)
    {
        SelectionSort ob = new SelectionSort();
        int arr[] = {10, 2, 3, 2, 4, 6};
        ob.arrToLinkedList(arr);

        ob.sort(arr.length);

        ob.display();
    }
}
