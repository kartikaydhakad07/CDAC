import java.util.Scanner;

class CheckNo{
   
    public static void main(String args[]){

        System.out.println("Please enter the number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 0){
            System.out.println("The number is zero");
        }else if(n > 0){
            System.out.println("The number is positive");
        }else{
            System.out.println("The number is negative");
        }

        
    }
}
