import java.util.Scanner;

class Vote{
    public static void main(String args[]){

        System.out.println("Please enter your name then your age");

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();

        System.out.println("------------------------------------------------");
        if(age<18){
            System.out.println("You are not elegible for voting Mr/Ms "+ name);
        }else{
            System.out.println("You are elegible for voting Mr/Ms "+ name);
        }
        System.out.println("------------------------------------------------");
        sc.close();
    }
}