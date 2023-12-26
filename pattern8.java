import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        System.out.println("enter the no of rows:-");
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++) {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(k);
            }
//            for (int l=i+1;l<=r;l++){
//                System.out.println(l);
//            }
            System.out.println();
        }
    }
}
