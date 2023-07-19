package javaders.day18constructorsstatickeyword;

public class MethodOverloading {

    /*
    1)Bir method "ayni isim" ve "farkli parametre"lerler olusturuluyorsa buna "Method Overloading" denir.
    2)"Method Ovarloading " java da "iyi organizsayon" icin kullanilir.
         add--> önce toplama methodu old. anlariz ve istedigimiz toplmayi seceriz
    3) Method Overloading yaparken parametre 3 sekilde degistirilebilir;
         i)   Parametreerin sayilari degistirilebilir --> 3 Parametre
         ii)  Parametrelerin data tipleri degistirilebilir. ---> int -->double
         iii) Parametrelerin data tipleri farkli ise yerleri degistirilebilir.
    4) "Method Overloading" bir class'in icinde olusur bu yüzden ""private" methodlar da overload edilebilir.
    (Interview sorusu ? Private'lar da overload edilebilir. Zaten tek bir class icinde calisiyorum.
    private olmasi durumu farkli class'da calismasini engeller.)
    ==> Bütün Access Modifier'larda kullanilir.
    5) "static" Methodlar "overload" edilebilirler.
     */

    public static void main(String[] args) {
        add(3,5); //add methodunu cagirdim. Fakat asagida 3 farkli methodu kullanabilir
                        // ama her zaman en az is yapabilcegini secer
                        //int variable'ini double icinde yazabiliriz Autowidening ile ama daha fazla is yapcagindan tercih etmez
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public static double add(double a, int b){
        return a+b;
    }
    public static double add(int a, double b){
        return a+b;
    }

    //methodlara baktigimizda parantez icinde overload edildikleri görülür


    /*
    Overloading : Asiri Yuklenme  Ayni isimde Ayni classta birden fazla method oldugunda icerisindeki Data Type'ina
    Data Sayisina yada yerlerine gore en uygun olani secer.
    Java hangisini kullanacagina karar verirken optimizasyon yapar
    en uygun olani secer az yorul cok is yap secenegine gider.
     */
}
