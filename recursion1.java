import java.util.Scanner;

public class recursion1 {
    static void one2n(int n){
        if(n==1){
            System.out.println(n);
            return;
        }


        one2n(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number  for series 1 to n:-");
        int n=sc.nextInt();
        one2n(n);

    }
}
