import java.util.*;

class EvenOdd{

    public static void main(String args[]){

        int n;
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("PLease enter a number");

        n = sc.nextInt();
        
        if(n%2 == 0){
            System.out.println("The given number "+ n + " is Even");
        }else{
            System.out.println("The given number " + n +  " is odd");
        }


    }
}