package practice.day_02_practice;

import java.util.Scanner;

public class C06_Ternary {

    /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen birinci sayiyi giriniz..");
        int sayi1 = scan.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz..");
        int sayi2 = scan.nextInt();

        //1.yol
        System.out.println(sayi1==sayi2 ? ("Sayılar Birbirine Esit"):(sayi1>sayi2 ? ("Buyuk Sayi: " + sayi1):("Buyuk Sayi: " + sayi2)));

        //2.yol
        Object result = sayi1 == sayi2 ? "Sayilar birbirine esit" : (sayi1>sayi2 ? ("Buyuk sayi: "+ sayi1) : ("Buyuk sayi: "+ sayi2));
        System.out.println(result);
    }
}
