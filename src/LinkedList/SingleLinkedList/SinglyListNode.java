package LinkedList.SingleLinkedList;

class ListNode{
 int val;

 ListNode next;

 ListNode(int val){
     this.val=val;
 }
}
public class SinglyListNode {
  ListNode head;
  public void insertAtEnd(int val){
      ListNode newNode= new ListNode(val);
      if(head==null){
          head=newNode;
          return ;
      }
      ListNode current= head;
      while (current.next!=null){
          current=current.next;
      }
      current.next=newNode;
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
