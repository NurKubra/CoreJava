package practice.day_07_practice;

import java.util.Scanner;

public class C02_DoWhile {
/*
    Bir top belirli yükseklikten atılmaktadır.(Scanner ile kullanıcıdan yüksekliği alınız)
    Atıldıktan sonra, atıldığı yüksekliğin 1/2 si kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi TOPLAM YOLU ve YERE VURMA SAYISINI bulan do while code blogu create ediniz.
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yuksekligi giriniz..");
        double yukseklik = scan.nextDouble();
        double toplamYol =0;
        int vurmaSayisi  =0;

        double i= yukseklik;
        do{
            toplamYol = toplamYol +yukseklik;
            vurmaSayisi++;
            toplamYol= toplamYol +yukseklik*0.5;   //ilk yukskeligin yarisi kadar toplam yola ekleme yaptik


            yukseklik= yukseklik*0.5;              // yuksekligi her seferinde bu sekilde yariya indiriyoruz
        }while (yukseklik>=1);

            toplamYol = toplamYol +yukseklik;      //1 den kucuk oldugunda havada kaldigindan disarda xtradan ekledik
            vurmaSayisi++;
        System.out.println("Yere vurma sayisi: "+ vurmaSayisi);
        System.out.println("Toplam Yol: "+ toplamYol);

        scan.close();
    }
}
