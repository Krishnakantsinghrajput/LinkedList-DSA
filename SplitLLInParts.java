public class SplitLLInParts {
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        int k=5;
        System.out.print("Before split : ");
        printList(head);
        System.out.println();
        Node ans[]=SplitLLInPartsFun(head, k);
         System.out.print("After split : ");
        for (int i = 0; i < ans.length; i++) {
        System.out.print("Part " + (i + 1) + ": ");
        printList(ans[i]);
        System.out.println();}
        
    }

    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static Node[] SplitLLInPartsFun(Node head,int k){
        int length=0;
        Node curr=head;
        while(curr!=null){
            length++;
            curr=curr.next;
        }

        int baseSize=length/k;
        int extra=length%k;

        curr=head;
        Node[] answer=new Node[k];
        for(int i=0;i<k;i++){
            if(curr==null){
                answer[i]=null;
                continue;

            }
            answer[i]=curr;
            int thisPartSize=baseSize+(i<extra ?1:0);
            for(int j=1;j<thisPartSize;j++){
                curr=curr.next;
            }

            Node nextPart=curr.next;
            curr.next=null;
            curr=nextPart;
        }
        return answer;
    }
}

class Node {
    int  data;
    Node next;
    Node (int x){
        this.data=x;
        this.next=null;
    }
}
