import java.util.ArrayList;

public class recursion11 {
    static ArrayList<Integer> allIndices(int[]arr,int idx,int target){
        if(idx>=arr.length)return new ArrayList<Integer>();
        ArrayList<Integer> ans=new ArrayList<>();
        if(arr[idx]==target){
            ans.add(idx);
        }
        ArrayList<Integer> smallans=allIndices(arr,idx+1,target);
        ans.addAll(smallans);
        return ans;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,1,3,4,5,1,4,1,7};
        ArrayList<Integer>ans=allIndices(arr,0,1);
        System.out.println(ans);


    }
}
