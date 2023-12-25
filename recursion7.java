public class recursion7 {
    static void printarray(int[]array,int idx){
        if(idx== array.length)return ;
        System.out.println(array[idx]);
        printarray(array,idx+1);
    }
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,8,9,0};
        printarray(array,0);

    }
}
