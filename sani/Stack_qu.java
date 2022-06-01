package sani;

import java.util.Scanner;

public class Stack_qu
{
    int a[];
    int capacity, top;

    Stack_qu(int size)
    {
        a = new int[size];
        top = -1;
        capacity = size;
    }

    void push(int x)
    {
        if(isFull())
        {
            System.out.println("Stack Overflow !\n");
            return;
        }
        a[++top] = x;
        System.out.println(x + " inserted Succesfully !\n");
    }

    void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty !\n");
            return;
        }
        top--;
        System.out.println("Number Popped Succesfully !\n");
    }

    void peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty !\n");
            return;
        }
        System.out.println("Top Element : " + a[top] + "\n");
    }

    int size()
    {
        return top + 1;
    }

    boolean isFull()
    {
        return top == capacity - 1;
    }

    boolean isEmpty()
    {
        return top == -1;
    }

    public static void main(String[] args)
    {
        int choice;
        int run = 1;
        Stack_qu st = new Stack_qu(5);
        Scanner sc = new Scanner(System.in);
        while(run == 1)
        {
            System.out.println("1. Push\n2. Pop\n3. Peek\n4. Size\n");
            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();
            System.out.println();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter Number to be Pushed : ");
                    st.push(sc.nextInt());
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.peek();
                    break;
                case 4:
                    System.out.println("Size of Stack is : " + st.size() + "\n");
                    break;
                default:
                    System.out.println("Enter Right Choice !");
                    continue;
            }
            System.out.print("Enter 1 to perfor more operations or Enter 0 to Exit : ");
            run = sc.nextInt();
        }
        sc.close();
        System.out.println("Code Ended :))");
    }
}
