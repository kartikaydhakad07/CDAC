import java.util.Scanner;

//4. Write a program to remove duplicate elements from a single-dimensional array
//   of integers.



public class Duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int [5];
		
		System.out.print("PLease enter the values	:	");		
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Removing duplicate elements	:	" );
		
		for(int i = 0 ; i < arr.length ; i++) {
			boolean dup = false;
			
			for(int j = 0 ; j < i ; j++) {
				
				if(arr[i] == arr[j]) {
					dup = true;
					break;
				}
			}
			
			if(!dup) {
				System.out.print(arr[i]+" ");
			}
		}
		sc.close();
		

	}

}
