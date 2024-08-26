
   // straigth pyramid
   
   
   class Pattern4 {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 1; i <= n; i++) {
           
            for (int j = 1; j <= n- i ; j++) {// j ki value everytime remains same when loop start soo..wrong spacing
                System.out.print(" ");
            }
            
            
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            for (int m = 1; m < i; m++) {
                System.out.print("*");
            }

           
            System.out.println();
        }
    }
}
/*class Pattern4{
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 0; k < (2 * (n - i) - 1); k++) {
                System.out.print("*");
            }
			
			
			
	
			
            
            System.out.println();
        }
   */

