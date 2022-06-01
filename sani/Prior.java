package sani;

public class Prior extends Thread
{
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getPriority());
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        System.out.println("T1 : " + t1.getPriority());
        System.out.println("T2 : " + t2.getPriority());
        System.out.println("T3 : " + t3.getPriority());

        t1.setPriority(1);
        t2.setPriority(10);
        t3.setPriority(1);

        System.out.println("T1 : " + t1.getPriority());
        System.out.println("T2 : " + t2.getPriority());
        System.out.println("T3 : " + t3.getPriority());

        Thread.currentThread().setPriority(4);
    }

    public void run()
    {
        System.out.println("Inside Run !");
    }
}
