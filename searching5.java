public class searching5 {
    static int sqrtno(int x){
        int st=0,end=x;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int val=mid*mid;
            if(val==x){
                return mid;
            }
            else if(val<x){
                ans=mid;
                st=mid+1;
            }
            else {
                end=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x=11;
        System.out.println(sqrtno(x));
    }
}
