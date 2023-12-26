public class recursion14 {
    static  boolean palindrom(String s,int r,int l){

        if(r>=l)return true;
        return (s.charAt(r)==s.charAt(l)&& palindrom(s,r+1,l-1));
    }

    public static void main(String[] args) {
        System.out.println();
        String s="nitin";
        System.out.println(palindrom(s,0,s.length()-1));

    }
}
