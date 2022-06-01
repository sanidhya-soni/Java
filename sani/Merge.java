package sani;

class Merge
{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        // System.out.println("Inside Merge");
        ListNode l3 = null, temp = null, newNode;
        while(l1 != null)
        {
            // System.out.println("Inside outer While");
            while(l2 != null)
            {
                // System.out.println("Inside Inner While");
                if(l1.val <= l2.val)
                {
                    newNode = new ListNode(l1.val, null);
                    l1 = l1.next;
                    if(l3 == null)
                    {
                        l3 = newNode;
                    }
                    else
                    {
                        temp.next = newNode;
                    }
                    temp = newNode;
                    break;
                }
                else
                {
                    newNode = new ListNode(l2.val, null);
                    l2 = l2.next;
                    if(l3 == null)
                    {
                        l3 = newNode;
                    }
                    else
                    {
                        temp.next = newNode;
                    }
                    temp = newNode;
                    break;
                }
            }
            if(l2 == null)
            {
                break;
            }
        }
        if(l3 == null)
        {
            if(l1 != null)
            {
                l3 = l1;
            }
            else if(l2 != null)
            {
                l3 = l2;
            }
        }
        else
        {
            if(l1 != null)
            {
                temp.next = l1;
            }
            else if(l2 != null)
            {
                temp.next = l2;
            }
        }
        return l3;
    }
}