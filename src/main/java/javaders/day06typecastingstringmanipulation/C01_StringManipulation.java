package javaders.day06typecastingstringmanipulation;

public class C01_StringManipulation {

    public static void main(String[] args) {

        String a = "Tek Rakibim Dunku Ben";

        //********** toUpperCase()******\\
        String aUpper = a.toUpperCase();
        System.out.println("aUpper = " + aUpper); // aUpper = TEK RAKIBIM DUNKU BEN .

        //********** toLowerCase()******\\
        String aLower = a.toLowerCase();
        System.out.println("aLower = " + aLower); //aLower = tek rakibim dunku ben .

        //********** charAt(0)********\\

        System.out.println("Ilk karakter:"+ a.charAt(0)); //T
        //index methodu ile calisir. 0 ilk indextir.

        System.out.println("Onuncu karakter:" + a.charAt(10)); //m
        System.out.println("a.charAt(4) = " + a.charAt(4)); //R
        System.out.println("a.charAt(3) = " + a.charAt(3)); // bosluk

        //a String deki bastan ikinci ve sondan ikinci karakteri aliniz
        //ve yan yana yazdiriniz.

        char firstChar =a.charAt(1);
        char lastsecondChar =a.charAt(19);
        System.out.println("firstChar+lastsecondChar = " + firstChar + lastsecondChar); //ee
        System.out.println("firstChar+lastsecondChar = " +" "+ firstChar +" "+ lastsecondChar); //   e e

        //sout'u aciklamali sekilde yazmaliyiz. Yani String ile birlikte yazmazsak
        //direk Ascii degerleri toplar.
        String b = "*Tek Rakibim Dunku Ben*";
        System.out.println("b.charAt(0) = " + b.charAt(0)); //*


        //********** lenght()********\\

        //a String'inde bulunan karakter sayisini bulunuz
        System.out.println("a.length() = " + a.length()); //21  //int cinsinden verir

        //********** substring()********\\

        //a String deki ilk 4 karakteri giriniz
        System.out.println("a.substring(0,4) = " + a.substring(0,4)); //"Tek "
        //ilk yazilan 0 dahil 4. indexteki harictir(bis 4)
        // a.substring(0,4) ==> demek [0,4) yani 4 dahil degil (0,1,2,3. karakteri alir yani ilk 4 karakter)

        //a String'deki 4. index dahil 7.index haric yazdiriniz
        System.out.println("a.substring(4,7) = " + a.substring(4, 7)); //Rak

        //a String'deki "Rakib" kelimesini aliniz
        System.out.println("a.substring(4,9) = " + a.substring(4,9)); //Rakib

        //eger tek bir index yazilirsa o indexten itibaren geri kalan cümleyi yazdirir.
        System.out.println("a.substring(4) = " + a.substring(4));  //Rakibim Dunku Ben


        //********** contains()********\\

        //a String'inde "bim" kelimesinin olup olmadigini kontrol ediniz
        boolean varMi = a.contains("bim");
        System.out.println("varMi = " + varMi); //true


        //********** startsWith()********\\

        //a String'inin "T" harfi ile baslayip basmadigini
        System.out.println("a.startsWith(\"T\") = " + a.startsWith("T")); //True
        //Büyük kücük harf  duyarlidir!!

        System.out.println("a.startsWith(\"Tek\",3) = " + a.startsWith("Tek", 6));
        //Ilk 6 karakteri at sonrasinda "Tek" ile baslayip baslamdigina bak
        //true ya da false
        //buyuk  kucuk harf duyarli
        //prefix baslangic , ofset at gitsin

        //Universite numaralari yil+bolumkodu+GirisSiralamasi olarak düzenlenen bir okulda
        //ogrenci Umran'in Hukuk Fakultesinde okuyup okumadini gosteren kodu yaziniz

          /*
        sinif  22   Hukuk  33    bilgisayar  44    Eczacilik  55    Maliye 66
        KimyaMuhendisligi 77  olsun
         */

        String str = "20103301";
        System.out.println(str.startsWith("33", 4));//true
        //ilk 4 karakteri at sonra 33 olup olmadigina bak !

    }//main
}//class
