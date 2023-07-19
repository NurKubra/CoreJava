package javaders.day03methodcreationscanner;

public class C03_MethodCreationAksamDers {
    /*
           Javada method nasil olusturulur?


           1)Javada Method main Method disinda olusturulur.

           2)Tekrar tekrar kullanmamiz gerekiyorsa method olustururuz

           Accsess Modifier * Return Type * Method ismi + () + {}

           Islem yapilcak olan sayilari methodIsmi () parantezin icine eklenir.

          SCOPE : kapsam alani bir variablenin bir degerin hangi alanda kapsam icinde oldugunu gosterir
          Bu yüzden ayri methodlar icinde ayni ifadeleri (a ve b gibi) kullanabiliriz.

            */
    public static void main(String[] args) {

        //1) Verilen iki sayiyi toplayan methodu olusturunuz
        add(30,87);
        
        //2)Verilen 2 sayiyi carpan methodu yaziniz
        multiply(46,12);

        //3)Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz
        firstTwoMultplyThirdAdd(10,20,30);

        //Ya da farkli bir yol
        System.out.println("3 sayidan ilk ikisini carp ücüncü topla: "+ ilkIkiCarpUcuncuTopla(2, 3, 5));
        
        //4)Verilen bir ondalik sayinin küpünü hesaplayan kullandiran bir method olusturunuz
        double sayininKüpü = getCube(5.6);
        System.out.println("sayininKüpü = " + sayininKüpü);

        //5)Dairenin cevresini hesaplayan bir method olustunuz ve kullaniniz
        System.out.println("daireninCevresi = " + daireninCevresi(2));

    }//main

    private static double daireninCevresi(int r) {
        return 2*314*r/100;

    }


    public static double getCube(double v) {
        return v*v*v;

    }

    private static int ilkIkiCarpUcuncuTopla(int x, int y, int z) {

        return x*y+z;
    }

    private static void firstTwoMultplyThirdAdd(int x, int y, int z) {
        System.out.println((x+y)+z);
    }

    private static void multiply(int a, int b) {

        System.out.println("carpma:"+ a*b);
    }

    static void add(int a, int b) {    //Access Modifier default oldugu icin bir sey yazilmadi

        System.out.println("Toplama:"+ a+b);
        
    }

}//class
