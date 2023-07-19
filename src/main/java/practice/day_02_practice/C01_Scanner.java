package practice.day_02_practice;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {
        // Kullanıcından adını, ikinci adını ve soyadını arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        //        adının ilk karakterini, ikinci adının ilk karakterini ve soyadının ilk karakterini BUYUK harfle yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi, Ikinci Adinizi ve Soyadinizi aralarinda bosluk olcak sekilde giriniz... ");
        String adSoyad = scan.nextLine().toUpperCase().trim();  //trim de eklyerek basindaki ve sonundaki bosluklari sil dedik

        char adIlkKarakter = adSoyad.charAt(0);
        char ikinciAdKarakter = adSoyad.charAt(adSoyad.indexOf(" ")+1); //bastan tarayarak ilk boslugun yanindaki karakteri verdi
        char soyadIlkKarakter = adSoyad.charAt(adSoyad.lastIndexOf(" ")+1); //sondan tarayarak ilk boslugun bir sonrasindaki karakteri verdi

        System.out.println(adIlkKarakter +""+ ikinciAdKarakter +""+ soyadIlkKarakter);

        //2.yol
        System.out.println(adSoyad.split(" ")[0].charAt(0) +""+
                adSoyad.split(" ")[1].charAt(0) +""+ adSoyad.split(" ")[2].charAt(0));


    }
}
