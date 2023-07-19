package practice.day_01_practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C05_Scanner {

     /*

        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Adinizi Giriniz");
        String ad = scan.nextLine();

        System.out.println("Soyadinizi Giriniz");
        String soyad = scan.nextLine();

        System.out.println("Yasinizi Giriniz");
        int yas = scan.nextInt();

        System.out.println("Boyunuzu giriniz");
        int boy = scan.nextInt();

        System.out.println("Kilonuzu giriniz");
        int kilo = scan.nextInt();

        System.out.println("Adi: "+ ad + "\n"+ "Soyad: "+ soyad + "\n" + "Yas: "+ yas +
                "\n" + "Boy: "+ boy + "\n" + "Kilo: " + kilo);

        System.out.println("Adi :"+ad +"\nSoyad : "+soyad +"\nYas :" +yas +"\nBoy : "+boy +"\nKilo : "+kilo);

    }


}
