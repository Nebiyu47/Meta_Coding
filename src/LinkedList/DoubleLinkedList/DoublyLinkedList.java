package LinkedList.DoubleLinkedList;

class ListNode{
    int val;
    ListNode prev;
    ListNode next;

    ListNode(int val){
        this.val=val;
    }
 }

public class DoublyLinkedList {

    ListNode head;
    ListNode tail;

    public void inserAtEnd(int val){
        ListNode newnode= new ListNode(val);
        if(head==null){
            head = tail=newnode;
            return;
        }
        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
    }
 public void display(){
        ListNode current= head;
        while (current!=null){
            System.out.println(current.val);
            current=current.next;
        }
     System.out.println();
 }
}




