import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        System.out.println("enter the no of rows:-");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
