package javaders.day05typecastingasciivaluestringmanipulations;

public class C03_TypeCasting {

    public static void main(String[] args) {

        /*
        Numeric Data Type'larinin birbirine donusturulmesine Type Casting denir
        Numeric Data Typleri : byte<short<int<long<float<double

        **Interview sourusu:
        Kucuk Data Type'larinin Buyuk data typelarina donusturulmeisne
        AUTO WIDENING (OTOMATIK GENISLETME) denir==>
        Kucuk kutunun buyuk kutuya donusturulmesi#

        Buyuk kutunun kucuk kutuya donusturulmesinde Java sorumlulugu kabul etmez.
        Data Kaybi olcagi icin sorumlulugu code'u yazanlara birakir
        Buna EXPLICIT NARROWING (ACIKTAN DARALTMA) denir.
        Buyuk kutudan cikarma.

         */

        byte age =13;
        int ageInt = age;  //Bu yaptigimiz AUTO WIDENING (Otomatik genisletme) // java otomatik yapar

        long population = 6789L;
        short populationShort = (short) population; // Expilicit Narrowing (Aciktan daraltma)
        // otomatik yapmaz

        //int data type'ini float data type'ina cevirniz
        int number = 2789;
        float numberFloat = number;
        System.out.println(numberFloat); //2789.0


        //short data type'ni byte data type'na cevirelim
        short numberShort=115;
        byte numberByte = (byte) numberShort;


        short numberShort2=130;
        byte numberByte2 = (byte) numberShort2;



        //


    }


}
