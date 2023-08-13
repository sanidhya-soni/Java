package DSA.stack_and_queue;

import java.util.LinkedList;

public class QueueFromLinkedList
{
    LinkedList<Integer> queue = new LinkedList<>();

    void add(int x)
    {
        queue.add(x);
    }

    int remove()
    {
        return queue.removeFirst();
    }

    int peek()
    {
        return queue.getFirst();
    }

    public static void main(String[] args)
    {
        QueueFromLinkedList q = new QueueFromLinkedList();
        q.add(5);
        q.add(15);
        q.add(25);
        q.add(35);
        System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());
        System.out.println(q.peek());
    }
}
