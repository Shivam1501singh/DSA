import java.util.Scanner;

public class conditionalope {
    // ternary operator always return some result
    public static void main(String[] args) {
//        ternary operator
        System.out.println("enter the no");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
//        String ans;
//        ans=(num%2==0)?"even":"odd";
//        System.out.println(ans);

        // logical or operator
        if(num%3==0 || num%5==0){
            System.out.println("divisible by either  three and five");
        }
        else{
            System.out.println("not divisible by any of them");
        }

    }
}
