public class recursion16 {
    static void printssq(String s, String curr){
        if(s.length()==0){
            System.out.println(curr);
            return;
        }
        char a=s.charAt(0);
        String rem=s.substring(1);
        printssq(rem,curr+a);
        printssq(rem,curr);

    }
    public static void main(String[] args) {
        printssq("shi"," ");

    }
}
