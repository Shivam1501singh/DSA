//max sub array sum bruttforce approach

public class ques2 {
    public static void main(String[] args) {
        int [] arr={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
        int max_sum=0;
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(max_sum<arr[i]+arr[j]){
                    max_sum=arr[i]+arr[j];
                }


            }
        }
        System.out.println("the max sub array sum is"+max_sum);

    }

}
