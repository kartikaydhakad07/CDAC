class LargestNo{


    public static void main(String args[]){
	
	
	int n = 9825;
	int largest = 0;
	
	
	System.out.println("The entered no. is : "+ n);
	
	
	
	for(int i=1 ; i <= 4 ; i++){
		
		int extract = n%10 ; // to extract one digit

        
		if(extract > largest){
			
			largest = extract;
			
		}
		
		n = n/10; // to remove the perviously used digit 
		
		
	}
	
	System.out.println("Largest no. is :" + largest);
	
	}
}