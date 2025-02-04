
import java.util.Scanner;

public class evenOdd{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a number");

        int a;

        a = sc.nextInt();

        if(a%2==0){
            System.out.print("Given nu,ber is even");
        }else{
            System.out.println("Given No is odd");
        }
        sc.close();   
    }
}