public class Calc{

    public static void main(String[] args) {
        
        double num1 = 10.5;  
        double num2 = 5.0;   
        char operator = '/'; 
		double result = 0;
   

        
        switch (operator) {
            case '+':
                result = num1 + num2;
				System.out.println("The result is: " + result);
                break;
            case '-':
                result = num1 - num2;
				System.out.println("The result is: " + result);
                break;
            case '*':
                result = num1 * num2;
				System.out.println("The result is: " + result);
                break;
            case '/':
                
                if (num2 != 0) {
                    result = num1 / num2;
					System.out.println("The result is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                 
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                validOperation = false;
                break;
        }

        
       
    }
}
