package sani;

public class MergeMain
{
    public static void main(String[] args)
    {
        int i;
        int ar1[] = {};
        int ar2[] = {1};
        ListNode l1 = null, l2 = null, l3 = null, temp = null, newNode;

        for(i = 0; i < ar1.length; i++)
        {
            newNode = new ListNode(ar1[i], null);
            if(l1 == null)
            {
                l1 = newNode;
            }
            else
            {
                temp.next = newNode;
            }
            temp = newNode;
        }

        temp = null;

        for(i = 0; i < ar2.length; i++)
        {
            newNode = new ListNode(ar2[i], null);
            if(l2 == null)
            {
                l2 = newNode;
            }
            else
            {
                temp.next = newNode;
            }
            temp = newNode;
        }

        // System.out.println("Made Linked Lists Succesfully");

       /*  ListNode w1 = l1;
        ListNode w2 = l2;

        while(w1 != null)
        {
            System.out.println(w1.val + " ");
            w1 = w1.next;
        }
        while(w2 != null)
        {
            System.out.println(w2.val + " ");
            w2 = w2.next;
        } */
        
        Merge m = new Merge();

        l3 = m.mergeTwoLists(l1, l2);

        while(l3 != null)
        {
            System.out.print(l3.val + " ");
            l3 = l3.next;
        }
    }
}
