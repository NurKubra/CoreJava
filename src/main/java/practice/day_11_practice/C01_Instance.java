package practice.day_11_practice;

public class C01_Instance {

    /*

   sayi, isim, ogrenciMi seklinde dort tane instance variable olusturalım.
   Bu instance variable'lerin default degerlerini main icerisinde yazdıralım

    */


    int sayi ;  //0
    String isim ; //null
    boolean ogrenciMi;  //false


    //instance Variable'lara deger atamak zorunda degiliz!!Cunku local degiller.
    //Main method icinden cagirabilmek icin instance variable'larin bulundugu class'dan obje olusturulmasi lazim



    public static void main(String[] args) {
        C01_Instance obj1 = new C01_Instance();

        System.out.println(obj1.sayi);   //0
        System.out.println(obj1.isim);  //null
        System.out.println(obj1.ogrenciMi);   //false


        C01_Instance obj2 = new C01_Instance();
        System.out.println(obj2.sayi);
        System.out.println(obj2.isim);
        System.out.println(obj2.ogrenciMi);

        obj1.isim= "Hasan";
        obj2.isim= "Huseyin";

        System.out.println(obj1.isim);
        System.out.println(obj2.isim);

        obj1.sayi= 20;
        obj2.sayi= 25;

        System.out.println(obj1.sayi);
        System.out.println(obj2.sayi);

        //instance Variable'lar Objeye baglidir.
        //Hangi obje uzerinden degisiklik yapildiysa, yapilan bu degisiklik sadece o objeyi baglar.




    }
}
