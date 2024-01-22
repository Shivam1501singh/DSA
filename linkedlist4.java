public class linkedlist4 {
    public static class node{
        int val;
        node next;
        node(int val){
            this.val=val;
        }

    }
    public  static class llkd{
        void display(node head){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.val+"->");
                temp=temp.next;
            }
        }
        void delmid(node head){
            node slow=head;
            node fast=head;
            if(fast.next==null){
                System.out.print("it has only one element ");
                return;
            }
            while(fast.next.next.next!=null && fast.next.next!=null){
                // delete the right middle in case of even linked list//
                slow=slow.next;
                fast=fast.next.next;
            }
            slow.next=slow.next.next;
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
        llkd p=new llkd();
        p.display(a);
        System.out.println();
        p.delmid(a);
        System.out.println();
        p.display(a);


    }
}
