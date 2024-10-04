import java.util.Scanner;

public class recursion3 {
//    
//
//    }
    static int ptopowerq(int p,int q){
        if(q==0)return 1;
        if(q%2==0){
            return ptopowerq(p,q/2)*ptopowerq(p,q/2);
        }
        else return ptopowerq(p,q/2)*ptopowerq(p,q/2)*p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base:-");
        int p=sc.nextInt();
        System.out.println("enter the powr:-");
        int q=sc.nextInt();
        System.out.println(ptopowerq(p,q));
    }
}
