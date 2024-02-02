import java.util.Stack;

public class stack9 {
    public  static int[] remdupli(int[]arr){
        Stack<Integer>st=new Stack<>();
        int l= arr.length;
        for(int i=0;i<l;i++){
            if(st.size()==0 || st.peek()!=arr[i]){
                st.push(arr[i]);
            }
            else if(arr[i]==st.peek()){
                if(i==l-1 || arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
        }
        int[]res=new int[st.size()];
        int m=res.length;
        for(int i=m-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        int[]arr={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int[]ans=remdupli(arr);
        for (int an : ans) {
            System.out.println(an);
        }


    }
}
