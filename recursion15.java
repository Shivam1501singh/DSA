import java.util.ArrayList;

public class recursion15 {
    static ArrayList<String> getstring(String s){
        ArrayList<String> ans=new ArrayList<>();
        if(s.length()==0){
            ans.add(" ");
            return ans;
        }
        char curr=s.charAt(0);
        ArrayList<String>smallans=getstring(s.substring(1));
        for(String ss:smallans){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String>shivam=getstring("Shivam");
        System.out.println(shivam);

    }
}
