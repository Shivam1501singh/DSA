public class sorting6 {
    static int maxint(int []arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static void basiccount(int []arr){
        int mx=maxint(arr);
        int[]count=new int[mx+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k++]=i;
            }
        }



    }
    public static void main(String[] args) {
        int[]arr={4,3,1,5,3,1,3,5};
        basiccount(arr);
        for(int i :arr){
            System.out.print(i);
        }
        
    }
}
