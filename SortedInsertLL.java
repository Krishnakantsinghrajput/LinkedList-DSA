public class SortedInsertLL {
    public static void main(String[] args) {
         Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        int x=2;
        head=sortedInsert(head, x);
        printlist(head);

    }

    public static Node sortedInsert(Node head,int x){
        Node temp=new Node(x);
       if(x<head.key || head==null){
        temp.next=head;
        return temp;

       }
       Node curr=head;
       while(curr.next!=null && curr.next.key<x ){
        curr=curr.next;
       }
       temp.next=curr.next;
       curr.next=temp;
       return head;
        
        }

        public static void printlist(Node temp){
        Node curr=temp;
        while (curr!=null) {
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
