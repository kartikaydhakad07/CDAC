/*7. Find Repeated Characters in a String
Problem: Write a Java program to find all repeated characters in a string.

Test Cases:

Input: "programming"
Output: ['r', 'g', 'm']
Input: "hello"
Output: ['l']
 

 import java.util.Scanner;

 class Q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("please enter an string : ");
        String str = sc.nextLine();

        //sc.nextLine();

        System.out.println("You entered : "+ str);

        int size = str.length();

        System.out.print("Letters which are duplicate are : ");

        for(int i = 0 ; i < size ; i++){

            for(int j = i + 1 ; j < size; j++){

                if(str.charAt(i) == str.charAt(j)){
                      
                    System.out.print( str.charAt(i) + " ");
                    
                    
                }
            }
        }
    }
 }*/

 // ab recursion use krke
 import java.util.Scanner;

class Q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter a string: ");
        String str = sc.nextLine();
        
        System.out.println("Duplicate characters: ");
        findDuplicates(str, 0, str.length());
        
        sc.close();
    }

    // Recursive function to find duplicates
    static void findDuplicates(String str, int i, int n) {
        if (i >= n) {
            return; // base case: if we reach the end of the string
        }
        
        // Compare current character with the rest of the string
        for (int j = i + 1; j < n; j++) {
            if (str.charAt(i) == str.charAt(j)) {
                System.out.println(str.charAt(i)); // print duplicate character
                break; // print each duplicate once
            }
        }
        
        findDuplicates(str, i + 1, n); // recursive call for the next character
    }
}
