package com.arrays;
/*1.	Declare a single-dimensional array of 5 integers inside the main method. 
 * Traverse the array to print the default values. Then accept records from the user
 *  and print the updated values of the 
 */
import java.util.Scanner;

public class Arrays1 {
	int [] arr = new int [5];
	
	public static Scanner sc = new Scanner(System.in);
	
	public void AcceptRecord() {
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		
	}

	public static void main(String[] args) {
		
		Arrays1 a = new Arrays1();
		
		
		
		
		System.out.print("Default values : ");
		for(int e : a.arr) {
			
			System.out.print(e + " ");
		}
		
		System.out.println(" \n");
		
		System.out.print("Please enter values for storing in array : ");
		
		 a.AcceptRecord();
	      
	        System.out.print("Updated values: ");
	        for (int e : a.arr) {
	            System.out.print(e + " ");
	        }
	        
		
	
		
		
		
	

	}

}
