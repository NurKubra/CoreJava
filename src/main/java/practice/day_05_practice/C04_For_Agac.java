package practice.day_05_practice;

import java.util.Scanner;

public class C04_For_Agac {
    /*
    Agac sekli olusturmak icin, kullanicidan yaprak satir sayisini ve gövde satir sayisini ayrı ayrı
         sisteme girmesini isteyiniz.

         Asagıdaki agac seklini konsala yazdırınız


        ^
        ^^
        ^^^
        ^^^^
        ^^^^^
        |||
        |||
        |||
        |||
        |||


     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yaprak satir sayisini giriniz..");
        int yaprakSayisi = scan.nextInt();

        System.out.println("Govde satir sayisini giriniz..");
        int govdeSatirSayisi = scan.nextInt();

        String yaprak = "";

        for (int i = 0; i <yaprakSayisi ; i++) {
            yaprak = yaprak + "^";
            System.out.println(yaprak);
        }

        for (int i = 0; i <govdeSatirSayisi ; i++) {
            System.out.println("|||");
        }

        scan.close();
    }
}
