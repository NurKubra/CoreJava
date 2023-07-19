package javaders.day01variablescanner;

public class Variables {

    //byte, short, integer, long, double, float
    //veri tiplerinin max ve min degerlerini yazdiralim

    public static void main(String[] args) {

        byte byteMax = Byte.MAX_VALUE ;
        byte byteMin = Byte.MIN_VALUE ;
        System.out.println("byteMax : " + byteMax);  //byteMax = 127
        System.out.println("byteMin = " + byteMin);  //byteMin = -128


        short shortMax = Short.MAX_VALUE ;
        short shortMin = Short.MIN_VALUE ;
        System.out.println("shortMax = " + shortMax);
        System.out.println("shortMin = " + shortMin);


        int intMax = Integer.MAX_VALUE ;
        int intMin = Integer.MIN_VALUE ;
        System.out.println("intMax = " + intMax);
        System.out.println("intMin = " + intMin);


        long longMax = Long.MAX_VALUE ;
        long longMin = Long.MIN_VALUE ;
        System.out.println("longMax = " + longMax);
        System.out.println("longMin = " + longMin);

        float floatMax = Float.MAX_VALUE ;
        float floatMin = Float.MIN_VALUE ;
        System.out.println("floatMax = " + floatMax);
        System.out.println("floatMin = " + floatMin);


        double doubleMax = Double.MAX_VALUE ;
        double doubleMin = Double.MIN_VALUE ;
        System.out.println("doubleMax = " + doubleMax);
        System.out.println("doubleMin = " + doubleMin);




    }//main body

}//class body
