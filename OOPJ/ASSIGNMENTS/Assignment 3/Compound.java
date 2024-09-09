import java.util.Scanner;

class CmdCalc {
    int principal;
    int noOft;
    float intRate;
    int years;
    float futureValue;

    public void AcceptRec() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the principal amount:");
        principal = sc.nextInt();

        System.out.println("Please enter the number of times compound interest is applied per year:");
        noOft = sc.nextInt();

        System.out.println("Please enter the interest rate (as a decimal, e.g., 0.05 for 5%):");
        intRate = sc.nextFloat();

        System.out.println("Please enter the number of years:");
        years = sc.nextInt();
    }

    public void Calculate() {
        // Perform calculation in double precision for accuracy
        double compoundFactor = Math.pow((1 + intRate / noOft), noOft * years);
        double result = principal * compoundFactor;
        this.futureValue = (float) result;

        // Calculate total interest earned
        int totInterest = (int) futureValue - principal;

        // Print results
        System.out.printf("Future value of the investment: %.2f\n", futureValue);
        System.out.println("Total interest earned will be: " + totInterest);
    }
}

public class Compound {
    public static void main(String[] args) {
        CmdCalc c = new CmdCalc();

        c.AcceptRec();
        c.Calculate();
    }
}
