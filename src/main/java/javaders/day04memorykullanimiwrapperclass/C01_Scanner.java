package javaders.day04memorykullanimiwrapperclass;

import java.util.Scanner;

public class C01_Scanner {


    //Kullanicidan aldiginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
    // sayilarin toplamini yazdiran kodu olusturunuz.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 5 basamakli bir sayi giriniz.... ");
        int sayi = input.nextInt(); //38671

        //Son rakam al
        int sonRakam = sayi%10;          //1
        //Sayiyi kücült
        sayi = sayi/10;                  //3867

        //sondan ikinci rakam al
        int sondanIkinciRakam = sayi%10; //7
        sayi = sayi/10;                  //386

        //Sondan ücüncü rakam al
        int sondanUcuncuRakam = sayi%10;  //6
        sayi =sayi/10;                    //38

        //Sondan dördncü rakam al
        int sondanDorduncuRakam =sayi%10;  //8
        sayi = sayi/10;                    //3

        //Son besinci rakami al
        int sondanBeisnciRakam = sayi%10;   //3


        System.out.println(sonRakam+sondanIkinciRakam+sondanDorduncuRakam+sondanBeisnciRakam);


    }
}
