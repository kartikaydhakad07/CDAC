import java.util.Scanner;

class Area{
    public static void main( String args [] ){

        Scanner sc = new Scanner (System.in);

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("We Provide the area of following shapes, please select the one you want to calculate the area of ");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("1. Area of Rectangle");
        System.out.println("2. Area of Square");
        System.out.println("3. Area of Triangle");
        System.out.println("4. Area of Circle");
        System.out.println();
        System.out.println("Please select the no. which area is to be calculated");
        
        int select = sc.nextInt();

        switch (select){

            case 1 :
                System.out.println("please enter the length of rectangle");
                int ln = sc.nextInt();
                System.out.println("please enter the breadth of rectangle");

                int bd = sc.nextInt();
                int area = ln * bd ;

                System.out.println("Area of rectangle is " + area);
                break;

            case 2 :

                System.out.println("please enter the side of Square");
                int side = sc.nextInt();
    
                int area2 = side*side;
                System.out.println("Area of Square is " + area2);
    
                break;

            case 3 :
                System.out.println("please enter the height of triangle");
                int ht = sc.nextInt();

                System.out.println("please enter the base of triangle");
                int bs = sc.nextInt();

                int area3 = ( ( ht * bs ) / 2 );

                System.out.println("Area of triangle is: " +area3);

                break;

             case 4 :
                 System.out.println("Please enter the radious of circle");
                 
                 float rd = sc.nextFloat();

                 float area4 = (float)( 3.14 * (rd * rd) );

                 System.out.println("Area of circle is: "+ area4);




                
               

     




        }

    }

}

