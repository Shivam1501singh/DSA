public class recursion8 {
    static int maxval(int[]array,int idx){
        if(idx==array.length-1)return array[idx];
        int val=maxval(array,idx+1);
        return Math.max(array[idx],val);
    }
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6};
        System.out.println(maxval(array,0));
        
    }
}
