import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:-");
        int r=sc.nextInt();
        System.out.println("enter the number of colums:-");
        int c=sc.nextInt();
        for(int i=0;i<=r;i++){
            for(int j=0;j<=c;j++){
                if(i==0||j==0||i==r||j==c) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
