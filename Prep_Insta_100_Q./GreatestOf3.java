import java.util.Scanner;

class Calc{

   private int a,b,c;
    private int grt;

    Calc(int a, int b, int c){
        this.a= a;
        this.b = b;
        this.c =c;
    }

    public int Calculate(){

        if(a > b){
            if(a > c){
                grt = a;
            }else{
                grt = c;
            }
        }else if(b > c){
            grt =b;
        }else{
            grt =c;
        }

        return grt;


        
    }

}





public class GreatestOf3{
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);

        int a,b,d;

        System.out.println("please enter the first value");
        a = sc.nextInt();
        System.out.println("please enter the second value");
        b = sc.nextInt();
        System.out.println("please enter the third value");
        d = sc.nextInt();


        Calc c = new Calc(a ,b ,d);

        System.out.println("The greatest number is :"+ c.Calculate());




    }
}