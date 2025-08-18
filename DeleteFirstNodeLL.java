public class DeleteFirstNodeLL {
    public static void main(String args[]){
  Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(5);
        head.next.next.next=new Node(3);
        head=deleteNode(head);
        printlist(head);
    }

    public static Node deleteNode(Node head){
        if(head==null){
            return head ;
        }
        if(head.next==null){
            return null;
        }
        return head.next;
       
    }


    public static void printlist(Node head){
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