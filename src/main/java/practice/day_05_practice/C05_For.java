package practice.day_05_practice;

import java.util.Scanner;

public class C05_For {
    /*
        Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayilardan 5 ile 10 arasındakiler haric, digerlerinin toplamını bulunuz

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int toplam = 0;
        for (int i = 0; i <5 ; i++) {

            System.out.println("Lütfen bir sayi giriniz");
            int sayi = scan.nextInt();
            if(sayi>5 && sayi<10){
                System.out.println("Girdiginiz sayi 5 ile 10 arasinda oldugundan isleme alinmayacktir.");
            }else {
                toplam = toplam +sayi;
            }

        }
        System.out.println(toplam);
    }
}
