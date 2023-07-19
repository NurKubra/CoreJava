package javaders.day09stringmanupilationsifstatement;

import java.util.Scanner;

public class C02_IfStatement {

    public static void main(String[] args) {

        /*
        If Statement() yapisi bazen belirli kosullara baglidir.
        Mesela cok calisirsam, Java ögrencegim.
        Java ogrenme eylemi cok calisma eylemine baglanmistir.
        1. Eylem gerceklesmeden ikinci eylem gerceklesmez.
        if(){}
        () parantez icine sart yazdirilir eger TRUE dönerse {} body arasindaki kod calisir.
        Aksi halde if body disina cikar class'ta sonraki kodlari okumaya devam eder.
         */

        //INTERWIEV QUESTION USA QA
        //String str= "abbccdc" tekrarsiz olan karakterleri ekrana yazdiriniz
        // ekranda tekrarsiz harf olarak a ve d olmali


        String str = "aac";

        //1.karakter icin
        char ch = str.charAt(0);
        if(str.indexOf(ch) == str.lastIndexOf(ch)) {  //ch konteynrindaki karakterin indexOf 'unu ve lastIndexOf unun esit olup olmadigina bak
            System.out.println(ch);      //0==1 e esit olsaydi kodum calisirdi!! (True olsaydi ) bu yüzden ekranda a cikmadi
        }  //if body

        //2. karakter icin
        char ch1 = str.charAt(1);
        int char1 =str.indexOf(ch1);
        System.out.println("char1 = " + char1);  //0   ==> karakterin ilk goruldugu yer
        int char2 =str.lastIndexOf(ch1);
        System.out.println("char2 = " + char2);  //1   ==> karakterin son goruldugu yer

        if (str.indexOf(ch1) == str.lastIndexOf(1)) {
            System.out.println(ch1);            //0 != 1 == > kod calismaz!
        }

        //3. karakter icin
        char ch2 = str.charAt(2);
        if (str.indexOf(2)== str.lastIndexOf(2))  {
            System.out.println(ch2);
        }


        //alternatif cozum

        //boolean a = str.indexOf('a')==str.lastIndexOf('a');
        //System.out.println(a); //true

        //alternatif
        ////INTERWIEW QUESTIONS USA QA
        ////String a icerisindeki tekrarsiz karakterleri yaziniz.
        //String a = "aac";
        //if (a.indexOf("a") == a.lastIndexOf("a")) {
        //    System.out.println("A");
        //
        //}else;
        //System.out.println("A karakteri Tekrarli karakter");
        //
        //if (a.indexOf("c") == a.lastIndexOf("c")){
        //    System.out.println("C");


        //Example : sayi pozitif ise ekrana "Pozitif sayi" yazdiran kodu yaziniz

        int num =20;
        if(num>0) {
            System.out.println("sayi pozitfitir");  //sayi pozitiftir.
        }

        int num1 =0;
        if(num1>0) {
            System.out.println("sayi pozitfitir");  //hic bir sey yazdirmaz.
        }

        //Example : Sayi -1 ile 10 arasinda ise ekrana "rakam" yazdiriniz.

        int number = 12;
        if (number>-1 && number<10 ){
            System.out.println("Rakamdir");  //12 olursa bir sey yazdirmaz
        // num>=0 yazarsak 2 islem yaptirmis oluruz
        }

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz..");
        int rakam = input.nextInt();

        if (rakam>-1 && rakam<10){
            System.out.println("Rakamdir");
        }

        //Example : Sayi uc basamakli ise ekrana " Sayi 3 Basamaklidir" yazdiriniz
        int number2 = -123;

        //1. Yol
        if (number2>99 && number2<1000 || number2<-99 && number2>-1000){
            System.out.println("Sayi 3 Basamaklidir");  //Sayi 3 Basamaklidir
        }
        //2.yol
        number2 = Math.abs(number2);    //number2 degerini mutlak degere ceviridk!!!! Mat.abs() methodu ile
        if (number2>99 && number2<1000){
            System.out.println("Sayi 3 Basamaklidir");
        }

        /*
        Math Class'i onemli bir class'dir. Icerisinde bir cok Method barindirir.
        abs() methodu da icersine arguman olarak verilen sayinin
        mutlak degerini yani pozitif halini verir.
         */


    }
}
