public class Even_Odd_linkedlist {
    public static void main(String[] args) {
       Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        System.out.print("Before :");
        print(head);
        System.out.println();
        System.out.print("After :");
        Even_Odd_linkedlistFun(head);
        print(head);
        
        

    }
    public static Node Even_Odd_linkedlistFun(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node odd=head;
        Node even=head.next;
        Node evenNode=even;
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }

        odd.next=evenNode;
        return odd;
    }

    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.key+" ");
            temp=temp.next;
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
