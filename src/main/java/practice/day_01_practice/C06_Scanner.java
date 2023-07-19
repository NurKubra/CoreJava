package practice.day_01_practice;

import java.util.Scanner;

public class C06_Scanner {

    // Kullanicidan ismini ve soyismini arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
    // isminin ilk karakterini ve soyisminin ilk karakterini BUYUK harfle yazdırınız.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Isminizi ve Soyisminizi giriniz");
        String isimSoyisim=scan.nextLine().toUpperCase();

        //1.yol
        char isimIlkKarakter = isimSoyisim.charAt(0);
        char soyIsimIlkKarakter = isimSoyisim.charAt(isimSoyisim.indexOf(" ")+1);  //bosluktan sonraki ilk idexin karakterini verir
        System.out.println(""+ isimIlkKarakter+soyIsimIlkKarakter);


        //2.yol
        char isimIlkKarakter2 = isimSoyisim.charAt(0);
        char soyIsimIlkKarakter2 = isimSoyisim.split(" ")[1].charAt(0);
        System.out.println(""+ isimIlkKarakter + soyIsimIlkKarakter2);




    }
}
