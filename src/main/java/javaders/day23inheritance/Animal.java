package javaders.day23inheritance;

public class Animal {


    /*
    1)eat(){} methodu' gibi bir cok class'in kullanilmasi gereken method'lari her class'a ayri ayri yazarsak;
           i)Tekara yapmis oluruz, tekrar ideal code'da olmamalidir.
           ii)Ayni method'u tekrar tekrar yazmak zaman kaybidir.
           iii)Tekrar tekrar yazilan method'un tamiri cok zaman alir.
           iv)Tekrar tekrar yazilan methud'un gelistirilmesi cok zaman alir.
           v)Methodu'u tekrar tekrar yazmak "atomic yapi"ya terstir.

           Animal class'inda olusturulan methodlari kullanabilmek icin o class'in cocuklari olmalidir.

    2)     private class member'lar child classlar tarafindan kullanilamaz.
           (görülemezler ki kullanilsinar)
           public class member'lar child class'lar tarafindan kullanilabilirler.
           default class member'lar ayni package'de child class'lar tarafindan kullanilabilirler.
           protected class member'lar farkli package'de de olsalar child class'lar tarafindan kullanilabilir.

    3)     Java'da bir class'in sadece bir tane Parent'i olabilir.
           Coklu Parent'e "Multiple Inheritance" derler,
           tekli Parent'e "Single Inheritance" derler.
           Java "Multi Inheritance"i desteklemez, Java "Single Inheritance" kullanir.

    4)     Apartman seklindeki inheritance yapisina "Multilevel Inheritance" denir.
           Java "Multilevel Inheritance"i destekler.

    > static 'ler inherit edilemiyor.
     */


    protected void eat(){
        System.out.println("Animals eat...");
    }
    public void drink(){
        System.out.println("Animals drink...");
    }





}
