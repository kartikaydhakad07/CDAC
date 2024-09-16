package com.arrays;
/*3.	Write a program to find the maximum and minimum values in a single-dimensional
 *  array of integers
 */
import java.util.Scanner;

public class Arrays3 {
	
	static int max ;
	
	static int min;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int [] arr = new int [5];
		
		System.out.println("Please enter values to store : ");
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The maximum number in the array is : ");
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		
		System.out.println(max);
		
		
		min = arr[0];
		
		
        System.out.println("The minimum number in the array is : ");
		
		for(int i = 0 ; i < arr.length ; i++) {
			
				
				if(min > arr[i]) {
					min = arr[i];
				}
			
		}
		
		
		System.out.println(min);
		
		sc.close();

	}

}
