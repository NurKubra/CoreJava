package javaders.day12switchloopsDT;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        //Example 1:Ay numarasini söyleyince numarasi verilen ay'dan baslayip 12. aya kadar tum aylarin isimlerini
        //yazdiran kodu yaziniz.
        //   8==> August September October November December


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Baslangic ayninin kacinci ay oldugunu giriniz..");
        int numOfMonth = input.nextInt();

        //mesela 8 le islem yaparsak numOfMonth 'in 8 oldugu duruma bak ve degis diyoruz
        //August yazdirir ve break olmadiginda devaminda kalan kodlari da yazdirir
        switch (numOfMonth){
            case 1:  //1 ' kullanicinin verdigi degerin turune gore yazdik
                System.out.println("Januar");
                //break yazmamaiz lazim, break görene kadar islemi devam ettirmesi icin
            case 2:
                System.out.println("Februar");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;  //buraya break koymazsak default'u da yazdirir.
            default:
                System.out.println("Lütfen gecerli bir kod giriniz..");
                //break yazdirmamiza gerek yok
        }

        //NOT : "switch" condition parantezi icinde 1)String 2)int 3)byte 4)short 5)char kullanilabilir.
        //NOT : "switch" condition parantezinde 1)long 2)boolean 3)float 4)double kullanilmaz.
        //boolean 2 farkli deger aldigi icin gerek yok. switch 2 den fazla durumlar icin kullanilir.

    }
}
