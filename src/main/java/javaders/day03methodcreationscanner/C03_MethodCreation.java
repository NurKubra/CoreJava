package javaders.day03methodcreationscanner;

public class C03_MethodCreation {

    public static void main(String[] args) {

        //return type'i void olmasi demek bir datayi döndürmez yalnizca ekranda gösterir.

        //Dikdörtgenin alanini hesaplatan bir method olusturunuz
        //dikdortgeninAlani(20,10)+2; olmazzz void oldugu icin!!
        dikdörtgenAlani( 10,20);

        //Karenin alanini olusturan methodu yaziniz
        System.out.println("kareAlani(6) = " + (kareAlani(6)+2));      //yanina nokta koydugumda yaninda methodlar cikiyor
        //soutv ile yazinca ifadeler String oluyor. Bu yüzden extra islemler paranntez icine alinmali.

    }//main

    private static void dikdörtgenAlani(int a, int b) {

       System.out.println(a*b);

        // ya da int alan = a*b;
        // System.out.println(alan);  olarak da yazilabiir.

    }

    private static int kareAlani(int c) {
        return c*c;


    }

}//class
