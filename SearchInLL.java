public class SearchInLL {
    public static void main(String[] args) {
        int x=3;
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(5);
        head.next.next.next=new Node(3);
        int index=SearchInLLForElement(head, x);
        System.out.println(index);
        
    }

    public static int SearchInLLForElement(Node head,int x){
        Node curr=head;
        int pos=1;
        while(curr!=null){
            if(curr.key==x){
                return pos;
            }
            else{
                curr=curr.next;
                pos++;
            }
        }
        return -1;
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