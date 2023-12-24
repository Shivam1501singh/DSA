import java.util.Scanner;

public class sumofdigitrec {
    static int recdigit(int n){
        if(n>=0 && n<=9)return n;
        return recdigit(n/10)+recdigit(n%10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no to the no of digits:-");
        int n=sc.nextInt();
        System.out.println(recdigit(n));
    }
}
