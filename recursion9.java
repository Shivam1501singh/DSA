public class recursion9 {
    static int sumarray(int[]array,int idx){
        if(idx==array.length)return 0;
        if(idx==array.length-1)return array[idx];
        return array[idx]+sumarray(array,idx+1);
    }
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7};
        System.out.println(sumarray(array,0));

    }
}
