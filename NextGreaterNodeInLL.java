
import java.util.*;
public class NextGreaterNodeInLL {
    public static void main(String[] args) {
        Node head=new Node(2);
        head.next=new Node(1);
        head.next.next=new Node(5);
        System.out.print("LinkedList : ");
        printList(head);
        System.out.println();
        int ans[]=NextGreaterNodeFun(head);
        for(int i:ans){
            System.out.print(i+" ");
        }
        
    }

    public static int[] NextGreaterNodeFun(Node head){
        List<Integer> values=new ArrayList<>();
        while(head!=null){
            values.add(head.data);
            head=head.next;
        }

        int n=values.size();
        int answer[]=new int [n];
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<n;i++){
            int currentVal=values.get(i);

            while(!stack.isEmpty()  &&  values.get(stack.peek())<currentVal){
                int idx=stack.pop();
                answer[idx]=currentVal;
            }
            stack.push(i);
        }
return answer;
    }

    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
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
