import java.util.Scanner;

class RangeSum{

    public static void main (String args[]){

        int a, b;
        int sum=0;
        
            
        Scanner sc = new Scanner(System.in);


        System.out.println("please enter the starting no. of the range from w2hich u want to print the sum");
        a = sc.nextInt();

        System.out.println("Please enter the no. till you want to print the sum");
        b = sc.nextInt();

        for (int i = a ; i <= b; i++){
           
            sum = sum + i;
            
        }
        
        System.out.println("The sum of range "+a+" to "+b+" is: "+ sum);

    }

    
}