package Linked List.Easy;

public class linkedListCycle {
    // Using the slow and fast pointer approach 

    public boolean cycle(ListNode Node)
    {
        Node slow=head;
        Node Fast= head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=next.next;

            if(slow==fast)
            {
                return true;
            }

        }
        return false;
    }

}
