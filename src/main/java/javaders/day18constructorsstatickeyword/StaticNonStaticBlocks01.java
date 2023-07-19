package javaders.day18constructorsstatickeyword;

import java.time.LocalDate;

public class StaticNonStaticBlocks01 {

    /*
    1)"static block"lar "static variable"lara ilk degerlerini atamak icin (initialize) icin kullanilir.
    2)"static" bir variable'a deger atamak icin kod yazmaniz gerekirese "static block" kullaniniz.
    3)"static" bir variable'a deger atamak icin yazilmasi gereken kod main method icine de yazilabilir ama
    "static block" icine yazilan kod "main nmethod" icine yazilan kod'dan önce calistirilir.
    4)Bir class'da bir'den fazla static block varsa ustteki once calistirilir.
     ==> yani önce static block 1, sonra 2 ve main method !!
     */

    //static variable'lar "static block" kullanilmadan da "initialize" edilebilirler.
        public static double pi =3.14;

    //static variable'lar "static block" kullanilarak da initialize edilebilirler.  ==> direk deger verilerek yapilcaksa bu sekilde yapmya gerek
                                                                                   //yok yukardaki yetereli ama icinde bir islem yapip deger bulcaksak gerekir!!
    //Asagidaki gibi "static" bir variable'a deger atamak icin kod yazmamiz gerekirse "static block" kullaniniz.
        public static double price;
        static {
            System.out.println("Hey i am a static block 1");
            LocalDate d = LocalDate.now();    // bu kodu main method icinde yazarsak da calisir.
                                              // Ama static classlar main methoddan her zaman önce calisir.
            if (d.getMonthValue() == 3) {
                price = 1000;
            }else {
                price=1200;
            }
        }

       //pi  ve price ile birlikte gelir!!!

     //main method
        public static void main(String[] args) {
            System.out.println("Hey i am a main method");
        }


        static {
            System.out.println("Hey i am a static block 2");
        }
    }


