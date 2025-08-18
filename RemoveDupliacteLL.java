public class RemoveDupliacteLL {
    public static void main(String[] args) {
         Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(3);
        head.next.next.next.next=new Node(4);
        head.next.next.next.next.next=new Node(4);
RemoveDuplicate(head);
prinList(head);

    }

    public static void RemoveDuplicate(Node head){
        Node curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.key==curr.next.key){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
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