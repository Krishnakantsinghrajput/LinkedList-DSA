public class AddTwoNumber {
    public static void main(String[] args) {
        Node l1=new Node(2);
        l1.next=new Node(4);
        l1.next.next=new Node(3);
        Node l2=new Node(5);
        l2.next=new Node(6);
        l2.next.next=new Node(4);

        Node result=add_two_number(l1, l2);
        prinList(result);
        
    }
      public static void prinList(Node result){
        Node curr=result;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    private static Node add_two_number(Node l1,Node l2){
        Node dummy=new Node(0);
        Node curr=dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int sum=carry;
            if(l1!=null){
                sum+=l1.data;
                l1=l1.next;
                

            }
              if(l2!=null){
                sum+=l2.data;
                l2=l2.next;
                

            }
carry=sum/10;
            curr.next=new Node(sum%10);
            
            curr=curr.next;
        }
        return dummy.next;
    }
}

class Node{
    int data;
    Node next;
    Node(int x){
        this.data=x;
        this.next=null;
    }
}