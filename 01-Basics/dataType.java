package Day1;

public class Demo {
    public static void main(String[] args) {

        //Integers : byte, short, int , long
        //Binary(2), Octal(8), Hexadecimal(16) number system
        // byte b = 10; // decimal
        // byte b = 0b101; //Binary
        // byte b = 07; // 0 -> 7 --> octal
        byte b = 0XA; //hexadecimal(0-15) --> 0-9, A, B, C, D, E, F

        Short s = 50;
        int i = 4000;
        long l = 10000;

        //Real Numbers : folat & Double
        float f = 10.25f;  //single Precision
        // double d = 20.0093;  //Double Precision --> standard way 
        double d = 6.022e23; //6.022 * 10^23

        //characters 
        char c = 'a'; //'a' -> integer -> binary -> store

        //boolean 
        boolean bool = false;


        System.out.println( "Integer values -->" + b +  " ,"  +  s  +  " ,"  +  i  +  " ,"  +l);

        System.out.println("Floating values -->" + f + " ," + d);
        System.out.println("character value-->" +c);
        System.out.println("Boolean value-->" + bool);
    }
    
}
