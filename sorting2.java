public class sorting2 {
    static  void selectionsort(int[]a){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for (int j=i+1;j<n;j++){
                if(a[j]<a[min_index]) min_index=j;
            }
            if(min_index!=i){
                int temp=a[min_index];
                a[min_index]=a[i];
                a[i]=temp;

            }
        }
    }

    public static void main(String[] args) {
        int[]a={6,3,2,1,8};
        selectionsort(a);
        for (int i:a){
            System.out.print(i+" ");
        }

    }
}
