import java.util.Scanner;

class BMITracker {
    float weight;
    float height;
    float bmi;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in kilograms: ");
        weight = sc.nextFloat();
        System.out.println("Enter height in meters: ");
        height = sc.nextFloat();
    }

    public void calculateBMI() {
        bmi = weight / (height * height);
    }

    public void classifyBMI() {
        if (bmi < 18.5) {
            System.out.println("Your BMI is: " + String.format("%.1f", bmi));
            System.out.println("You are classified as: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Your BMI is: " + String.format("%.1f", bmi));
            System.out.println("You are classified as: Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Your BMI is: " + String.format("%.1f", bmi));
            System.out.println("You are classified as: Overweight");
        } else {
            System.out.println("Your BMI is: " + String.format("%.1f", bmi));
            System.out.println("You are classified as: Obese");
        }
    }
}

public class BMICALC {
    public static void main(String[] args) {
        BMITracker tracker = new BMITracker();
        tracker.acceptRecord();
        tracker.calculateBMI();
        tracker.classifyBMI();
    }
}
