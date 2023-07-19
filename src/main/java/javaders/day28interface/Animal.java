package javaders.day28interface;

public interface Animal {


    void eat();  //public ve abstarct yazmamiza gerek yok

    void drink();

    //1)Bu yüzden interface icindeki variable'i olusturudgunuzda mutlaka deger atamsi
    //yapmalisiniz !!! (final variable kurali )
    //Bilindigi gibi "final" variable'larin degereleri degistirilemez.
    //2) interface'lerdeki tum varibale'lar otomatik olarak "public"tir.
    //3) interface'lerdeki tum varibale'lar otomatik olarak "static"tir.
    //   static olmazsa obje olusturmak lazim ama interfaceden obje olusturulmaz
    //   Bu yüzden objesiz ulasilmasi icin java "static" yapmistir.

    int age =4;

}
