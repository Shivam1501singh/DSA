public class sorting7 {
    static int findmax(int[]arr){
        int n=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>n){
                n=arr[i];
            }
        }
        return n;
    }
    static  void countsort(int[]arr){
        int n=findmax(arr);
        int[]count=new int[n];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }

    }

    public static void main(String[] args) {
        int []arr={6,5,4,6,7,2,7,9};
    }
}
