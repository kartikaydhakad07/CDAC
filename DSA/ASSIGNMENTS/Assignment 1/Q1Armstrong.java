import java.util.Scanner;

class Q1Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int n = sc.nextInt();

        int digits = CountDigit(n);
        int res = checkArmstrongNo(n, digits);

        System.out.println(CountDigit(n));

        if (res == n) {
            System.out.println("It is an Armstrong number.");
        } else {
            System.out.println("It is not an Armstrong number.");
        }
    }

    static int CountDigit(int n) {

        if (n == 0) {
            return 0; // Treating 0 as a single digit
        } else {
            return 1 + CountDigit(n / 10);
        }
    }

    static int checkArmstrongNo(int n, int digits) {
        if (n == 0) {
            return 0; 
        } else {
            int ext = n % 10;
            return (int) Math.pow(ext, digits) + checkArmstrongNo(n / 10, digits);
        }
    }
}
