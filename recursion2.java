import java.util.Scanner;

public class recursion2 {
    static int fact(int n){
        if(n==1){

            return 1;
        }
        return fact(n-1)*n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no to calculate factorial:-");
        int n=sc.nextInt();
        System.out.println(fact(n));

    }
}
