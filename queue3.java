public class queue3 {
    public static class node{
        int val;
        node next;
        node(int val){
            this.val=val;
        }
    }
    public static class queuel{
        node head;
        node tail;
        int size=0;
        void add(int val){
            if(head==null){
                node temp=new node(val);
                head=temp;
                tail=temp;
            }
            else{
                node temp=new node(val);
                tail.next=temp;
                tail=temp;

            }
            size++;
        }
        int peek(){
            if(size==0){
                System.out.println("queue is empty.");
                return -1;
            }
            return head.val;
        }
        int remove(){
            if(size==0){
                System.out.println("queue is empty ");
                return -1;
            }
            int x= head.val;
            head=head.next;
            size--;
            return x;
        }
        void display(){
            if(size==0){
                System.out.println("queue is empty");
            }
            node temp=head;
            while(temp!=null){
                System.out.print(temp.val);
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queuel q1=new queuel();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.display();
    }
}
