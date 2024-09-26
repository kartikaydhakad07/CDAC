import java.util.Scanner;

class Q3factorial{

    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a number ");
        int n = sc.nextInt();

        System.out.println(fact(n));

        // 5 x 4 x 3 x 2 x 1


    }

    static int fact(int n ){

        if(n == 0){
            return 1;
        }else{
            return n*fact(n-1);
        }

    }
}