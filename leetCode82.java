public class leetCode82 {
    public static void main(String args[]){
              Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(3);
        head.next.next.next.next=new Node(4);
        head.next.next.next.next.next=new Node(4);
         head.next.next.next.next.next.next=new Node(5);
         head=RemoveDuplicate(head);
         prinList(head);
    }

     public static Node RemoveDuplicate(Node head){
        
         

        Node dummy=new Node(0);
        dummy.next=head;
        Node prev=dummy;
      
        while(head!=null){
            if(head.next!=null && head.next.key==head.key){
                while(head.next!=null && head.key==head.next.key){
                    head=head.next;

                }
                prev.next=head.next;
            }
            else{
                prev=prev.next;
            }

            head=head.next;
        }
        return dummy.next;
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