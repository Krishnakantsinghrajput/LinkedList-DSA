class removeDuplicateUnsortedList{
    public static void main(String[] args) {
         Node head=new Node(10);
        head.next=new Node(2);
        head.next.next=new Node(10);
        head.next.next.next=new Node(1);
        head.next.next.next.next=new Node(4);
        head.next.next.next.next.next=new Node(1);
        System.out.print("before remove original list :");
        prinList(head);
        System.out.println();
        System.out.print("after remove duplicate list :");
        RemoveDuplicate(head);
        prinList(head);


    }

      public static void RemoveDuplicate(Node head){
        Node curr=head;
        while(curr!=null){
            Node runner=curr;
            while(runner.next!=null){
                if(runner.next.key==curr.key){
                    runner.next=runner.next.next;
                }
                else{
                    runner=runner.next;
                }
            }
            curr=curr.next;
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