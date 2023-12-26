public class recursion10 {
    static boolean checkelemnt(int [] array,int idx,int target){
        if(idx>=array.length)return false;
        if(array[idx]==target)return true;
        return checkelemnt(array,idx+1,target);
    }

    public static void main(String[] args) {
        int []array={1,2,3,4,5,6,7};
        System.out.println(checkelemnt(array,0,6));

    }
}
