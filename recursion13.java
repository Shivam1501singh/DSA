public class recursion13 {
    static void reves(String s,int idx){
        if(idx>s.length()-1)return;
        reves(s,idx+1);
        System.out.print(s.charAt(idx));
    }
    public static void main(String[] args) {
        String s="shivam";
        reves("shivam",0);
    }
}
