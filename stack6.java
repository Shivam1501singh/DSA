public class stack6 {
    public  static class stack{
        int[]arr=new int[10];
         private int idx;
         void push(int x){
             arr[idx]=x;
             idx++;
         }
         int peek() {
             if (idx == 0) {
                 System.out.println("stack is empty");
                 return -1;
             }
             return arr[idx - 1];
         }
         int pop(){
             if(idx==0){
                 System.out.println("Underflow........");
                 return -1;
             }
             int top=arr[idx-1];
             idx--;
             arr[idx]=0;
             return top;
         }
         void display(){
             for(int i=0;i<=idx-1;i++){
                 System.out.print(arr[i]);
             }
             System.out.println();
         }
         int size(){
             return idx;
         }
    }
    public static void main(String[] args) {
        stack st=new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();




    }
}
