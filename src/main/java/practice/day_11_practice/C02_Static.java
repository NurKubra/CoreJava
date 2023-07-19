package practice.day_11_practice;

import org.w3c.dom.ls.LSOutput;

public class C02_Static {


    static  String okulIsmi ="Yildiz Koleji";
    static int okulNo ;
    static boolean okulAcikMi;

    //instance ve static variable'lara deger atamak zorunda degiliz.
        /*

    okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
    Bu static variable'leri main icerisinde yazdıralım

      */

    public static void main(String[] args) {

        //static variabllara, ayni class icersindeki tum methodlardan ulasilabilir.
        //Baska bir class'dan ulasmak istersek "Class ismi.Variable ismi" ile cagirabiliriz.

        System.out.println(okulIsmi);  //Yildiz Koleji
        System.out.println(okulNo);     //0
        System.out.println(okulAcikMi);  //false

        //static Variable'lar gokteki ay gibidir
        //static variable'lar class'a baglidir.
        //static variable'in degeri bir kisi tarafindan degistirilirse herkes icin degisiklige ugrar.
        //return etmesek de degisiklik gerceklesir.
        //static bir method icinde de static variable'larin degerini degistriebilirz.

        okulNo= 102;
        System.out.println(okulNo);  //102

        staticMethod();
        System.out.println(okulNo);  //200

    }

    private static void staticMethod() {

        okulNo= 200;
        System.out.println(okulNo);  //200
    }



}
