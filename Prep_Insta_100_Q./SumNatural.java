import java.util.Scanner;

class SumNatural{
    
    public static void main(String args[]){

    int n;
    int sum = 0;

    System.out.println("Please enter how many digits addition u want to print");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();


    for(int i = n ; i >=1 ; i--){
       sum = sum + i ;
    }

    
    System.out.println("The addition of first "+n+" natural numbers is: "+sum);

    sc.close();

    }

}