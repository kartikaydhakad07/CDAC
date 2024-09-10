import java.util.Scanner;

class DiscountCalculator {
    float originalPrice;
    float discountRate;
    float discountAmount;
    float finalPrice;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the original price of the item : ");
        originalPrice = sc.nextFloat();   
        System.out.println("Enter the discount percentage : ");
        discountRate = sc.nextFloat();
    }

    public void calculateDiscount() {
        discountAmount = originalPrice * (discountRate / 100);
        finalPrice = originalPrice - discountAmount;
    }

    public void printRecord() {
        System.out.println("Discount Amount: " + String.format("%.2f", discountAmount));
        System.out.println("Final Price after discount: " + String.format("%.2f", finalPrice));
    }
}
public class DiscountCalc {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        
        calculator.acceptRecord();
        calculator.calculateDiscount();
        calculator.printRecord();
    }
}
