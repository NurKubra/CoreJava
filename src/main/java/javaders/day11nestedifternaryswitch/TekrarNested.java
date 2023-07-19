package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class TekrarNested {

    public static void main(String[] args) {
         /*
        Kullanicidan =0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
        Eger calisan kadinsa 60 dan buyukse "Emekli Olabilir" yazdirin
        Eger calisan erkek ise 65 yasindan buyukse "Emekli olabilir" yazdirin
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz..");
        int yas = scan.nextInt();

        System.out.println("Lutfen cinsiyetinizi giriniz..");
        String cinsiyet = scan.next();

        if (yas > 0 || yas < 120) {
            System.out.println("Negatif veya 120 den buyuk yaslar gecerli degildir..");

        } else if (cinsiyet == "male") {
            if (yas>65){
                System.out.println("Emekli olabilir");
            } else {
                System.out.println("daha calismali");
            }
        } else if (cinsiyet =="female") {
            if(yas>60){
                System.out.println("Emekli olabilir");
            }else {
                System.out.println("daha calismali");
            }
        }else {
            System.out.println("Tanimlanmamis cinsiyet");

        }





    }
}
