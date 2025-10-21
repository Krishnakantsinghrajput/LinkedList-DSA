class PartitionList{
public static void main(String args[]){
Node head=new Node(1);
head.next=new Node(4);
head.next.next=new Node(3);
head.next.next.next=new Node(2);
head.next.next.next.next=new Node(5);
head.next.next.next.next.next=new Node(2);
int k=3;
head=PartitionListFun(head, k);
printList(head);

}

public static Node PartitionListFun(Node head,int k){
    Node Beforehead=new Node(0);
    Node afterhead=new Node(0);

    Node Before=Beforehead;
    Node After=afterhead;
    while(head!=null){
        if(head.data<k){
            Before.next=head;
            Before=Before.next;

        }
        else{
            After.next=head;
            After=After.next;
        }
        head=head.next;

    }
    After.next=null;
    Before.next=afterhead.next;
    return Beforehead.next;
}

public static void printList(Node head){
    Node curr=head;
    while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }
}
}

class Node {
    int data;
    Node next;
    Node (int x){
        this.data=x;
        this.next=null;
    }
}