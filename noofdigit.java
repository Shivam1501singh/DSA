import java.util.Scanner;

public class noofdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :-");
        int num=sc.nextInt();
        int a=0;
        while(num > 0) {
            num=num/10;
            a=a+1;
        }
        System.out.println("the number of digits in the given number are:-"+a);
    }
}
