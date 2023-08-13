package DSA.stack_and_queue;

public class DoublyEndedQueue
{

    int queue[];
    int front, rear, size;

    DoublyEndedQueue(int size)
    {
        front = -1;
        rear = -1;
        this.size = size;
        queue = new int[size];
    }

    boolean isEmpty()
    {
        if(front == -1 && rear == -1)
            return true;
        
        return false;
    }

    boolean isFull()
    {
        if(rear == front - 1 || (front == 0 && rear == size - 1))
            return true;
        
        return false;
    }

    void enqueueInFront(int n)
    {
        if(isFull())
        {
            System.out.println("Queue is Full !");
            return;
        }
        if(isEmpty())
        {
            front = rear = 0;
            queue[0] = n;
            return;
        }
        if(front == 0)
            front = size - 1;
        else
            front--;

        queue[front] = n;
    }

    int dequeueFromFront()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return -1;
        }

        int ans = queue[front];
        queue[front] = 0;
        if(front == rear)
            front = rear = -1;

        else if(front == size - 1)
            front = 0;

        else
            front++;

        return ans;
    }

    void enqueueInRear(int n)
    {
        if(isFull())
        {
            System.out.println("Queue is Full !");
            return;
        }
        if(isEmpty())
        {
            front = rear = 0;
            queue[0] = n;
            return;
        }
        if(rear == size - 1)
            rear = 0;
        else
            rear++;
        
        queue[rear] = n;
    }

    int dequeueFromRear()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return - 1;
        }

        int ans = queue[rear];
        queue[rear] = 0;

        if(front == rear)
        {
            front = rear = -1;
        }
        else if(rear == 0)
            rear = size - 1;
        else
            rear--;

        return ans;
    }

    void display()
    {
        for (int i : queue) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        DoublyEndedQueue ob = new DoublyEndedQueue(5);
        ob.display();
        ob.enqueueInRear(5);
        ob.display();
        ob.enqueueInFront(2);
        ob.display();
        ob.enqueueInFront(3);
        ob.display();
        ob.enqueueInRear(6);
        ob.display();
        ob.enqueueInRear(7);
        ob.display();
        ob.enqueueInFront(10);
        ob.display();
        System.out.println(ob.dequeueFromRear());
        ob.display();
        ob.enqueueInFront(20);
        ob.display();
        ob.dequeueFromFront();
        ob.display();
        ob.enqueueInFront(8);
        ob.display();
        ob.enqueueInFront(100);
        ob.enqueueInRear(10);
        ob.display();
        // System.out.println(ob.front);System.out.println(ob.rear);
        ob.dequeueFromFront();
        ob.dequeueFromFront();
        ob.dequeueFromFront();
        ob.display();
        ob.enqueueInRear(10);
        ob.display();
        ob.dequeueFromFront();
        ob.display();
        ob.dequeueFromFront();
        ob.dequeueFromRear();
        ob.display();
        System.out.println(ob.front + " " + ob.rear);
        ob.dequeueFromFront();
    }
}
