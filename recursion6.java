import java.util.Scanner;

public class recursion6 {

//    which recursion it wil be
//    while(a%b!=0){
//        rem=a%b;
//        a=b;
//        b=rem;
//    }
//    return b;

    static int gcd(int a, int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter two number for gcd:-");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(gcd(a,b));

    }
}
