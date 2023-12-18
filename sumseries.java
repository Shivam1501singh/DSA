import java.util.Scanner;

public class sumseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // this will print the sum of  series like 1-2+3-4+5......num.
        System.out.println("enter the no till where to find the sum:-");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(i%2==0){
                sum=sum-i;
            }
            else{
                sum=sum+i;
            }
        }
        System.out.println("the sum of the series is:-"+sum);

    }
}
