package dsa.trees;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class ViewsOfABinaryTree {
    Scanner sc = new Scanner(System.in);

    TreeNode createBTree(TreeNode root) {
        // System.out.print("Enter Data: ");
        int data = sc.nextInt();

        if (data == -1)
            return null;

        root = new TreeNode(data);

        // System.out.println("Enter data to be inserted in left of " + data);
        root.left = createBTree(root.left);
        // System.out.println("Enter data to be inserted in right of " + data);
        root.right = createBTree(root.right);

        return root;
    }

    void levelOrderTraversal(TreeNode root) {
        TreeNode newNode = new TreeNode(Integer.MIN_VALUE);
        Queue<TreeNode> q = new ArrayDeque<TreeNode>();
        if (root != null) {
            q.add(root);
            q.add(newNode);
        }

        while (!q.isEmpty()) {
            TreeNode temp = q.poll();

            if (temp.data == Integer.MIN_VALUE) {
                System.out.println();
                if (!q.isEmpty())
                    q.add(newNode);
            } else {
                System.out.print(temp.data + " ");

                if (temp.left != null)
                    q.add(temp.left);

                if (temp.right != null)
                    q.add(temp.right);
            }
        }
    }

    void topViewOfBinaryTree(TreeNode root) {
        Queue<Pair<TreeNode, Integer>> q = new ArrayDeque<>();
        int hd = 0;
        Pair<TreeNode, Integer> temp;
        Map<Integer, Integer> topView = new HashMap<>();
        ((ArrayDeque<Pair<TreeNode, Integer>>) q).add(new Pair<>(root, hd));

        while (!q.isEmpty()) {
            temp = q.poll();
            TreeNode frontNode = temp.first;
            hd = temp.second;

            /* if(!topView.containsKey(hd)) {
                topView.put(hd, frontNode.data);
            } */
            topView.put(hd, frontNode.data);
            System.out.println(hd + " " + frontNode.data);
            if(frontNode.left != null)
                ((ArrayDeque<Pair<TreeNode, Integer>>) q).push(new Pair<>(frontNode.left, hd - 1));
            if(frontNode.right != null)
                ((ArrayDeque<Pair<TreeNode, Integer>>) q).push(new Pair<>(frontNode.right, hd + 1));
        }

        for (Map.Entry<Integer, Integer> m: topView.entrySet()) {
            System.out.println(m.getKey() + " -> " + m.getValue());
        }
    }

    public static void main(String[] args) {
        ViewsOfABinaryTree tree = new ViewsOfABinaryTree();

        TreeNode root = null;

        root = tree.createBTree(root);
        tree.levelOrderTraversal(root);
        tree.topViewOfBinaryTree(root);
    }
}

// 1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1
// 1 2 4 -1 -1 5 -1 -1 3 -1 -1
// 10 20 30 -1 -1 40 60 -1 -1 -1 80 50 -1 70 -1 -1 90 -1 -1