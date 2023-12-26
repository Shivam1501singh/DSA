public class recursion12 {
    static String removeA(String s,int idx){
        if(idx==s.length()) return " ";
        String smallans=removeA(s,idx+1);
        char curr=s.charAt(idx);
        if(curr!='a') return curr+smallans;
        return smallans;
    }
    public static void main(String[] args) {
        String s="shivam shivam";
        System.out.println(removeA(s,0));


    }
}
