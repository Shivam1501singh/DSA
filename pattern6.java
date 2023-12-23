import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        System.out.println("enter the rows and column:");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else System.out.print("2");
            }
            System.out.println();
        }


    }
}
