import java.util.Scanner;


class LeapYear{


    public static void main(String args[]){

        System.out.println("Please enter the year");
        
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        if( (y%4 ==0) && (y%100 != 0 || y%400 ==0) ){

            System.out.println("The given year "+y+" is leap year.");    


        }else{
            System.out.println("The given year "+y+" is not leap year.");  
        }


        sc.close();


    }
}