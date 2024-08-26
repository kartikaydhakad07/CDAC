class Pattern7{

    public static void main(String args[]){

    

        for(int i = 2 ;  i <= 6; i++){
			
			int count= 1;
			for(int j = 5 ; count < i ; j--){
				
				System.out.print(j+" ");
				count++;
			}
			System.out.println();
		}



    }

}