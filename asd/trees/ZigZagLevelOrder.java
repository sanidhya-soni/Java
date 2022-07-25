package asd.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class ZigZagLevelOrder
{
    Node root = null;
    Scanner sc = new Scanner(System.in);

    Node createBTree(Node root)
    {
        // System.out.print("Enter data: ");
        int data = sc.nextInt();

        if(data == -1)
            return null;
        
        root = new Node(data);

        // System.out.print("Enter data in left of " + root.data + ": ");
        root.left = createBTree(root.left);
        // System.out.print("Enter data in right of " + root.data + ": ");
        root.right = createBTree(root.right);
        return root;
    }

    void levelOrderTraversal(Node root)
    {
        Queue<Node> q = new ArrayDeque<>();

        if(root == null)
            return;

        boolean leftToRight = true;
        Node nextLine = new Node(-1000);

        q.add(root);
        q.add(nextLine);
        leftToRight = true;

        ArrayList<Integer> arr = new ArrayList<>();

        while(!q.isEmpty())
        {
            Node p = q.poll();
            if(p == nextLine)
            {
                if(leftToRight)
                    for(int i = 0; i < arr.size(); i++)
                        System.out.print(arr.get(i) + " ");
                else
                    for(int i = arr.size() - 1; i >= 0; i--)
                        System.out.print(arr.get(i) + " ");
                arr = new ArrayList<>();
                leftToRight = !leftToRight;
                System.out.println();
                if(!q.isEmpty())
                    q.add(nextLine);
            }
            else
            {
                // System.out.print(p.data + " ");
                arr.add(p.data);
                if(p.left != null)
                    q.add(p.left);
                if(p.right != null)
                    q.add(p.right);
                // leftToRight = !leftToRight;
            }
        }
    }

    public static void main(String[] args)
    {
        ZigZagLevelOrder ob = new ZigZagLevelOrder();
        ob.root = ob.createBTree(ob.root);
        ob.levelOrderTraversal(ob.root);
    }
}


// 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 -1 -1