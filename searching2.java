public class searching2 {

    static boolean binarysearch(int[]arr,int target){
        int n=arr.length;
        int st=0,end=n-1;
        while(st<end){
            int mid=(st+end)/2;
            if(target==arr[mid]){
                return true;
            }
            else if(target<mid){
                end=mid-1;
            }else {
                st=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6,7};
        int target=2;
        System.out.println(binarysearch(a,target));
        
    }
}
