package practice.day_05_practice;

import java.util.Scanner;

public class C03_For_KatSorusu {

    /*
    Kullanıcıdan sisteme bir sayı girmesini isteyiniz.
         1'den kullanıcının girdigi sayıya kadar yazdırınız


        NOT:
        3'un ve 5'in katı olan sayıların yerine 15k yazdırılacak
        5'in katı olan sayıların yerine 5k yazdırılacak
        3'un katı olan sayıların yerine 3k yazdırılacak




        Ornegin : 1 2 3k 4 5k 3k 7 8 3k 5k 11 3k 13 14 15k..
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz..");
        int sayi = scan.nextInt();


        for (int i = 1; i <=sayi ; i++) {   //1 den sayi degerine kadar döngüye aldik
            if(i%5==0 && i%3==0){           //3 ve 5 e tam bolunuyor mu onu kontrol ettik
                System.out.print("15k ");
            } else if (i%5==0) {
                System.out.print("5k ");     //5 e tam bolunuyor mu onu kontrol ettik
            } else if (i%3==0) {
                System.out.print("3k ");     //3 e tam bolunuyor mu kontrl ettik
            }else{
                System.out.print(i+" ");
            }
        }
        scan.close();

    }
}
