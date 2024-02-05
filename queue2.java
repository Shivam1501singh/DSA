import java.util.LinkedList;
import java.util.Queue;

public class queue2 {
    public static class queu{
        int f=-1;
        int r=-1;
        int size=0;
        int[]arr=new int[100];
        void add(int val){
            if(r== arr.length-1){
                System.out.println("queue is full...");
                return;
            }
            if(f==-1) {
                //is empty
                arr[0]= val;

            }
            else{
                arr[++r]=val;
            }
            size++;
        }
        int remove(){
            if(size==0){
                System.out.println("queue is empty...");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }
        int peek(){
            if(size==0){
                System.out.println("queue is empty...");
                return -1;
            }
            return arr[f];
        }
        void display(){
            if(size==0){
                System.out.println("queue is empty...");
            }
            for(int i=0;i<=r;i++){
                System.out.print(arr[i]);
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        queu Q=new queu();
        Q.display();


    }

}
