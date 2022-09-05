package mypkg;

import java.util.*;

public class Infi
{
    public static void main(String[] args)
    {
        Queue<String> q = new PriorityQueue<>();
        q.add("Anu");
        q.add("bought");
        q.add("Apple");
        q.add("PineApple");
        q.add("Apple");
        q.remove("Apple");
        q.add("Orange");
        q.add("Mango");
        q.poll();
        System.out.println(q);
    }
}
