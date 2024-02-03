package LinkedList.Ciricular;

public class InsertintoaSortedCircularLinkedList {
    public ListNode insert(ListNode head, int value){

        ListNode newNode=new ListNode(value);

        if(head==null){
            newNode.next=newNode;
            return newNode;
        }
        ListNode prev= head;
        ListNode curr= head.next;
        boolean isInsert=false;
        do{
            if(prev.val<=value&&value<=curr.val){
                isInsert=true;
            }else if(prev.val>curr.val){
                if(value>= prev.val|| value<=curr.val){
                    isInsert=true;
                }
            }
            if(isInsert){
                prev.next=newNode;
                newNode.next=curr;
                return head;
            }
            prev=curr;
            curr=curr.next;
        }while (prev!=head);
        prev.next=newNode;
        newNode.next=curr;
        return head;
    }
}
