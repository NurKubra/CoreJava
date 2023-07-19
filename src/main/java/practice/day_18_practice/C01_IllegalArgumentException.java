package practice.day_18_practice;

import java.util.Scanner;

public class C01_IllegalArgumentException {

    /*
    Java bizim istedigimiz durumlarda Exception firlatabilir.
     */

    /* Kullanıcıdan yasını sisteme girmesini isteyiniz.
        Kullanıcı yas olarak 0'dan kucuk esit veya
        120'den buyuk esit bir sayı girerse
        IllegalArgumentException olusacak sekilde
        bir program yazınız
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int yas = scan.nextInt();

        if(yas<=0 || yas >=120){
            throw new  IllegalArgumentException(); //firlatmak istedigimiz Exception''i yaziyoruz.Bunu firlatir ve program durur.

        }else {
            System.out.println("Uygun bir yas girdiniz");
        }
        //eger Exception firlatmasini istemiyorsak try/catch kullaniriz.Kendi olustrudugumuz Exception'ini da try/cathch ile handel
        //handel edebiliriz.

        /*alinti not

         try catch tamamen bir exception'i handle etme islemi olup.
         Biz sorumuzun cozumunde try catch yerine if ve else bloklari kullandik.
         Cunku exception firlatilmasini biz istedik. Istedigimiz isimle exception firlattirabiliriz.
         */
    }
}
