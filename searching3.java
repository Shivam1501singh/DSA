public class searching3 {
    static boolean recbinarysearch(int []arr,int target,int st,int end){
        if(st>end)return false;
        int mid=(st+end)/2;
        if(target==arr[mid]) return true;

        else if(target<arr[mid]){
             return recbinarysearch(arr,target,st,mid-1);
        }else
            return recbinarysearch(arr,target,mid+1,end);
    }

    public static void main(String[] args) {
        int[]a={1,2,3,4,5,6,7,8,9};
        int target=13;
        System.out.println(recbinarysearch(a,target,0,a.length-1));

    }
}
