public class searching4 {
    static int firstoccurence(int[]arr,int x){
        int n=arr.length;
        int fo=-1;
        int st=0,end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==x){
                fo=mid;
                end=mid-1;
            } else if (arr[mid]>x) {
                end=mid-1;

            }else {
                st=mid+1;
            }

        }
        return fo;
    }
    public static void main(String[] args) {
        int [] arr={0,1,2,3,4,5,6,6,7};
        int x=7;
        System.out.println(firstoccurence(arr,x));

    }
}
