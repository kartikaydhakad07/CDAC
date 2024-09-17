import java.util.Scanner;
class CalcLeap{

    int year;

    public void ReadRecord(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the year : ");
        this.year= sc.nextInt();

    }

    public void Calculate(){

        if((year % 4 ==0) &&(year%100 != 0 || year % 400==0)){

            System.out.println("thie given year "+year+" is Leap year");

        }else{
            System.out.println("thie given year "+year+" is NOT Leap year");
        }
    }


}




class LeapYear{
    public static void main ( String Args[] ){

        CalcLeap c = new CalcLeap();

        c.ReadRecord();
        c.Calculate();




    }
}