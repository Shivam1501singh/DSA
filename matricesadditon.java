import java.util.Scanner;

public class matricesadditon {
    static void summat(int[][]mat1,int r1,int c1,int[][]mat2,int r2,int c2){
        if(r1!=r2 && c1!=c2){
            System.out.println("dimensions are not same cant be possible to add");
            return;
        }
        int[][] finalmat=new int[r1][c2];
        for(int i=0;i<finalmat.length;i++){
            for(int j=0;j<finalmat[i].length;j++){
                finalmat[i][j]=mat1[i][j]+mat2[i][j];
            }
        }

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows for matrix 1");
        int r=sc.nextInt();
        System.out.println("enter the no of colums for matrix 2");
        int c=sc.nextInt();


    }
}
