import java.util.Scanner;

public class sumofrec1 {
    static int findsum(int[][]matrix,int l1,int l2, int c1,int c2){
        int sum=0;

        for(int i = l1;i<=l2;i++){
            for(int j=c1;j<=c2;j++){
                sum+=matrix[i][j];
            }
            
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows and columns in matrix:-");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]matrix=new int [r][c];
        System.out.println("enter "+r*c+" values for the matrix:-");
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the bounderies l1,c1,l2,c2");
        int l1=sc.nextInt();
        int c1=sc.nextInt();
        int l2=sc.nextInt();
        int c2=sc.nextInt();
        System.out.println("the sum the matrix is:-"+findsum(matrix,l1,l2,c1,c2));


    }
}
