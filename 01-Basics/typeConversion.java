public class typeConversion {

    public static void main(String[] args) {
        
        //1. Implicit conversion : Java automatically converts a smaller data type into a larger data type.
        //(byte --> int)
        // byte b = 24;
        // int i;
        // i = b;
        // System.out.println(i);

        //(byte --> short)
        // byte a = 10;
        // short b = a;
        // System.out.println(b);

        //(short --> int )
        // short a = 100;
        // int c = a;
        // System.out.println(c);

        //(short --> float)
        // short a = 150;
        // float b = a;
        // System.out.println(b);



        // 2. Explicit conversion : When converting from a larger data type to a smaller data type, Java requires you to do it manually.
        // int i = 300;
        // byte b ;   //-128 to +127

        // b = (byte) i;
        // System.out.println(b);  //300 % (range of byte ): i.e->256.  300%256 = 44


        // double x = 20.9;
        // int y = (int) x;
        // System.out.println(y);



        // 3. Truncating conversion: // Truncating conversion: Removes the decimal part while converting float/double to an integer type.
        // float f = 30.99f;

        // int i = (int) f;
        // System.out.println(i);


        // Boolean to any data type
        // These conversions are not possible

        // boolean bool = false;
        // int i;

        // i = bool;


        byte b = 50;
        b = (byte) (b*2);  //100
        System.out.println(b);











    
    }
    
}
