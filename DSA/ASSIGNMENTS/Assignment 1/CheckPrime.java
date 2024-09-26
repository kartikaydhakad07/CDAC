public class CheckPrime {

    
    public static boolean isPrime(int num, int divisor) {
        // Base cases
        if (num <= 1) return false; 
        if (divisor == 1) return true; 
        if (num % divisor == 0) return false; // if divisible, it's not prime
        
       
        return isPrime(num, divisor - 1);
    }

    public static void main(String[] args) {
        int number = 29; // Example number to check
        boolean result = isPrime(number, number / 2);
        
        if (result) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
