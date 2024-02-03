package LinkedList.Ciricular;


import org.w3c.dom.Node;

import java.util.List;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class CircularLinkedList {
  private ListNode head;

  public CircularLinkedList(){
      this.head=null;
  }
  public void insert(int val){
      ListNode newNode= new ListNode(val);
      if(head==null){
          head=newNode;
          head.next=head;
      }else {
          ListNode temp=head;
          while (temp.next!=head){
              temp=temp.next;

          }
          temp.next=newNode;
          newNode.next=head;
      }
  }
  public void insertAtPosition(int val , int position){
      ListNode newNode = new ListNode(val);

      if(position==0){
          newNode.next=head;
          ListNode temp=head;
          while (temp.next!=head){
              temp=temp.next;
          }
          temp.next=newNode;
      }else {
          ListNode temp= head;
          for(int i=0;i<position-1;i++){
              temp=temp.next;
          }
          newNode.next=temp.next;
          temp.next=newNode;
      }
  }
  public void deleted(int val){

      if(head==null){
          return;
      }
      if(head.val==val) {
          ListNode temp = head;
          while (temp.next != head) {
              temp = temp.next;
          }
          if (head == head.next) {
              head = null;
          } else {
              temp.next = head.next;
              head = head.next;
          }
      }
      else{

          ListNode prev= null;
          ListNode current= head;
      do{

          prev=current;
          current=current.next;

      }while (current!=head && current.val!=val);
          if(current==head){
              return;
          }
          prev.next=current.next;
          }


  }


}
