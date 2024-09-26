import java.util.Scanner;

class fibo{
    public static void main(String Args []){

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter till wjich term u want to print fibonacci series ");
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++){

            System.err.print(fib(i) + " ");
        }
    }


    static int fib(int n ){
        if(n <= 1){
            return n;
        }else{
             return fib(n-1 ) + fib(n-2);
        }
    }
}