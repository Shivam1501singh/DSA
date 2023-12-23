import java.util.Scanner;

public class fabonacci {
    static int fabo(int n){

        if(n==0 || n==1){
            return n;

        }
        return fabo(n-1)+fabo(n-2);
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to know fabonacci number:-");
        int n=sc.nextInt();
        System.out.println(fabo(n));


    }
}
