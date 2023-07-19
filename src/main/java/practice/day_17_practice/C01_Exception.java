package practice.day_17_practice;

import java.util.Scanner;

public class C01_Exception {
    // Kullanıcıdan istedigi kadar sayiyi alıp toplayan bir program yazınız
    // toplam 500'u gecerse programı bitirsin veya
    // kullanıcı bitirmek istediginde Q'ya basmalıdır
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int toplam=0;
        do{
            System.out.println("toplamak istediginiz sayiyi giriniz \n Bitirmek icin Q'ya basiniz");
            int sayi =0;    //sayiyi her yerde kullanmak icin disarda tanimladik
            try {
                sayi = scan.nextInt();
            } catch (Exception e) {
                //Q ya bastigimzda
                String hataligiris = scan.next();
                //ama once kullanici gercekten Q mu girmis diye bakiyoruz
                //oyleyse dongu disina cik, oyle degilse de hatali giris yazdirdik
                if(hataligiris.equalsIgnoreCase("q")){
                    break;
                }else{
                    System.out.println("Hatali giris");
                }
                //System.out.println("yoluna devam et");
                //throw new RuntimeException(e);
            }
            toplam+=sayi;
        }while(toplam<500);  //toplam 500 den kucukse dongu devam etsin, 500 u gecerse programi bitirir.
        System.out.println("girdiginiz sayinin toplami:" + toplam);
    }


      //Q'ya bastigimizda Exception firlatir ==>" InputMismatchException" ama hatayi run ettikten sonra verdi, yani bu bir
      // RunTime Exception.
      //Exception veren satiri secip==> yukarda Code kismina geliyoruz ordan Surround With ile try/catch secip
      //try/catch blogu icine aldik
}
