//print all the sub arrays of the list

public class quest1 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for (int j=i;j<n;j++){

                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();

        }
    }
}
