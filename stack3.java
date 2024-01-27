import java.util.Scanner;
import java.util.Stack;

public class stack3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(6);
        Stack<Integer>tp=new Stack<>();
        System.out.println("enter the indx to enter thr elemt");
        int idx=sc.nextInt();
        System.out.println("enter the elemnt to insert");
        int e=sc.nextInt();
        while(st.size()>idx){
            tp.push(st.pop());
        }
        st.push(e);
        while(tp.size()!=0){
            st.push(tp.pop());
        }
        System.out.println(st);

    }
}
