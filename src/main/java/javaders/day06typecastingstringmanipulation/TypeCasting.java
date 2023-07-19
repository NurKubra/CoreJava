package javaders.day06typecastingstringmanipulation;

public class TypeCasting {

    public static void main(String[] args) {

        // ********************  ExplicitNarrowing ***********************\\\\\\\\\\\\\\\\\\\\\

        /*
        Explicit Narrowing yaparken dikkat edilmeli cunku cok ciddi data kaybi hatta datanin degismesine neden olabilir.
        Eger donusturmeye calsitigimiz variable'in sinirlari disinda ise java sayiy; 'mod 'islemine alir ve
        kalani yazdirir.
        Kalan bolenin yarisindan fazla ise kalan sayiyi java kucultmek ister ve bolumu bir buyuterek
        kalani "-" isaretli olcak sekilde yazdirir.
         */

        //short data type'inda bir variable olusuturup byte data type'ina ceviren kodu yaziniz

        short num = 260;
        byte numByte = (byte) num;
        System.out.println("numByte = " + numByte); // sonuc 4 dür
        //-128 + 127 +0 == 256   260/255 = kln =4;

        //tekrar eski haline döndürmek istersek 4 goruruz cünkü giden gitmistir artik deger 4 dür

        short num2 =1023;
        byte num2Byte = (byte) num2;
        System.out.println("num2Byte = " + num2Byte); //-1
        //1023 /256 boldugumuzde 255 kalan oluyor bunu 256 a tamamlayip kalani -1 olarak verir.

        short num3 =1000;
        byte num3Byte = (byte) num3;
        System.out.println("num3Byte = " + num3Byte); //-24
        //kalan -24
        //java mümkün mertebe  kucuk sayilarla calismak ister.
        //eger kalan bölümün(256) yarisindan fazlaysa ; 256 -232 yapariz ==> -24
        //yani -24 + 256 ==> bize 232 i verir

        int intSayi= 8880;
        short shortSayi = (short) intSayi; //32768 + 32768 + 0
        System.out.println("shortSayi = " + shortSayi); // 8880 aynisini görür



    }


}
