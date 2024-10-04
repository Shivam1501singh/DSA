import java.util.Scanner;

public class bitmanipulation1 {
    public static boolean checkodd(int n){
        return ((n&1)==1);
    }
    public static void main(String[] args) {
        //this code will check if a number is odd or even using bit manipulation.
        //if its odd it will return true
        System.out.println("enter a no:-");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(checkodd(n));
    }
}
