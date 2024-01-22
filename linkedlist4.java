public class linkedlist4 {
    public static class node{
        int val;
        node next;
        node(int val){
            this.val=val;
        }
    }
    public static void main(String[] args) {
        node a=new node(1);
        node b=new node(2);
        node c=new node(3);
        node d=new node(4);
        node e=new node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;


    }
}
