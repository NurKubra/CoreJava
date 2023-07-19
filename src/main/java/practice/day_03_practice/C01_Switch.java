package practice.day_03_practice;

import java.util.Scanner;

public class C01_Switch {


    public static void main(String[] args) {

        /*
        Kullanicidan 0-4 arasi sinav puanini sisteme girmesini isteyiniz.

        Eger puan 0,0-1,0 arasinda ise KALDI seviyesi veriniz
        Eger puan 1,0-2,0 arasinda ise GECTI seviyesi veriniz
        Eger puan 2,0-2,5 arasinda ise IYI seviyesi veriniz
        Eger puan 2,5-3,5 arasinda ise UST seviyesi veriniz
        Eger puan 3,5-4,5 arasinda ise HARIKA seviyesi veriniz

        switch case kullanarak KALDI seviyesine F harf notu veriniz
                               GECTI seviyesine D harf notu veriniz
                               IYI seviyesine C harf notu veriniz
                               UST seviyesine B harf notu veriniz
                               HARIKA seviyesine A harf notu veriniz

         */

    Scanner scan = new Scanner(System.in);
    System.out.println("Lütfen 0-4 arasi sinav puaninizi sisteme giriniz..");
    double not = scan.nextDouble();

    String seviye ="";

    if(not>=0 && not<1){
       seviye ="KALDI";

    }else if (not>=1 && not<2){
        seviye ="GECTI";

    } else if (not>=2 && not<2.5) {
        seviye ="IYI";

    }else if (not>=2.5 && not<3.5) {
        seviye ="UST";

    }else if (not>=3.5 && not<=4) {
        seviye ="HARIKA";

    }
    switch (seviye){

        case "KALDI":
            System.out.println("F");
            break;
        case "GECTI":
            System.out.println("D");
            break;
        case "IYI":
            System.out.println("C");
            break;
        case "UST":
            System.out.println("B");
            break;
        case "HARIKA":
            System.out.println("A");
            break;
        default:
            System.out.println("Sinav puaninizi dogru giriniz..");

    }


    }

}
