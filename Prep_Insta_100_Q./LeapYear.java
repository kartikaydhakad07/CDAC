
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a year: ");
        int a = sc.nextInt();
        sc.close();

        if(a%4 == 0 && a%100 != 0 || (a%400 ==0) ){
            System.out.println("its a leap year");
        }else{
            System.out.println("not a leap year");
        }
    }
}
