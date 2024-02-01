public class stack7 {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class linkstack{
        Node head=null;
        int size=0;
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int pop(){
            if(head==null){
                System.out.println("linked list is empty");
                return -1;
            }
            int x= head.val;
            head=head.next;
            size--;
            return x;

        }
        int size(){
            return size;
        }
        int peek(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            return head.val;
        }
        void recdisplay(Node H){
            if(H==null)return;

            recdisplay(H.next);
            System.out.print(H.val);
        }
        void dispaly(){
            recdisplay(head);
        }
    }
    public static void main(String[] args) {
        linkstack st=new linkstack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st.size());
        st.dispaly();

    }
}
