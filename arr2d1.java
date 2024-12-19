import java.util.Scanner;

public class arr2d1 {

    static void printmat(int[][]matrix){
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }



    public void add(int [][] a,int r1,int c1,int [][]b,int r2,int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("wrong input.................");
            return;
        }
        int [][] sum=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        printmat(sum);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no of rows of 1st matrix");
        int r1=sc.nextInt();
        System.out.println();


    }
}
