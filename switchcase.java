import java.util.Scanner;

public class switchcase {
    // switch case
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the day of the week");
        int day= sc.nextInt();
        switch(day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("bhai app dusre planet se ho earth pe ek week me 7 days hi hote hai");
        }
    }
}
