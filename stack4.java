import java.util.Stack;

public class stack4 {
    public static void main(String[] args) {
        //displaying the element of stacks.
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        Stack<Integer>tp=new Stack<>();
        System.out.print("Stack in reverse order:-");
        while (st.size()!=0){
            int x=st.pop();
            System.out.print(x+" ");
            tp.push(x);
        }
    }
}
