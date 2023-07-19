package practice.day_02_practice;

import java.util.Scanner;

public class C07_Ternary {

    public static void main(String[] args) {
        /*
        Kullanıcıdan bir karakter sisteme girmesini isteyin.
        Ternary kullanarak;
        bu karakterin bir harf olup olmadıgını kontrol edin.
        Harf ise büyük veya kucuk harf oldugunu konsola yazdırın
        Harf degilse konsola "Harf Degil" yazdırın
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz..");
        char ch = scan.next().charAt(0);
        //1.yol
        System.out.println(ch>='a' &&  ch<='z' || ch>='A' && ch<='Z'?
                (ch>='A' && ch<='Z'? "Buyuk harf": "Kucuk Harf") :"Harf degil" );

        //2.yol
        String result = ch>='a' &&  ch<='z' ? "Kucuk harf" : (ch>='A' && ch<='Z'? "Buyuk harf" : "Harf degil");
        System.out.println(result);

    }
}
