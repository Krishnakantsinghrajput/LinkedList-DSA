public class RecursiveSearchLL {
    public static void main(String args[]){
          int x=3;
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(5);
        head.next.next.next=new Node(3);
        int index=SearchElement(head, x);
        System.out.println(index);
        
    }

    public static int SearchElement(Node head,int x){
        if(head==null){
            return -1;
        }
        if(head.key==x){
            return 1;
        }
         else{
            int res=SearchElement(head.next, x);
            if(res==-1){
                return -1;
            }
            else{
                return (res+1);
            }
         }
    }
}
