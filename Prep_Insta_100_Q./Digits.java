import java.util.Scanner;


public class Digits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a number");
        int a = sc.nextInt();
        sc.close();

        int count =0;
        
        if (a == 0) {
            count = 1;
        } else {
            while (a > 0) {
                a = a / 10;
                count++;
            }
        }

        System.out.println("the no of digits are: "+ count);

    }
}
