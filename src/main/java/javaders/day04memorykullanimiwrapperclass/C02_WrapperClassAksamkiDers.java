package javaders.day04memorykullanimiwrapperclass;

public class C02_WrapperClassAksamkiDers {

 /*

    Javada sonucta bir urundur.
    Oracle firmasinin bir urunudur.Developerlar sadece data
    barindiran Primitve data typelarinin Non-primitive ler gibi
    method 'da barindirmasini istemislerdir.Bunu uzerine Java
    primitive data type'larina method ekleyerek; özel bir class olusturmustur.
    Buna da wrapper(sarmalamak,durum) class denir.


        Primitive               Non-Primitive
         byte         ==>          Byte
         short        ==>          Short
         int          ==>          Integer  *****
         long         ==>          Long
         float        ==>          Float
         double       ==>          Double
         boolean      ==>          Boolean
         char         ==>          Character  *****


     */

    public static void main(String[] args) {

        byte primitiveByte = 12;
        Byte wrapperByte = 12;

        //byte data type'inin en büyük ve en kucuk degerini ekrana yazdirin

        System.out.println(Byte.MAX_VALUE); //127
        System.out.println(Byte.MIN_VALUE); //-128


        //Ex : int data type'inin maximum degeri ile byte data type'inin
        // minimum degerinin toplamini hesaplatan methodu olusturunuz


        int intMax = Integer.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;

        System.out.println("Integer.MAX_VALUE+Byte.MIN_VALUE = " + (Integer.MAX_VALUE + Byte.MIN_VALUE));

        //****** Primitive Data Type'larini Wrapper Classlar Nasil Ceviririz*******

        float primitiveFloat = 12.33f;
        Float wrapperFloat = primitiveFloat;

        System.out.println("wrapperFloat = " + wrapperFloat);   //buna Autoboxing denir
        //Otomatik kutulama Java bunu otomatik olarak yapar kucuk kutuyu buyuk kutuya yerlestirir.

        //***** Wrapper Classlari Primitive Data Typelarina Nasil Ceviririz ********

        Character wrapperChar = 'a';
        char primitiveChar = wrapperChar;  //Unboxing kucuk kutuyu buyuk kutudan cikarma Java bunuda otomatik yapar.

        //Ex Verilen iki string datanin toplamini veren kodu yaziniz.

        String str1 = "12345";
        String str2 = "678";
        System.out.println(str1+str2);  //yan yana yazdirir==> 12345678

        //String data turu yan yana yazmaya yarar buna CONCANITATION - CONCAT denir.

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));  //Artik toplama yapiyor ==> 13023

        //Method nasil olusturuldugunu nokta koyduktan sonra yanda cikan ipucundan gorebiliriz
        //Integer.valueOf(str1) parantez icinde bir ifade olmali!!

        //valueOf() ==> String bir datayi Integer'a donusturur.

        /*Javada "+" sembolü iki int icin matematikteki giibi toplma islemi yapar
        Iki String data arasinda ya da bir String bir int arasinda ise yanyana yazdirilir.
        Buna "Concatination" denir.
        Java matematik bilir islem önceligine gore calisir;
         i)Uslu Sayilar
         ii)Parantez ici
         iii)carpma/bolme
         iv) toplama/cikarma

        */

        String harf = "A";
        int sayi = 7;
        //harf + sayi ==> A7

        /*
        8+3+"K"
        "K"+3*5/2;  ==> K7 (integer oldugu icin 7.5 olmaz

         */

        String a= "K";
        int b=3, c=5, d=2;
        System.out.println(a+b*c/d);

        //Java soldan saga yukaridan asagi calisir, bu yüzden ilk carpma yapar.

        String w ="K";
        double x=3, y=5, z=2;
        System.out.println(w+x*y/z);   //K7.5






    }




}

