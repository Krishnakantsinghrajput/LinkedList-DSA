public class SwappingNodeInLL {
    public static void main(String args[]){
        //  head = [1,2,3,4,5], k = 2
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        int k=2;
        System.out.print("Before Swap :");
        printList(head);
        System.out.println();
          System.out.print("After Swap : ");
          head=SwappingNodeInLLFun(head, k);
          printList(head);


    }

   public static void  printList (Node head){
    Node curr=head;
    while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }
   }

   public static Node SwappingNodeInLLFun(Node head,int k){
    int length=0;
    Node curr=head;
    while (curr!=null) {
        length++;
        curr=curr.next;

        
    }
Node first=head;
    for(int i=1;i<k;i++){
        first=first.next;
    }

    Node Second=head;
    for(int i=1;i<length-k+1;i++){
        Second=Second.next;
    }

    int temp=first.data;
    first.data=Second.data;
Second.data=temp;
return head;

   }
}

class Node{
    int data;
    Node next;
    Node (int x){
        this.data=x;
        this.next=null;

    }
}
