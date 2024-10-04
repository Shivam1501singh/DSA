import java.util.Scanner;

public class recursion5 {
    static int sumseries(int n){
        if(n==0)return 0;
        if(n%2==0)return sumseries(n-1)-n;
        else return sumseries(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to see series sum:-");
        int n=sc.nextInt();
        System.out.println(sumseries(n));

    }
}
