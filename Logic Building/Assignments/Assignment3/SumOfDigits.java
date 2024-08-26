class SumOfDigits{

    public static void main(String args[]){
	
	
	int n = 999999;
	int sum = 0;
	int rev =0;
	
	System.out.println("The Digit is : "+ n);
	    while(n >0){
			
			//reverse the number
			int ext = n%10;
			
			rev = (rev * 10)+ ext;
			
			n = n / 10;
			
		    if(n == 0){
			 n = rev;
				break;
			}	
			// n = 4321
			
		}
		
		
		
		while(n>0){
			
			
			int ext1 = n%10;
			
			
			sum = sum + ext1;
			
			n = n/10;
			
			
			
			
		}
	
	
	
	System.out.println("The sum of digits are : " + sum);
	
	
	
	
	
	}

}