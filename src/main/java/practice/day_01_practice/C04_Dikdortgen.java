package practice.day_01_practice;

import java.util.Scanner;

public class C04_Dikdortgen {

    // Kullanicidan dikdortgenin a ve b kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
    // ve Dikdorgenin cevresini hesaplayarak ekrana yazdiriniz


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin a kenarini giriniz");
        int a =scan.nextInt();

        System.out.println("Lutfen dikdortgenin b kenarini giriniz");
        int b =scan.nextInt();

        System.out.println("Dikdortgenin Cevresi: "+((2*a)+(2*b)));  //parantez icine yazilmali yoksa yanyana yazdirir.


    }
}
