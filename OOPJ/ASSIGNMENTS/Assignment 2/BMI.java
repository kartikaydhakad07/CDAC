


import java.util.Scanner;

class BMI {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your full name:");
        String name = sc.nextLine();

        System.out.println("Please enter your weight in kg:");
        float weight = sc.nextFloat();

        System.out.println("Please enter your height in meters:");
        float height = sc.nextFloat();

        float bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);
        
        if (bmi < 18.5) {
            System.out.println("You are underweight, Mr./Ms. " + name);
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a healthy weight, Mr./Ms. " + name);
        }else {
            System.out.println("You are overweight, Mr./Ms. " + name);
        }

        sc.close();
    }
}
