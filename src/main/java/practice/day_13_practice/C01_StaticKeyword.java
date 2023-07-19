package practice.day_13_practice;

public class C01_StaticKeyword {

    //Bir tane static variable, bir tane instance variable olusturalim. Bunlarin kullanimini main method icerisinde gosterelim.

    /*
    static variable'lar da class seviyesinde olmali
    static ve instance variable'lara deger atamk zorunda degiliz.
    static variable ==> class'a bagli
    instance varaibale ==> objeye bagli
    sayi2 yi obj1'e ve obj2'ye bagliyoruz.
    Ikisi icinde ilk deger atanmadigi icin 0'dir.
    static variable'lar class'a bagli dedik ==> bu yüzden sayi1'i de class'a bagliyoruz.Ilk deger olmaidigi icin 0'dir.

    obj1 veya obj2 uzerinden static variabale'da yazdirilabilir. Bu durumda sayi1 direk obj1 veya obj2 ye bagli olmasa
    obj1'in bagli oldugu class uzerinden alip yazdirir.

     */
    static int sayi1;
    int sayi2;

    public static void main(String[] args) {
        C01_StaticKeyword obj1 = new C01_StaticKeyword();  //instance variable'a static bir method icinde ulasabilmek icin obje olusturmaliyiz
        C01_StaticKeyword obj2 = new C01_StaticKeyword();

        // sayi1++;                                         //static variable static methodlarda direk kullanilir.
        System.out.println(sayi1);  //0 'i verir.
        System.out.println(obj1.sayi2); //0'i verir.         Obj1 veya obj2 uzerinden yazdirabilirz static olmadiig icin

        sayi1++;
        obj1.sayi2++;
        System.out.println(sayi1);        //1
        System.out.println(obj1.sayi2);   //1
        System.out.println(obj2.sayi2);   //0

        System.out.println(obj1.sayi1);  // 1                sayi1 main icinde direk kullanilabilcei gibi obj1 veya obj2 uzerinden de yazdirilabilir.
        System.out.println(obj2.sayi1);  // 1

        obj2.sayi2++;   //1
        obj2.sayi1++;   //2

        System.out.println(obj2.sayi2);  //1
        System.out.println(obj2.sayi1);  //2

        System.out.println(obj1.sayi2);   //1
        System.out.println(obj1.sayi1);   //2

        obj1.sayi2++;    //2
        obj1.sayi1++;    //3

        System.out.println(obj1.sayi2);  //2
        System.out.println(obj1.sayi1);  //3
        System.out.println(obj2.sayi2);  //1
        System.out.println(obj2.sayi1);  //3

    }
}
