import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int r=sc.nextInt();
        System.out.println("enter the no of colums");
        int c=sc.nextInt();
        int [][]matrix=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("the matrix enterd by the user is:-");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();

        }
    }
}
