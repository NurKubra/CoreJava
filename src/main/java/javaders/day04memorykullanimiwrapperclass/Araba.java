package javaders.day04memorykullanimiwrapperclass;

import java.util.Scanner;

public class Araba {
    /*
        //Class ==> Variable (Pasif Özellikler) ==> Object
                ==> Methodlar (Aktif özellikler)

         */
    public String model ="v60";
    public String renk ="Beyaz";
    public int fiyat = 1500000;

    public static void main(String[] args) {

    // Bir Obje olustururken ;

    // Class ismi + Objenin Ismi + = + new + Classismi() ==> Constructor;
        // Scanner     input          =   new Scanner(System.in);

       Araba       volvo          =   new Araba();

       hareket();
       dur();
       yakit();
       System.out.println("volvo.fiyat = " + volvo.fiyat);
       System.out.println("volvo.renk = " + volvo.renk);
       System.out.println("volvo.model = " + volvo.model);   //Variable lari burda kullandik o yüzden renklendiler


    }//main

    private static void yakit() {
        System.out.println("Volvolar az yakit tuketir..");
    }

    private static void dur() {
        System.out.println("Volvo Guvenle durur..");
    }

    public static void hareket() { //Aktif özellikler
        System.out.println("Volvo hizli gider..");
    }
}
