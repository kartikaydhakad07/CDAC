import java.util.Scanner;

public class FactorialRecursion {

        static int Factorial(int n){
            if(n ==0 || n==1){
                return 1;
            }
            return n * Factorial(n -1);
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a no.: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("The factorial is: "+ Factorial(n));



    }    
}
