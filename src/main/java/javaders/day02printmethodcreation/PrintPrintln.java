package javaders.day02printmethodcreation;

import java.util.Scanner;

public class PrintPrintln {

    public static void main(String[] args) {
        //"TECHPRO EDUCATION" yazisini yukaridan asagiya harf harf yazdiriniz.


        //1.Yol
        System.out.println("******* 1. Yol *********");
        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println(" "); //HICLIK DE OLUR ==> ("")
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");

        //"TECHPRO EDUCATION" yazisini tek bir sout ile yukaridan asagiya harf harf yazdirniz.

        System.out.println("*********** 2. Yol **********");
        System.out.println("T\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");

        /* "\n" ==> bir alt satira gecirir.
        2 tane \n ile bosluk yapabiliirz.
        \t ==> bir tab boslugu birakmak icin
        \" ==> cümleyi cift tirnak icinde yazdirmak icin
        ctrl + alt + l ==> sayfayi duzenler
        \t de harf sayisi önemlidir ==> yoksa esit aralik birakmaz.
         */


        //JAVA ILE DUNYA GUZEL ifadeisinin her bir kelimesini alt satira yazirdan kodu tek bir sout ile yazdiriniz.

        System.out.println("JAVA\nILE\nGUZEL\nDUNYA");

        //JAVA ILE DUNYA GUZEL ifadeisinin her bir kelimesini bir tab bosluk birakan kodu yazdiriniz.

        System.out.println("JAVA\tILE\tGUZEL\tDUNYA");

        // JAVA I     ==> 1 SPACE BOSLUK
        // JAVA   I   ==> 1 TAB BOSLUK

        //"Techpro "(son tirnaktan önce arada bosluk var) ile java cok `kolay` tek bir sout ile yazdiran kodu yaziniz.

        System.out.println("Techpro ile java cok kolay");          //Techpro ile java cok kolay
        System.out.println("\"Techpro \" ile java cok \'kolay\'"); //"Techpro " ile java cok 'kolay'
        System.out.println("\"Techpro \" ile java cok 'kolay'");   //tek tirnak icin slash mecburi degil


        //"MAHARET" hic "DÜSMEMEK" degil;


        // "Her dustugunde kalkabilmektir"

        //SEKLINDE NOKTALI VIRGULDEN SONRA
        //3 SATIR ALTTAN paragraf basi yaparak yazdiran kodu tek sout ile olusturunuz

        System.out.println("\"MAHARET\" hic \"DÜSMEMEK\" degil;\n\n\n\t\"Her dustugunde kalkabilmektir\"");

        //Print ile Println arasindaki fark

        System.out.println("Hayat Techpro ile cok guzel");
        System.out.println("Ama nasil baktiginiza bagli");
        System.out.print("Yeterki siz isteyin");
        System.out.println(" Bahadir");

        //Print bir alttaki kodu direk yanina yazdirir.

        System.out.print("Ali");
        System.out.println("Can");
        //AliCan yazdirir.

        System.out.println("Ali");
        System.out.print("Can");      //Bundan sonra yazilcak kod direk Can`in yanina yazilir!
        //Ali
        //Can alt alta yazdirir.

        // Soru4)  Kullanicidan aldiginiz
        // sekille asagidaki gibi bir gorunum olusturun
        /*
             A
            A A
           A A A
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir karakter veriniz");

        char ch =input.next().charAt(0);  // ilk harfi alir
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);


        //Örnek
        int sayi = input.nextInt();
        long a = input.nextLong();
        short b = input.nextShort();






    }//main
}//class
