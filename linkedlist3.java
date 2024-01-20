//finding nth node from end.

public class linkedlist3 {
    public static  node nthnode(node head,int n){
        node temp=head;
        int size=0;
        while (temp!=null){
            size++;
            temp=temp.next;
        }
        int r=size-n+1;
        //mth node from start
        temp=head;
        for(int i=1;i<=r-1;i++){
            temp=temp.next;
        }
        return temp;
    }
    public static node nthnode2(node head,int n){
        node slow=head;
        node fast=head;
        for (int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static  class node{
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
        node f=new node(6);
        node g=new node(7);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        node temp=nthnode(a,3);
        System.out.println(temp.val);
        node temp2=nthnode2(a,3);
        System.out.println(temp2.val);
    }
}
