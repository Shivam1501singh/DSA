public class mergesort {

    static  void merge(int[] arr,int l, int mid,int r){

    }

    static  void mergesort(int [] arr ,int l,int r){
        if(l>=r) return;
        int mid=(l+r)/2;
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public static void main(String[] args) {
        int [] arr={5,3,5,3,2,1,8,4};


    }
}
