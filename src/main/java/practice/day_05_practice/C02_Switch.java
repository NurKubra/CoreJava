package practice.day_05_practice;

import java.util.Scanner;

public class C02_Switch {

    /*
     Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.

     işlem 1: Bakiye Sorgulama
     işlem 2: Para Cekme
     işlem 3: Para Yatırma
     işlem 4: İşlemi Sonlandırın

     Ve bu islemleri Switch case kullanarak yaptırınız.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1-4 arasi islem numarasini giriniz.."+"\n"+
                        "     işlem 1: Bakiye Sorgulama\n" +
                        "     işlem 2: Para Cekme\n" +
                        "     işlem 3: Para Yatırma\n" +
                        "     işlem 4: İşlemi Sonlandırın");
        int islemNo = scan.nextInt();
        int bakiye = 1000;

        switch (islemNo){
            case 1:  //Bakiye sorgulama
                System.out.println("Bakiyeniz: "+ bakiye+ " TL");
                break;

            case 2:  //para cekme
                System.out.println("Lütfen cekmek istediginiz miktari girin");
                int cekilcekPara = scan.nextInt();
                if(cekilcekPara<=bakiye){
                    bakiye = bakiye -cekilcekPara;
                    System.out.println("Para cekme isleminden sonraki mevcut Bakiyeniz: "+ bakiye + " Tl");
                }else {
                    System.out.println("Bakiyeniz yetersiz..");
                }

                break;
            case 3:   //para yatirma
                System.out.println("Lütfen yatirmak istediginiz miktari girin");
                int yatirilanPara = scan.nextInt();
                if(yatirilanPara<=2000) {
                    bakiye = bakiye + yatirilanPara;
                    System.out.println("Mevcut bakiyeniz "+ bakiye +" TL");
                }else{
                    System.out.println("ATM'de gunluk para yatirma 2000 TL");
                }
                break;

            case 4: //Islmei sonlandirin
                System.out.println("Techpro Bank'i kullandiigniz icin tesekkur ederiz");
                break;
            default:
                System.out.println("Gecerli bir numara giriniz..");





        }

        scan.close();
    }
}
