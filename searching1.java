public class searching1 {
    static boolean linearsearch(int[]arr,int target){
        for (int j : arr) {
            if (j == target) return true;

        }
        return false;

    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8};
        System.out.print(linearsearch(arr,4));

    }
}
