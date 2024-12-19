import java.util.Scanner;

public class arr2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();

            }
            System.out.println();
        }





//        int [][] arr={{1,2,3},{2,3,4},{3,4,5}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i] [j]);
            }
            System.out.println();
        }

    }

}
