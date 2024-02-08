public class queue4 {
    public static class cqua{
        int f=-1;
        int r=-1;
        int size=0;
        int[]arr=new int[8];
        void add(int x) throws Exception{
            if(size== arr.length){
                throw new Exception("queue is full..");

            } else if (size==0) {
                f=r=0;
                arr[0]=x;
                size++;

            } else if (r<arr.length-1) {
                arr[++r]=x;
                size++;
                
            } else if (r== arr.length-1) {
                r=0;
                arr[0]=x;
                size++;

            }
        }
        int remove() throws Exception{
            if(size==0){
                throw new Exception("queue is empty..");
            }
            else {
                int val=arr[f];
                if(f== arr.length-1){
                    f=0;


                }else f++;
                size--;
                return val;
            }

        }
        int peek()throws Exception{
            if(size==0){
                throw new Exception("queue is empty..");
            }
            else return arr[f];
        }
        void display(){
            if(size==0){
                System.out.println("queue is empty..");
            }
            if(f<=r){
                for (int i=0;i<=r;i++){
                    System.out.println(arr[i]);
                }
            } else if (r<f) {
                for(int i=f;i<=arr.length-1;i++){
                    System.out.println(arr[i]);
                }
                for(int i=0;i<=r;i++){
                    System.out.println(arr[i]);
                }

            }
        }



    }

    public static void main(String[] args)  throws  Exception{
        cqua q=new cqua();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();

    }


}
