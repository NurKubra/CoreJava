package javaders.day14loops;

import java.util.Scanner;

public class Tekrar {

    public static void main(String[] args) {
        //Kullanici username ve password'u girsin.
        //3 kereden fazla yanlis girerse "Hesabiniz bloke olmustur" mesaji alsin
        //3 kereye kadar yanlis girerse "Yanlis girsiniz tekrar deneyiniz" mesaji atsin
        //Dogru girerse "Hesabiniza hosgeldiniz" mesaji alsin

        Scanner scan = new Scanner(System.in);
        String geciciKullAd ="NurKubra";
        String geciciSifre = "123.";

        int i =0;  //i = counter
        do{
            if(i==3){  //counter
                System.out.println("Hesabiniz bloke oldu");
                break;
            }
            System.out.println("Lütfen kullanici adinizi giriniz");
            String kullAd = scan.next();
            System.out.println("Lütfen sifre giriniz");
            String sifre = scan.next();
            i++;  //counter

            if(kullAd.equals(geciciKullAd) && sifre.equals(geciciSifre)){
                System.out.println("Hesabiniza hos geldiniz..");
                break;
            }else {
                System.out.println("Yanlis girdiniz, tekrar deneyin");
            }

        }while(true);
    }
}
