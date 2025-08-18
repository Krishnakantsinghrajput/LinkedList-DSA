public class RecursiveTraverseLL {
    public static void main(String[] args) {
          Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(5);
     RecursiveTraverseLLElement(head);
    }

    public static void RecursiveTraverseLLElement(Node temp){
       if(temp==null){
        return ;
       }
       System.out.print(temp.key+" ");
    RecursiveTraverseLLElement(temp.next);
     
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

