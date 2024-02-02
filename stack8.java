import java.util.Scanner;
import java.util.Stack;

public class stack8 {
    public static boolean isbalanced(String str){
        Stack<Character>st=new Stack<>();
        int l=str.length();
        if ((l%2)!=0) return false;
        for(int i=0;i<l;i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else {
                if(st.size()==0)return false;
                if(st.peek()=='(')st.pop();
            }
        }
        if(st.size()>0)return false;
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the backert series:-");
        String str=sc.nextLine();
        System.out.println(isbalanced(str));


    }
}
