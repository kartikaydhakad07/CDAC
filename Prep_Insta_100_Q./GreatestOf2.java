import java.util.Scanner;

class GreatestOf2{
    public static void main(String args[]){


        int a,b;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("----------------------------------------");
        System.out.println("FIND THE LARGEST NO.");
        System.out.println("----------------------------------------");
        System.out.println("");

        System.out.println("Please enter the first number");
        a = sc.nextInt();

        System.out.println("Please enter the second number");
        b = sc.nextInt();

        System.out.println("----------------------------------------");

        if (a >b){
            System.out.println(a + " Is greater than "+ b);
        }else{
            System.out.println(b + " Is greater than "+ a);
        }

        System.out.println("----------------------------------------");



    }
}