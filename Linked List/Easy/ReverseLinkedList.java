import javax.swing.event.ListDataEvent;

public class ReverseLinkedList {

    public class listNode{
        int val;
        listNode next;

        public listNode(val)
        {
            this.val=val;
            this.next=null;
        }

            listNode curr= head;
            listNode prev= null;
            listNode next;

            while(curr!=null)
            {
                next=curr.next;
                curr.next=prev;
                curr=next;
                prev=curr;
            }

            head=prev;

            return head;
    }
    
}