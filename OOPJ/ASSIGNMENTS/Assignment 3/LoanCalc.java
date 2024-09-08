import java.util.Scanner;

class Logic{
    private int loanAmt;
    double intRate;
    int years;
    double monthlypt;
    int TotAmt;

    public void AcceptDetail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the loan amount ( principal amount ) ");
        this.loanAmt = sc.nextInt();
        System.out.println("Please enter the annual interest rate in % ");
        this.intRate = sc.nextDouble();
        System.out.println("Please enter the duration in years ");
        this.years = sc.nextInt();
    }

    public void MonthlyPayment(){
        double monthlyInterestRate = this.intRate / 12 / 100 ;
        int NoOfMonths = this.years / 12;

        monthlypt = loanAmt * (monthlyInterestRate * (1 + Math.pow(monthlyInterestRate , NoOfMonths)) / (1 + Math.pow(monthlyInterestRate, NoOfMonths) - 1  ));
        TotAmt = (int)monthlypt * years * 12;

    }

    public void PrintRecord(){
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("Your monthly amount to be paid will be : "+ monthlypt);
        System.out.println("Total amount to be paid will be : "+ TotAmt);

       

    }


}




class LoanCalc{

    public static void main ( String Args []){

        Logic l = new Logic();

        l.AcceptDetail();
        l.MonthlyPayment();
        l.PrintRecord();

        
    }
}