public class TraverseLinkedList {

    public static void main(String[] args) {
        
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        traverseLL(head);
    }

    public static void traverseLL(Node temp){
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