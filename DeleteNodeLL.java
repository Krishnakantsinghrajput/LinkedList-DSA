public class DeleteNodeLL {
    public static void main(String args[]){
        node head=new node(4);
       node Node=  head.next=new node(5);
        head.next.next=new node(1);
        head.next.next.next=new node(9);
        prinList(head);
        DeleteNode(Node);
        System.out.println();
        prinList(head);

    }

    public static void DeleteNode(node Node){
Node.data=Node.next.data;
Node.next=Node.next.next;
    }

    public static void prinList(node head){
        node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}

class node{
    int data;
    node next;
    node(int x){
        this.data=x;
        this.next=null;
    }
}
