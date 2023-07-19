package practice.day_02_practice;

import java.util.Scanner;

public class C03_ifElse {

    public static void main(String[] args) {

        /*
        Kullanıcıdan 3 karakterden daha uzun bir kelime sisteme girmesini isteyin
        Eger kelimenin karakter sayısı 3 ve 3'den daha kucuk ise konsola " 3 Karakterden Daha Uzun Bir Kelime Girmelisiniz " yazdırınız
        Degilse kelimenin basına ve sonuna, kelimenin son uc harfini ekleyerek yazdırınız
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 karakterden daha uzun bir kelime giriniz..");
        String kelime = scan.next();
        String sonUcHarf = (kelime.substring(kelime.length()-3));  //yani ikinci indexten itibaren yazdir mesela 5 harfli ise


        if (kelime.length()<=3){
            System.out.println("3 Karakterden Daha Uzun Bir Kelime Girmelisiniz ");
        } else{
            System.out.println((kelime.substring(kelime.length()-3)) + kelime
                    +(kelime.substring(kelime.length()-3)));
        }

        scan.close();
    }
}
