// deleting a node .


public class linkedlist2 {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class sol{

        void deletenode(Node c){
            c.val=c.next.val;
            c.next=c.next.next;
        }


    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(6);
        Node c=new Node(7);
        Node d=new Node(8);
        Node e=new Node(9);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        sol dl=new sol();
        dl.deletenode(c);
        System.out.println(b.next.val);



        
    }
}
