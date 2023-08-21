package dsa.trees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Source
{
    Scanner sc = new Scanner(System.in);

    TreeNode createBTree(TreeNode root)
    {
        // System.out.print("Enter Data: ");
        int data = sc.nextInt();

        if(data == -1)
            return null;

        root = new TreeNode(data);

        // System.out.println("Enter data to be inserted in left of " + data);
        root.left = createBTree(root.left);
        // System.out.println("Enter data to be inserted in right of " + data);
        root.right = createBTree(root.right);

        return root;
    }

    TreeNode createFromLevelOrder()
    {
        Queue<TreeNode> q = new ArrayDeque<TreeNode>();
        System.out.print("Enter data for root: ");
        TreeNode root = new TreeNode(sc.nextInt());
        int x;
        q.add(root);

        while(!q.isEmpty())
        {
            TreeNode temp = q.poll();

            System.out.print("Enter left side of " + temp.data + ": ");
            x = sc.nextInt();
            if(x != -1)
            {
                temp.left = new TreeNode(x);
                q.add(temp.left);
            }

            System.out.print("Enter right side of " + temp.data + ": ");
            x = sc.nextInt();
            if(x != -1)
            {
                temp.right = new TreeNode(x);
                q.add(temp.right);
            }
        }
        return root;
    }

    void levelOrderTraversal(TreeNode root)
    {
        TreeNode newNode = new TreeNode(-50000);
        Queue<TreeNode> q = new ArrayDeque<TreeNode>();
        if(root != null)
        {
            q.add(root);
            q.add(newNode);
        }

        while(!q.isEmpty())
        {
            TreeNode temp = q.poll();

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

    void inOrder(TreeNode node)
    {
        if(node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    void preOrder(TreeNode node)
    {
        if(node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void preOrderIterative(TreeNode node)
    {
        Stack<TreeNode> s = new Stack<>();
        s.push(node);

        while(!s.isEmpty())
        {
            TreeNode temp = s.pop();
            System.out.print(temp.data + " ");

            if(temp.right != null)
                s.push(temp.right);
            if(temp.left != null)
                s.push(temp.left);
        }
        System.out.println("Done");
    }

    void postOrderIterative(TreeNode node)
    {
        Stack<TreeNode> s = new Stack<>();
        Stack<Integer> res = new Stack<>();
        s.push(node);

        while(!s.isEmpty())
        {
            TreeNode temp = s.pop();
            res.push(temp.data);
            
            if(temp.left != null)
                s.push(temp.left);
            if(temp.right != null)
                s.push(temp.right);
        }

        while(!res.isEmpty())
            System.out.print(res.pop() + " ");
        System.out.println("Done");
    }

    void postOrder(TreeNode node)
    {
        if(node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args)
    {
        Source ob = new Source();

        TreeNode root = null;
        root = ob.createBTree(root);
        // root = ob.createFromLevelOrder();
        // ob.inOrder(root);
        // System.out.println();
        ob.preOrder(root);
        System.out.println();
        ob.preOrderIterative(root);
        System.out.println();
        ob.postOrder(root);
        System.out.println();
        ob.postOrderIterative(root);
        // System.out.println();
        // ob.levelOrderTraversal(root);
    }
}


// 1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1
// 1 2 4 -1 -1 5 -1 -1 3 -1 -1
