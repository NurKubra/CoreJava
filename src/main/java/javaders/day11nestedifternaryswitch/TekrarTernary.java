package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class TekrarTernary {
    public static void main(String[] args) {

        //Kullanicidan alinan iki sayidan kucuk olanini ekrana yazdiriniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz..");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        if (sayi1<sayi2){
            System.out.println(sayi1);
        }else {
            System.out.println(sayi2);
        }
         //2.yol

        int sonuc = sayi1<sayi2 ? sayi1 : sayi2;
        System.out.println(sonuc);


         /*
        Kullanicdan bir sayi aliniz, o sayi pozitif ise ekrena "Pozitif" yazdirin,
        degilse ekrana "Pozitif Degil" yazdirin
         */
        //1.yol
        System.out.println("Lutfen bir sayi giriniz..");
        int sayi = scan.nextInt();

        if (sayi>0){
            System.out.println("pozitif sayi");
        }else {
            System.out.println("pozitif degil");
        }
        //2.yol

        String sonuc2 = sayi>0 ? "pozitif" :"pozitif degil";
        System.out.println(sonuc2);

         /*
        Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
        1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
        2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
         */

        System.out.println("Lütfen bir yil giriniz..");
        int yil = scan.nextInt();

        //1.yol
        if (yil%100==0){
            if(yil%400==0){
                System.out.println("artik yildir");
            }else {
                System.out.println("artik yil degildir");
            }

        } else if (yil%100!=0) {
            if(yil%4==0){
                System.out.println("artik yildir");
            }else {
                System.out.println("artik yil degildir");
            }

        }else {
            System.out.println("gecersiz islem");
        }
        //2.yol

        String sonuc3 = yil%100==0 ? (yil%400==0 ? "artik yil": "artik yil degildir") : (yil%4==0 ? "artik yil": "artik yil degildir");

         /*
        Kullanicidan aldiginiz sayi cift sayi ise yarisini ekrana yazdiriniz, tek ise "Bu sayi ikiye bolunmez" yazdiriniz.
         */

        System.out.println("Lutfen bir sayi giriniz..");
        int sayi4 = scan.nextInt();

        Object sonuc4 = sayi4%2==0 ? sayi4/2 : "Bu sayi ikiye bolunmez";
        System.out.println(sonuc4);

    }
}
