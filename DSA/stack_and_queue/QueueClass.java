package dsa.stack_and_queue;

public class QueueClass
{
    int arr[];
    int size;
    int rear;
    int front;

    QueueClass(int n)
    {
        this.size = n;
        this.arr = new int[size];
        this.rear = -1;
        this.front = -1;
    }

    void enqueue(int x)
    {
        if(rear == -1)
        {
            arr[++rear] = x;
            return;
        }
        if(isFull())
        {
            System.out.println("Full");
            return;
        }
        arr[++rear] = x;
    }

    int dequeue()
    {
        if(isEmpty())
            return -1;
        int front = arr[0];
        for(int i = 0; i < rear; i++)
        {
            arr[i] = arr[i + 1];
        }
        rear--;
        return front;
    }

    int peek()
    {
        if(isEmpty())
            return -1;
        return arr[0];
    }

    boolean isEmpty()
    {
        return rear == -1;
    }

    boolean isFull()
    {
        return rear == size - 1;
    }

    public static void main(String[] args)
    {
        QueueClass q = new QueueClass(5);
        q.enqueue(25);
        q.enqueue(5);
        q.enqueue(5);
        q.enqueue(5);
        q.enqueue(15);
        q.enqueue(10);
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.peek());
        // System.out.println(q);
    }
}
