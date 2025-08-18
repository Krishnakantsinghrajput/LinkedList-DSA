public class InsertAtBeginningLL {
    public static void main(String args[]){
  int x=10;
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(5);
        head.next.next.next=new Node(3);
        head=insertbegin(head,x);
        prinList(head);
        
        
    }

    public static Node insertbegin(Node head,int x){
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        return temp;
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