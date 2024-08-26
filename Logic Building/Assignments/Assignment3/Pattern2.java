class Pattern2{

    public static void main(String args[]){
	
	
	
	    for(int i = 1 ; i<=5; i++){
		
		    for(int j = 1 ; j <=i ; j++){
			
			
			System.out.print(i);
			
			    if(j != i ){
				
			    System.out.print("*");	
			    }
			
			}
		
		
		System.out.println("");
		}
		
		for(int k = 5 ; k>= 1; k--){
			
			for(int l = 1 ; l <= k ; l++){
				
				System.out.print(k);
				
				 if(l != k ){
				
			    System.out.print("*");	
			    }
				
				
			}
		 System.out.println("");	
		}
		
		
		
	
	}


}