import java.util.Stack;

public class stack2 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer>tp=new Stack<>();
        while(st.size()!=0){
            tp.push(st.pop());
        }
        System.out.println(tp);
    }
}
