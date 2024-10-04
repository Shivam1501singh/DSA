import java.util.HashMap;
import java.util.Map;


//maximum frequency of the elment in the array

public class hash1 {
    public static void main(String[] args) {
        int [] arr={2,2,1,1,1};
        Map<Integer,Integer>freq=new HashMap<>();
        for(int el : arr){
            if(!freq.containsKey(el)){
                freq.put(el,1);
                }else{
                freq.put(el,freq.get(el)+1);
            }
        }
//      System.out.println("frequency map");
//      System.out.print(freq.entrySet());
        int max_freq=-1,anskey=-1;
        for(var e:freq.entrySet()){
            if(e.getValue()>max_freq){
                max_freq=e.getValue();
                anskey=e.getKey();
            }
        }
        if(max_freq>arr.length/2){
            System.out.println("the element with the max frequecy is"+anskey);
        }
        else{
            System.out.println(-1);
        }
//        System.out.printf("%d has max frequency and it occurs %d times",anskey,max_freq);
    }
}
