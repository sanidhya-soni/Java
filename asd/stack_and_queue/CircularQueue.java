package asd.stack_and_queue;

public class CircularQueue
{
    static int arr[];
    static int size;
    static int front = -1;
    static int rear = -1;

    CircularQueue(int n)
    {
        this.size = n;
        arr = new int[size];
    }

    void add(int x)
    {
        if(isFull())
        {
            System.out.println("Full");
            return;
        }
        if(front == -1)
        {
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = x;
    }

    int remove()
    {
        if(isEmpty())
            return -1;

        int n = arr[front];
            
        if(front == rear)
        {
            front = rear = -1;
        }
        else
        {
            front = (front + 1) % size;
        }
        return n;
    }

    int peek()
    {
        if(isEmpty())
            return -1;
        return arr[front];
    }

    boolean isEmpty()
    {
        return front == -1 && rear == -1;
    }

    boolean isFull()
    {
        return (rear + 1) % size == front;
    }

    public static void main(String[] args)
    {
        CircularQueue q = new CircularQueue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        q.add(0);
        System.err.println(q.peek());
        System.err.println(arr[0]);
    }
}
