public class sorting5 {
    static int partion(int []arr,int st,int end){
        int pivot=arr[st];
        int cnt=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<=pivot)cnt++;
        }
        int pivotidx=st+cnt;
        swap(arr,st,pivotidx);

        int i=st,j=end;

        while(i<pivotidx && j> pivotidx){
            while (arr[i]<=pivot)i++;
            while (arr[j]>pivot)j--;

            if(i<pivotidx && j>pivotidx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }

        return pivotidx;
    }
    static void quicksort(int []arr,int st, int end){
        if(st>=end)return;
        int pi=partion(arr,st,end);
        quicksort(arr,st,pi-1);
        quicksort(arr,pi+1,end);

    }
    static void swap(int[]arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args) {
        int[]arr={7,6,5,4,3,2,1};
        quicksort(arr,0,arr.length-1);
        for (int i:arr){
            System.out.print(i+" ");
        }


    }
}
