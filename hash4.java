import java.util.HashMap;

public class hash4 {
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};
        HashMap<Integer,Integer>mp=new HashMap<>();
        int prefixsum=0;
        int maxlength=0;
        mp.put(0,-1);
        for(int i=0;i<arr.length;i++){
            prefixsum+=arr[i];
            if(mp.containsKey(prefixsum)){
                maxlength=Math.max(maxlength, i-mp.get(prefixsum));
            }else{
                mp.put(prefixsum,i);
            }
        }
        System.out.println(maxlength);
    }

    
}
