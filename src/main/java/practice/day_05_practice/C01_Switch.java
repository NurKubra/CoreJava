package practice.day_05_practice;

import java.util.Scanner;

public class C01_Switch {

    /*
     Kullanıcıdan yıl ve ay numarasını ayrı ayrı sisteme girmesini isteyiniz.
       Girilen ay numarasına göre ayin kaç gün çektigini yazdırınız.


       NOT: 1, 3, 5, 7, 8, 10, 12. aylar 31 gun çeker
            4, 6, 9, 11. aylar 30 gun çeker
            2. ay 4 yılda bir 29 gun ceker, diger yıllarda 28 gun ceker
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yili giriniz..");
        int yil = scan.nextInt();

        System.out.println("1-12 arasi ay numarsini giriniz");
        int ay= scan.nextInt();

        switch (ay){

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                int gun = 31;
                System.out.println("Girdiginiz ay "+ gun + " Gun Ceker");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                gun =30;
                System.out.println("Girdiginiz ay "+ gun + " Gun ceker");
                break;
            case 2:
                if(yil%4==0){
                    gun=29;
                    System.out.println("Girdiginiz ay "+ gun + " Gun ceker");
                }else {
                    gun=28;
                    System.out.println("Girdiginiz ay "+ gun + " Gun ceker");
            }
                break;
            default:
                System.out.println("Lutfen gecerli bir ay numarasi giriniz");

        }

        scan.close();


    }

}
