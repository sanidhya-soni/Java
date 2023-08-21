package dsa.trees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTree
{

    Scanner sc = new Scanner(System.in);

    TreeNode root = null;

    TreeNode insertInBST(TreeNode root ,int data)
    {
        if(root == null)
        {
            root = new TreeNode(data);
            return root;
        }

        if(data < root.data)
            root.left = insertInBST(root.left, data);
        else
            root.right = insertInBST(root.right, data);
        
            return root;
    }

    TreeNode createBST()
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

    boolean search(TreeNode root, int n)
    {
        if(root.data == n)
        {
            return true;
        }

        else if(n < root.data && root.left != null)
        {
            return search(root.left, n);
        }

        else if(n > root.data && root.right != null)
        {
            return search(root.right, n);
        }
        return false;
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

    public static void main(String[] args)
    {
        BinarySearchTree ob = new BinarySearchTree();
        ob.root = ob.createBST();
        ob.levelOrderTraversal(ob.root);
        System.out.println(ob.search(ob.root, 10));
    }
}
