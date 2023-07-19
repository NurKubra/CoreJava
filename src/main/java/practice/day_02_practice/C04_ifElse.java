package practice.day_02_practice;

import java.util.Scanner;

public class C04_ifElse {

    public static void main(String[] args) {
         /*
        Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
        Eger İlk kelimenin karakter sayısı çift ise, ikinci kelimeyi birinci kelimenin ortasına koyun.
        İlk kelimenin karakter sayısı tek ise,
        konsola "ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen birinci kelimeyi giriniz..");
        String kelime1 = scan.next();
        System.out.println("Lütfen ikinci kelimeyi giriniz..");
        String kelime2 = scan.next();

        String birinciYarisi = kelime1.substring(0,kelime1.length()/2);
        String ikinciYarisi = kelime1.substring(kelime1.length()/2); //ikinci yaridan itibaren sona kadar alir

        if(kelime1.length()%2==0){
            System.out.println(birinciYarisi + kelime2 + ikinciYarisi);

        }else
            System.out.println("ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli");

        scan.close();
        }
    }

