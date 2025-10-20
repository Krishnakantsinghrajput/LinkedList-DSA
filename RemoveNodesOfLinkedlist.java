public class RemoveNodesOfLinkedlist {
    public static void main(String args[]){
        Node head=new Node(5);
         head.next=new Node(2);
          head.next.next=new Node(13);
        head.next.next.next=new Node(3);
         head.next.next.next.next=new Node(8);
         print(head);
       System.out.println();
      head= RemoveNodesOfLinkedlistFun(head);
       print(head);

         
        
    }

    static void print(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data +" ");
            curr=curr.next;
        }
    }

    static Node ReverseList(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;

    }

    static Node RemoveNodesOfLinkedlistFun(Node head){
        head=ReverseList(head);
        Node dummy=new Node(0);
        dummy.next=head;
        Node prev=dummy;
        int maxVal=head.data;

        while(head!=null){
            if(head.data<maxVal){
                prev.next=head.next;
            }
            else{
                maxVal=head.data;
                prev=head;

            }
            head=head.next;
        }

return ReverseList(dummy.next);
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