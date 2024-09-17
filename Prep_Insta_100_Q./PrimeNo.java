import java.util.Scanner;




public class PrimeNo{
    public static void main( String args []){
        int count=0;
        int n ;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number to be checked : ");

        n = sc.nextInt();

        if(n<2){
            System.out.println("It is not prime number ");
            System.exit(0);
        }

        for(int i =1 ; i <= Math.sqrt(n); i++){

            if(n%i == 0){
                count += 1;
            }
        } 

        if(count > 2){
            System.out.println("Not a prime no");
        }else{
            System.out.println("It is prime no");
        }



     


        
        



    }
}