import java.util.Stack;

public class stack5 {

    public static void pushatbottom(Stack<Integer>st,int x){
        if (st.size()==0){
            st.push(x);
            return;
        }
        int top=st.pop();
        pushatbottom(st,x);
        st.push(top);

    }
    public static void revrst(Stack<Integer>st){
        if(st.size()==1) return;
        int top=st.pop();
        revrst(st);
        pushatbottom(st,top);
    }
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        System.out.println("stack in reverse order recursively");
        revrst(st);
        System.out.print(st);
    }
}
