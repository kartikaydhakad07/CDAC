import java.util.Scanner;

public class PrintDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a number : ");
        int num = sc.nextInt();
        sc.close();

        int temp = num;
        int reverse = 0;

        while(temp>0){
            reverse = reverse * 10 + temp%10;
            temp /= 10;
        }

        while(reverse>0){
            System.out.println("digits : "+ (reverse%10));
            reverse /= 10;
        }
    }
    
}
