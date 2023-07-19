package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C01_KullanicidanDataAlma {

    public static void main(String[] args) {



        //Kullanicidan aldiginiz charakter ile asagidaki gibi bir gorunum olusturunuz.
        /*
               A
              A A
             A A A

         */


        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen bir karakter giriniz: ");

        char karakter  = input.next().charAt(2);   //karakter yerine ch yazsak daha güzel olur
        System.out.println("  "+karakter+"  ");
        System.out.println(" "+karakter+" "+karakter+" ");
        System.out.println(karakter+" "+karakter+" "+karakter);


        /* Sadece char data type icin nextChar() diye bir method olmadigi icin kullanicidan alip
        ch konteynir'ina yerlestimek icin cagiriyoruz
        next().charAt(0);methodunu kullaniriz (0. indexteki datayi yani ilk karakteri cagirdigi icin)

        Basta input diye olusturdugumuz konteynrinda bulunan datanin ilk harfini sonradan olusturudugunuz
        ch(karakter) konteynrina cagirdik.
        */


        //Aralarinda bir tab bosluk birakarak tek sout ile ayni sekli olusturalim

        System.out.println("\t\t"+karakter+"\t\t\n\t"+
                karakter+"\t\t"+karakter+"\t\n"+
                karakter+"\t\t"+karakter+"\t\t"+karakter);   //fazladan birer tane daha \t ekledikki düzgün dursun








    }//main
}//class
