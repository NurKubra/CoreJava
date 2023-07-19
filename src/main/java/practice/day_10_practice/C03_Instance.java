package practice.day_10_practice;

public class C03_Instance {

    int sayi;  //0
    String bransIsmi ="Java";

    boolean okuldaMi;  //false


    public static void main(String[] args) {
        /*

    sayi, bransIsmi, okuldaMi seklinde uc tane instance variable olusturalım.
    Bu instance variable'leri main icerisinde yazdıralım

      */
        //instance Variable'lar class icinde ama main method disinda olusturulan variable'lardir.
        //instance variable'lar object ile cagrilir.
        //instance variable'lara deger atamasi yapmak sart degildir.
        //boolean'in default degeri "false", int default degeri "0" dir.
        //static yazmiyorsa instace'dir
        //static bir method icinde kullanmak icin Obje olusturmaliyiz.


        //"instance " varaible'lara static method'dan ulasabilmek icin Object olusturmamaiz gerekir;

        C03_Instance obj1 = new C03_Instance();  //obje olusturulduktan sonra variable'a yeni bir deger atanmis mi diye bakar
                                                 // yoksa instance degeri yazdirir
        System.out.println(obj1.sayi);   //0
        System.out.println(obj1.bransIsmi); //Java
        System.out.println(obj1.okuldaMi);  //false


        //instance variable'lar objeye baglidir.
        //Hangi obje uzerinden variable'da degisiklik yapildiysa, yapilan bu degisiklik sadece o objeyi baglar.

        obj1.sayi =10;
        System.out.println(obj1.sayi);  //10


        C03_Instance obj2 = new C03_Instance();

        System.out.println(obj2.sayi);  //0
        System.out.println(obj2.bransIsmi); //Java
        System.out.println(obj2.okuldaMi);  //false

        obj1.bransIsmi ="SQL";
        System.out.println(obj1.bransIsmi);  //SQL
        System.out.println(obj2.bransIsmi);  //Java

        obj1.okuldaMi =true;
        System.out.println(obj1.okuldaMi); //true
        System.out.println(obj2.okuldaMi); //false

        obj2.sayi =100;
        System.out.println(obj2.sayi);  //100
        System.out.println(obj1.sayi);  //10

        obj2.bransIsmi ="API";
        System.out.println(obj2.bransIsmi);  //API


    }
}
