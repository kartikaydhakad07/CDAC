import java.util.Scanner;

class Seasons{
    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);

        System.out.println("Please enthe the month No.");
        int n = sc.nextInt();

        switch(n){

         case 1: case 2 : case 12 :
         System.out.println("Its a Winter Season"); 
         break;

         case 3: case 4 : case 5 :
         System.out.println("Its a Spring Season"); 
         break;

         case 6: case 7 : case 8 :
         System.out.println("Its a Summer Season"); 
         break;

         case 9: case 10 : case 11 :
         System.out.println("Its a Autumn Season"); 
         break;

        }
    }
}