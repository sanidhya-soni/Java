package gererics_in_java;

public class Abc
{
    public static void main(String[] args)
    {
        Node<Double> head = new Node<Double>(10.0), temp = head;
        Node<Double> newNode = new Node<Double>(20.0);
        temp.next = newNode;
        temp = newNode;
        newNode = new Node<Double>(30.0);
        temp.next = newNode;
        temp = newNode;
        newNode = new Node<Double>(40.0);
        temp.next = newNode;
        temp = newNode;
        newNode = new Node<Double>(50.0);
        temp.next = newNode;
        temp = newNode;
        newNode = new Node<Double>(60.0);
        temp.next = newNode;
        temp = newNode;

        Node<Double> p = head;

        while(p != null)
        {
            System.out.println(p.data);
            p = p.next;
        }
    }
}
