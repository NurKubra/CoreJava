package javaders.day10stringmanipulation;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        //If it rains;I will cancel the picnic.
        //Eger yagmur yagarsa piknigi iptal edecegim.

        //Example : Verilen bir karakterin buyuk harf ise ekrana "Buyuk harf" yazdiran kodu yaziniz.
        char ch = 'A';
        if (ch>='A' && ch<='Z') {
            System.out.println("Buyuk harf");  //ascii degerlerine gore kiyaslar.65 ile 90 araliginda-->A ile Z
        }
        /*
        Karsilastirma operatorleri:
        == Esit mi ?
        != Esit degil mi ?
        >= Buyuk esit
        <= Kucuk esit
         */



        //Example :Verilen sayi cift sayi ise ekrana "Cift Sayi" yazdiran kodu yaziniz.
        int num = 24;
        if (num%2==0){   //2 ye kalandan sifir vermesi gerekir, 0 da cift sayidir, -'li degerler icin de gecerlidir.
            System.out.println("Cift Sayi");
        }
            //Kodun dinamik yazilmasi icin Variable'in yazilmasi gerekir.
            //Direk deger yazilirsa hurd coding yani tek datalik kod olur.


        //Example :Verilen bir sayi 300'den kucuk veya 1200'den buyuk
        //ise "Harika Sayi" yazdiran kodu yaziniz

        int sayi = 200;
        if (sayi<300 || sayi>1200) {
            System.out.println("Harika Sayi");
        }


        //Example : Kullanicidan alinan Datanin Tek mi; cift mi oldugunu yazdiran kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz..");
        int sayi2=input.nextInt();
        //1.yol
        if (sayi2%2 !=0) {
            System.out.println("Tek sayidir");
        }
        if (sayi2%2 ==0) {
            System.out.println("Cift sayidir");
        }
        //2.yol
        if (sayi2%2 ==0) {  //Eger num icerisindeki datanin 2'ye bolumunden kalan 0'a esitse "Cift sayidir" yazdirir
            System.out.println("Cift sayidir");
        }else {  //else= degilse demek geriye kalan tum ihtimaller icin burasi calisir.
            System.out.println("Tek sayidir");
        }

        //Example : Verilen bir sayinin negatif mi pozitif mi nötr mü oldugunu söyleyen kodu yaziniz

        int sayi3 = -56;
        if (sayi3<0){
            System.out.println("Negatif sayi");
        } else if (sayi3 ==0 ){
            System.out.println("Notr sayi");
        }else {
            System.out.println("Pozitif sayi");
        }







    }//main
}//
