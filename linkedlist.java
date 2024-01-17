
public class linkedlist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }
    public static class lnkdlst{
        Node head=null;
        Node tail=null;
        void insertatend(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }
            else {
                tail.next=temp;
            }
            tail=temp;
        }
        void insertatbeg(int val){
            Node temp=new Node(val);
            if(head==null){
                head=tail=temp;
            }
            else {
                temp.next=head;
                head=temp;
            }
        }
        void insetatidx(int idx,int val){
            Node t=new Node(val);
            Node temp=head;
            if(idx==0){
                insertatbeg(val);
                return;
            } else if (idx==size()) {
                insertatend(val);
                return;
                
            } else if (idx<0 || idx>size()) {
                System.out.print("invalid index");
                
            }
            for (int i=1;i<idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }

        void display(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }

        }
        int size(){
            Node temp=head;
            int count=0;
            while (temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        void deleteatidx(int idx){
            Node temp=head;
            if(idx==0){
                head.next=head;
                return;
            }
            for (int i=1;i<=idx-1;i++){
                temp=temp.next;

            }
            if(idx==size()-1){
                tail=temp;

            }
            temp.next=temp.next.next;
        }
    }


    public static void main(String[] args) {
        lnkdlst ll=new lnkdlst();
        ll.insertatend(4);
        ll.insertatend(5);
        ll.insertatend(6);
        ll.insertatbeg(1);
//        ll.display();
        System.out.println();
        System.out.print(ll.size());

        System.out.println();
        ll.insetatidx(3,0);
        ll.display();
        ll.deleteatidx(1);
        System.out.println();
        ll.display();


    }
}
