package practice.day_01_practice;

import java.util.Scanner;

public class C08_ifElse {

    /*

    Kullanicidan hizmet yılını ve maasını ayri ayri sisteme girmesini isteyin.
    Eger 5 ve 5 yıldan daha fazla calısmıssa %10 zamlı maasını konsolda yazdırın.
    5 yıldan daha az calısanların zam alabilmek icin kac yıl daha calısması gerektigini konsola yazdırın

    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen hizmet yilinizi giriniz");
        int hizmetYil = scan.nextInt();

        System.out.println("Lutfen maasinizi giriniz");
        int maas = scan.nextInt();

        if (hizmetYil>=5){
            System.out.println("Zamli maas: "+ (maas + (maas*10/100)));

        }else if (hizmetYil<5){
            System.out.println("Zam alabilmek icin: "+ (5-hizmetYil) + " yil daha calismalisiniz");

        }


    }
}
