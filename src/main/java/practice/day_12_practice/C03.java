package practice.day_12_practice;

public class C03 {
    //Instance Variable kod blok calisma mantigi okuma

    //not: Instance Variable'lar Objeye baglidir.
    //hangi obje uzerinden, variable da degiisklik yapildiysa, yapilan bu degisiklik sadece o objeyi baglar.

    //Bu class calistiginda output ne olur. Calisma mantigini anlatiniz.

    int fiyat=300000;
    int yil =2023;
    String marka ="Opel";

    public C03(int fiyat, int yil, String marka) { //parametreli cont.a asagidaki degerlerle birlikte gelir ama deger atamasi yapmazsak instance degerler yazdilir.
        this.fiyat=fiyat;
        this.yil=yil;
        this.marka=marka;
    }
    public C03() {

    }
    public static void main(String[] args) {

        C03 obj1 = new C03();  //parametresiz const. zaten Java görünmeyen defalt bir constructor olusturur, ama parametreli bir cont. olustdgmzda
                               //class'in icinde mevcutta bulunan Default cont. iptal olur bu yüzden ==> parametresiz icin de ayrica bir cont. olusturmak gerekir
        System.out.println(obj1.fiyat);
        System.out.println(obj1.yil-3);
        System.out.println(obj1.marka.replace("Opel","Mercedes"));

        C03 obj2 = new C03(500000,2021,"Citroen");
        System.out.println(obj2.fiyat+","+obj2.yil+","+obj2.marka);   // ==> obje icinde tanimlanan degerleri esayn etmeden once=> 300000,2023,Opel
                                                                      //parametrli cont. bize objden gelen degerleri cont icinde intsance degerlerle esayn ettik
                                                                      //cont. icinde instance vari. deger atamasi yapildi.O zaman yeni degerler yazdirlrir ==> 500000,2021,Citroen
                                                                      //degerler yalnizca obj2 uzerinden yapilmistir.Yapilan degiisklik sadece o objeyi baglar.

    }
}
