package com.arrays;

import java.util.Scanner;

public class Arrays2 {

    int [] arr = new int [5];
	
	    public static Scanner sc = new Scanner(System.in);
	
	    public void AcceptRecord() {
		    for(int i = 0 ; i < arr.length; i++) {
		  	    arr[i] = sc.nextInt();
			
		    }
		    System.out.println("\n");
	    }
	    
	
	
	    public void PrintRecord() {
		    
	    	System.out.print("Entered values are \n");
	        for (int e : arr) {
	            System.out.print(e + " ");
	        }
	    }

	public static void main(String[] args) {
		
		Arrays2 a = new Arrays2();
		
		System.out.print("Please enter values for storing in array : ");
		
		 a.AcceptRecord();
		 a.PrintRecord();
	      
	       
	        
		
	
		
		
		
	

	}


}
