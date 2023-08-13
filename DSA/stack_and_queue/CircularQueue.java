package DSA.stack_and_queue;

public class CircularQueue
{
    int arr[];
    int size;
    int front;
    int rear;

    CircularQueue(int n)
    {
        this.size = n;
        this.arr = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    void enqueue(int x)
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

    int dequeue()
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
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.dequeue();
        q.enqueue(0);
        System.out.println(q.peek());
        System.out.println(q.arr[0]);
    }
}
