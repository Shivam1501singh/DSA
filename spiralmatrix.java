
import java.util.Scanner;
public class spiralmatrix {
    static void printspiralorder(int[][] matrix, int r, int c) {
        int toprow = 0, bottomrow = r - 1, leftcol = 0, rightcol = c - 1;
        int total = 0;
        while (total < r * c) {
            // toprow->leftcol to rightcol
            for (int j = leftcol; j <= rightcol && total < r * c; j++) {
                System.out.print(matrix[toprow][j] + " ");
                total++;
            }
            toprow++;
            // rightcol->toprow to bottomrow
            for (int i = toprow; i <= bottomrow && total < r * c; i++) {
                System.out.print(matrix[i][rightcol] + " ");
                total++;
            }
            rightcol--;
            // bottomrow->rightcol to leftcol
            for (int j = rightcol; j >= leftcol && total < r * c; j--) {
                System.out.print(matrix[bottomrow][j] + " ");
                total++;
            }
            bottomrow--;
            // leftcol->bottomrow to toprow
            for (int i = bottomrow; i >= toprow && total < r * c; i--) {
                System.out.print(matrix[i][leftcol] + " ");
                total++;
            }
            leftcol++;
        }
    }

    static void printmatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows and column of matrix");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] matrix=new int[r][c];
        int total=r*c;
        System.out.println("enter"+total+"values");
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("inputed matrix");
        printmatrix(matrix);

        System.out.println("spiral order");
        printspiralorder(matrix,r,c);
    }
}
