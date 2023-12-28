public class recursion17 {
    static void printsum(int[]arr,int idx,int sum){
        if(idx>=arr.length){
            System.out.println(sum);
            return;
        }
        printsum(arr,idx+1,sum+arr[idx]);
        printsum(arr,idx+1,sum);
    }
    public static void main(String[] args) {
        int[]arr={1,2,3};
        printsum(arr,0,0);

    }
}
