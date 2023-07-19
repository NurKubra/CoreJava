package practice.day_07_practice;

import java.util.Scanner;

public class C01_While {

    public static void main(String[] args) {

        //Kullanicidan sistem bir rakam girmesini isteyiniz
        //Kullanicinin girdigi rakamin while loop kullanarak faktoriyelini bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz");
        int rakam = scan.nextInt();
        int faktoriyel =1;


        int num =1;
        while(num<=rakam){
            faktoriyel = faktoriyel*num;
            num++;
        }
        System.out.println(rakam +"!= "+ faktoriyel);


        scan.close();
    }
}
