 

class SwapPairsLL{
    public static void main(String[] args){
node head=new node(1);
head.next=new node(2);
head.next.next=new node(3);
head.next.next.next=new node(4);
prinList(head);
head=swappairs(head);
System.out.println();
prinList(head);
    }

    public static node swappairs(node head){
        node dummy=new node(0);
        dummy.next=head;
        node prev=dummy;
        while(head!=null && head.next!=null){
            node first=head;
            node second=head.next;

            prev.next=second;
            first.next=second.next;
            second.next=first;

            prev =first;
            head=first.next;
        }
        return dummy.next;
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
    node(int key){
        this.data=key;
        this.next=null;
    }
}