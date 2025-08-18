public class DeleteAtGivenpositionLL {
    public static void main(String args[]){
         int pos=5;
        // int data=20;
         Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(5);
        head.next.next.next=new Node(3);
        head=deleteAtPos(head, pos);
        prinList(head);
    }

     public static Node deleteAtPos(Node head,int pos){
        if(head==null){
            return head;
        }
        if(pos==1){
            return head.next;
        }

       Node curr=head;
       for(int i=1;i<pos-1;i++){
        curr=curr.next;
        if(curr==null || curr.next==null){
            System.out.println("position out of range");
            return head;
        }
       }

        curr.next=curr.next.next;
        return head;
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
