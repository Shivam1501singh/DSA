public class linkedlist5 {
    //cycle in linked list.........
    public static class node{
        int val;
        node next;
        node(int val){
            this.val=val;
        }
    }
    public static class cyllt{
        boolean circular(node head){
            if (head==null)return false;
            if(head.next==null)return false;
            node slow=head;
            node fast=head;
            while(fast!=null){
                if (slow==null)return false;
                slow=slow.next;
                if (fast==null)return false;
                fast=fast.next.next;
                if(slow==fast)return true;
            }
            return false;
        }

    }
    public static void main(String[] args) {
        node a=new node(3);
        node b=new node(2);
        node c=new node(0);
        node d=new node(-4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=b;
        cyllt p=new cyllt();
        System.out.println(p.circular(a));


    }
}
