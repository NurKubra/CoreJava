package javaders.day18constructorsstatickeyword;

public class  Car {
    //Car class kalibi
    //class olusturdugumuzda java ayni zamanda bir constructor olusturur.
    //Ama her class icin ayri bir constructor yoktur. Bir tane constructor (Object)'in icinde.

    /*
    1)Constructor nasil olusturulur?
     Access Modifier + Class Ismi +()+{}
    2)"Method" ile "Constructor" arasindaki farklar nelerdir?
    i)"Method"larda "return type" olur, "Constructor"larda olmaz.
    ii)"Method"lar yaptiklari ise göre isimlendirilirler,
     "Constructor"lar ise her zaman "Class ismi" ile isimlendrilirler.
    iii) "Method" lar bir aksiyon yapmak icin olusturulur, "Constructor" lar ise object olusturmak icindir.
    iiii) "Method" isimleri kucuk harfle baslar, "Constructor" isimleri "Class Ismi" ile ayni oldugu icin buyuk harfle baslar
    3) Parametreli constructor'lar olusturarak ayni class'tan farkli ozelliklere sahip Object'ler (objeler) olusturabiliriz.

     */
    String make ="Honda";
    String model= "Accord";
    int year =2021;
    int price =18000;

    //Default Constructor
    //Default Constructor'lar "parametre" kullanmazlar
    //Default Constructor'larin body'si bostur.
    //Java kiskanctir.Siz "default Constructor"i elle yazdiginizda
    //Java object class icindeki default Constructor'i kullandirmaz.

    public Car(){  //default class

    }

    //Custom Constructor
    public Car(String make, String model, int year, int price){
        this.make= make;  //this bu class demek
        this.model= model;
        this.year=year;
        this.price=price;

    }
    //Custom Constructor
    public Car(String make, int price) {
        this.make = make;
        this.price = price;
    }

    //Custom Constructor
    public Car(String make) {
        this.make = make;


    }
}
