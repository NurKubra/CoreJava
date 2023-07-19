package javaders.day22StringBuilder;

public class Sb01 {

    /*
    1) "StringBuilder" String üreten bir Class'tir.
    2) String Class kullanrak String üretiriz. Java nicin StringBuilder Class'i da olusturdu?
       "String" Class "immutale"(degistirilemez) String üretir,
       "StringBuilder" Class "Mutable"(degistirilebilir) String üretir.
    3) "immutable" demek orjinal degerin korunmasi, degistirilemez olmasi demektir.
       "mutable" olmak demek orjinal degerin degistirilebilir olmasi demektir.
    4) "capacity" Javanin size verdigi data depolama yer sayisidir.
        "length" ise size verilen depolanan yerinin kullanilan kismidir.
    6) Java baslangic olarak size capacity'i 16 olarak verir.
       Siz verilen capacity'i asarsaniz Java yeni capacity'i varolanin 2 katinin 2 fazlasi olcak sekilde degistirir.
     */
    /*
    Non-primitiv Data'lar Heap memory'e depolanir.
    Orjinal String degistirilmez mesela herhangi bir degisiklik yapildiginda.
    Degistirilmis data yada String'in degistirilmis hali icin yeni bir hafiza acar.
    Buna immutable olma denir yani asil data degismez. Kopya olusur. Daha cok yer kaplar.
    Ama orjinal degere yeni data atanirsa o zaman orjinal deger degisir.

    Ama StringBuilder da orjinal data da yapilan degisiklik de orjinal data degisir ve ilk hali
    kaybolur.Ama daha az yer kaplar.
     */
    public static void main(String[] args) {

        String s="Java";
        //s+"!";
        s= s+ "!";   //bu sekilde atama ile orjinal data degisir.

        String u="Apex";
        String v="Apex";
        String y="C++";

        //u ve v icin Heap memory de tek bir yer acar ve ama stack memory de farkli
        //referance adresleri olusturur.
        //Boyle bir durumda u'da yapilan degisiklikler v'de de olur bu bir problem olusturur.
        //Bu durum sikinti olmusturmamasi icin orjinal data degismez yeni degismis datayi
        //yeni bir konteynira koyar ve onu kullanir.
        //Bu immutable olma sayesinde birisinde olan degisiklik digerlerini etkilemez.

        //1.YOL
        //StringBuilder nasil olusturulur?
        StringBuilder t = new StringBuilder("Pyhton");
        System.out.println(t);   //Phyton

        //StringBuilder'lara nasil ekleme yapilir?
        t.append("!").append("..");
        System.out.println(t);     //Pyhton!..

        //StringBuilder de orjinal degeri degistirmek icin atama yapmaya
        //gerek yoktur. Direk methodlarla orjinal deger degisir.

        //2.YOl
        StringBuilder r = new StringBuilder();  //bos bir String olusturup sonra ekleme yapabiliriz.
        System.out.println(r);

        r.append("c");
        System.out.println(r);   //c


        //"capacity" ve "length" arasindaki fark nedir?
        StringBuilder sb1= new StringBuilder("Money");  //Java otomatik olarak bos 16 tane kutu verir.

        int capacity = sb1.capacity();
        System.out.println(capacity);  //21

        int length = sb1.length();
        System.out.println(length);     //5  (16+5)=21

        sb1.append("!");

        int c = sb1.capacity();
        System.out.println(c);  //21

        int ln = sb1.length();
        System.out.println(ln);  //6

        sb1.append("........................");

        int d = sb1.capacity();
        System.out.println(d);  //44 == >var olan kapsite 21'di.
        //Var olan kapasiteyi asan bir durum olursa java var olan kapsitenin 2 katini alip 2 ekler yeni
        //kapasite olusturur. 21x2 =42+2 ==44 , 44 'ü asan durum olursa 44x2 =88+2 ==90 olur o zaman!

        //Default capacity'i degistirebilirz?
        StringBuilder sb2 = new StringBuilder(2);
        System.out.println(sb2.capacity());

        sb2.append("...");
        System.out.println(sb2.capacity());  //var olan 2 ==> 2x2 =4+2=6



    }
}
