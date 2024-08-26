class ReverseNum{

    public static void main(String args[]){
	
	int n = 4321;
	int rev = 0;
	
	int finalRevNum=0;
	
	System.out.println("The number to be reversed is " + n ); 
	
	while(n!=0){
	
	rev = n %10;           //-------- last digit remains...remainder
	
	//System.out.print(rev);
	
	
	
	 finalRevNum = (finalRevNum *10 )+ rev;         //--------- for reverse number number generate..
	
	
	
	n = n/10; /*---------now to delete the last digit...divide by 10
	                     bcos it take int value and aswer will generate decimal 
			             val so remaining values after decial will be ignored*/
	
	
	
	}
	System.out.print(finalRevNum);
	
	}

}