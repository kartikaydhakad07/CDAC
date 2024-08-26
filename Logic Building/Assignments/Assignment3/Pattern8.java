class Pattern8{

    public static void main(String args[]){
	
	
	    for(int i = 1 ; i <= 5 ; i++){
			
			int count = 1;
			
			for (int j = 1 ; count <= i  ;  j +=2){
				
				
				System.out.print(j+" ");
				count++;
				
				if(count != i){
					
					System.out.print("* ");
				}
				
				
			}
			System.out.println();
		}
	
	
	}

}