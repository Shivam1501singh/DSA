import java.util.Scanner;

public class recursion4 {
    static void mutiples(int n,int p){
        if(p==0) return;
        mutiples(n,p-1);
        System.out.println(n*p);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no whose multiple u want to see:-");
        int n=sc.nextInt();
        System.out.println("enter the no for the multiples:-");
        int p=sc.nextInt();
        mutiples(n,p);

    }
}
