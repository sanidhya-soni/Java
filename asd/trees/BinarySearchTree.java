package asd.trees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTree
{

    Scanner sc = new Scanner(System.in);

    Node root = null;

    Node insertInBST(Node root ,int data)
    {
        if(root == null)
        {
            root = new Node(data);
            return root;
        }

        if(data < root.data)
            root.left = insertInBST(root.left, data);
        else
            root.right = insertInBST(root.right, data);
        
            return root;
    }

    Node createBST()
    {
        System.out.print("Enter data to be inserted: ");
        int data = sc.nextInt();

        while(data != -1)
        {
            root = insertInBST(root, data);
            System.out.print("Enter data to be inserted: ");
            data = sc.nextInt();
        }
        return root;
    }

    void levelOrderTraversal(Node root)
    {
        Node newNode = new Node(-50000);
        Queue<Node> q = new ArrayDeque<Node>();
        if(root != null)
        {
            q.add(root);
            q.add(newNode);
        }

        while(!q.isEmpty())
        {
            Node temp = q.poll();

            if(temp.data == -50000)
            {
                System.out.println();
                if(!q.isEmpty())
                    q.add(newNode);
            }
            else
            {
                System.out.print(temp.data + " ");

                if(temp.left != null)
                    q.add(temp.left);
                
                if(temp.right != null)
                    q.add(temp.right);
            }
        }
    }

    public static void main(String[] args)
    {
        BinarySearchTree ob = new BinarySearchTree();
        ob.root = ob.createBST();
        ob.levelOrderTraversal(ob.root);
    }
}
