




class Program{

    public static void main(String args[]){
        
        //-------------------Q1-----------------
        System.out.println("--------------------------Q1---------------------------\n");
        // 1.b
        boolean status = true;
        String Str = Boolean.toString(status);
        System.out.println("The string is "+ Str);

        //1.c
        String str1 = "true";
        boolean b1 = Boolean.parseBoolean(str1);
        System.out.println("the boolean value is "+ b1);

        //1.d
        String str2 = "1" ;
        boolean b2 = Boolean.parseBoolean(str2);
        System.out.println("the boolean value is "+ b2);

        //1.e
        boolean b3 = true;
        Boolean bwrap = Boolean.valueOf(b3);
        System.out.println("boolean to wrapper class is "+ bwrap);

        //1.f
        String str3 ="true";
        Boolean b4wrap = Boolean.valueOf(str3);
        System.out.println("string to boolean wrapper "+ b4wrap);

        //1.g
        boolean b5 = true;



        String s  = Boolean.toString(b5);
        System.out.println("bool to string "+s);


        //------------------Q2-----------------
        System.out.println("----------------------------Q2-------------------------\n");

        //2.b
        System.out.println("Bytes used to represent byte: " + Byte.BYTES );

        //2.c
        System.out.println("min and max value of short are "+ Byte.MIN_VALUE +" "+ Byte.MAX_VALUE);

        //2.d
        byte number = 3;
        String sb = Byte.toString(number);
        System.out.println("Byte to string "+ sb);

        //2.e
        String strNumber = "12";
        byte sb1 = Byte.parseByte(strNumber);
        System.out.println("String to byte "+ sb1);

        //2.f
        /*String strNumber1 = "12ab112sd2";
        byte sb2 = Byte.parseByte(strNumber1);
        System.out.println("big String to byte "+ sb2);        */

        //2.g
        byte b = 1;
        Byte bb = Byte.valueOf(b);
        System.out.println("obj Byte "+ bb);

        //2.h
        int i = (int) b;
        System.out.println("byte to int "+ i);
        System.out.println("-------------------------------Q3----------------------\n");


        //----------------------------Q3--------------------------

        //3.b
        System.out.println("No. of bytes to represent short value: "+ Short.BYTES);

        //3.c
        System.out.println("min and max value of short are "+ Short.MIN_VALUE +" "+ Short.MAX_VALUE);

        //3.d
        short number1 = 12;
        String strs = Short.toString(number1);
        System.out.println("Short to String "+ strs);

        //3.e
        short sr = 4;
        Short srr = Short.valueOf(sr);
        System.out.println("short obj "+ srr);

        //3.f
        String strs1 = "12";
        Short bb1 = Short.valueOf(strs1);
        System.out.println("string to short object "+ bb1);

        int ssr = (int) sr;
        System.out.println("short to int "+ ssr);
        System.out.println("--------------------------Q4---------------------------\n");

        //-------------------------------------------Q4-------------------

        //4.b
        System.out.println("bytes required to print a integer "+ Integer.BYTES);

        //4.c
        System.out.println("the maximum and minimum value of integer "+ Integer.MAX_VALUE +" "+ Integer.MIN_VALUE);

        //4.d
        int num = 4;
        String sn = Integer.toString(num);
        System.out.println("integer to string "+ sn);

        //4.e
        String sn1 ="123";
        int num1 = Integer.parseInt(sn1);
        System.out.println("string to num "+num1);
        
        //4.f
        int num2 = 34555;
        Integer num22 = Integer.valueOf(num2);
        System.out.println("int obj "+ num22);
        
        //4.h

        Integer num222 = Integer.valueOf(strs1);
        System.out.println("int obj from string "+ strs1);

        //4.i,j
        int nn = 2;
        int nnn = 33;
        int sum = Integer.sum(nn , nnn);
        System.out.println("sum of int using Integer.sum(num1 + num2) is :"+ sum);
        System.out.println("max and min val "+ Integer.min( nn,nnn) +" " + Integer.max(nn,nnn));

        //4.k
        String n3 = Integer.toBinaryString(nn);
        System.out.println("int to binary "+ n3);

        System.out.println("");
        System.out.println("---------------------------Q5--------------------------\n");
        //------------------------------------Q5---------------------------

        System.out.println("bytes to print long value is : "+ Long.BYTES);

        System.out.println("min max value of long : "+ Long.MAX_VALUE+" "+ Long.MIN_VALUE);

        //d

        long nl = 23456;
        String sl = Long.toString(nl);
        System.out.println("long to string : "+ sl);

        //e
        long nl1 = Long.parseLong(sl);
        System.out.println("string to long : "+ nl1);

        //f
        Long l1 = nl;
        System.out.println("Long obj value : "+ l1);
        

        Long l2 = Long.valueOf(sl);
        System.out.println("Long obj value by string : "+ l2);


        //i
        long nl2= 17;
        String sl2 = Long.toBinaryString(nl2);
        String sl3 = Long.toHexString(nl2);
        String sl4 = Long.toOctalString(nl2);



        System.out.println("long to binary "+ sl2);
        System.out.println("long to Hexa  "+ sl3);
        System.out.println("long to  Octal "+ sl4);

        System.out.println("");
        System.out.println("---------------------------Q6--------------------------\n");

        System.out.println("bytes in float : "+ Float.BYTES);

        //
        
        System.out.println("max nd min values in float : "+ Float.MAX_VALUE +" "+ Float.MIN_VALUE);

        
        System.out.println("max nd min values in float : "+ Float.MAX_VALUE +" "+ Float.MIN_VALUE);

        float numberf = 123.45f;
        String strNumberf = Float.toString(numberf); 
        System.out.println("Converted float to String: " + strNumberf);

        String strNumberf1 = "456.78";
        float numberf1 = Float.parseFloat(strNumberf1);  // Convert String to float
        System.out.println("Converted String to float: " + numberf1);

        float numberf2 = 234.56f;
        Float wrapperf = Float.valueOf(numberf2); 
        System.out.println("Float wrapper class: " + wrapperf);

        float f1= 7.5f;
        float f2 = 7.98f;
        
        System.out.println("sum of float numbers : "+ Float.sum(f1 , f2) );
        
        System.out.println("max of float numbers : " + Float.max(f1, f2 ));

        float numberf3 = -25.0f;
        double sqrtValue = Math.sqrt(numberf3);  
        System.out.println("Square root of -25.0: " + sqrtValue);

        




        
















    }
}