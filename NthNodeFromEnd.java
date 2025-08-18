public class NthNodeFromEnd {
    public static void main(String args[]){
         int n=2;
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
       
        printNthNode(head, n);
       
    }

    public static void printNthNode(Node head,int n){
        int len=0;
        for(Node curr=head;curr!=null;curr=curr.next){
            len++;
           
        }
         if(len<n)
System.out.println("invalid value");

        Node curr=head;
        for(int i=0;i<len-n;i++){
            curr=curr.next;
          
        }
          System.out.println(curr.key);
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
