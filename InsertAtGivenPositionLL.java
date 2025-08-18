public class InsertAtGivenPositionLL {
    public static void main(String args[])
    {
        int pos=5;
        int data=20;
         Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(5);
        head.next.next.next=new Node(3);
        head=insertAtPos(head, pos, data);
        prinList(head);


    }

    public static Node insertAtPos(Node head,int pos,int data){
        Node temp=new Node(data);
       if(head==null){
        if(pos==1){
            return temp;
        }
        else{
            return head;
        }
       }
       if(pos==1){
        temp.next=head;
        return temp;
       }

       Node curr=head;
       for(int i=1;i<pos-1;i++){
        curr=curr.next;
        if(curr==null){
            System.out.println("position out of range");
            return head;
        }
       }

       temp.next=curr.next;
       curr.next=temp;
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