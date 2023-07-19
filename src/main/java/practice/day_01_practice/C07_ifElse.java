package practice.day_01_practice;

import java.util.Scanner;

public class C07_ifElse {


    // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
    // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        int ilkSayi = scan.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int ikinciSayi = scan.nextInt();

        if (ilkSayi>ikinciSayi){
            System.out.println("Ilk sayi ikinci sayidan buyuktur");
        }else {
            System.out.println("Ilk sayi ikinci sayidan buyuk degildir");
        }


    }
}
