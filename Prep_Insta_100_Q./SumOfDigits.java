import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a number : ");
        int num = sc.nextInt();
        sc.close();

        int sum =0;

        while(num > 0){
            sum = sum + num%10 ; 
            num /= 10;
        }

        System.out.println("The sum of the digits is : "+ sum);


    }
    
}
