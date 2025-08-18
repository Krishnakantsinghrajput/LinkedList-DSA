public class MiddleOfLL {
    public static void main(String[] args) {
        
      Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        //    head.next.next.next.next=new Node(5);
         Node middle=findMiddle(head) ;
         System.out.println(middle.key);
         
        
    }

    public static Node findMiddle(Node head){
      if(head==null){
        return head;
      }
      Node slow=head,fast=head;
      while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
      }
      return slow;
    }
     public static void prinList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.key+" ");
            curr=curr.next;
        }
    }
}

class Node{
    int key;
    Node next;
    Node(int x){
        this.key=x;
        this.next=null;
    }
}

