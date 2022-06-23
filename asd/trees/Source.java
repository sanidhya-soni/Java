package asd.trees;

import java.util.Scanner;

public class Source
{

    Node createBTree(Node root)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Data: ");
        int data = sc.nextInt();

        if(data == -1)
            return null;

        root = new Node(data);

        System.out.println("Enter data to be inserted in left of " + data);
        root.left = createBTree(root.left);
        System.out.println("Enter data to be inserted in right of " + data);
        root.right = createBTree(root.right);

        return root;
    }

    public static void main(String[] args)
    {
        Source ob = new Source();

        Node root = null;
        ob.createBTree(root);
    }
}
