package gererics_in_java;

public class Node<X>
{
    X data;
    Node<X> next;

    Node(X data)
    {
        this.data = data;
        this.next = null;
    }
}
