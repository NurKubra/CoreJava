package practice.day_05_practice;

import java.util.Scanner;

public class C06_While {
    /*
     Kullanıcından sisteme bir sayi girmesini isteyiniz,
        // kullanıcının girdigi sayıdan baslayarak, 10'un katına gelene kadar ardısık yazdırınız



        // Örn: Sayı: 41
        //      Çıktı: 41, 42, 43, 44, 45, 46, 47, 48, 49
     */

    //Baslangici ve sonu belli olanlar icin for loop kullaniriz.
    // Ama baslangic ve sonu belli degilse while loop
    // sonsuz döngü ise de do while(true)

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        //  int i =sayi;
        while(sayi%10!=0){

            System.out.print(sayi+ " ");
            sayi++;
        }
    }
}
