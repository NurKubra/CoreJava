package javaders.day22StringBuilder;

public class Sb02 {
    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder("Java is easy");

        sb1.reverse();  //String'in ters cevrilmesi loop'lar ile de yapilir, bu kisa yoldur.
        System.out.println(sb1);  //ysae si avaJ
        //Loop larda bunun icin kod yazmak gerek

        sb1.deleteCharAt(6); //Verilen index'teki characteri siler.
        System.out.println(sb1);   //ysae s avaJ
        //orjinal data degistigi icindegisen halinde calisir.(sb1 de)

        sb1.delete(4,7); //Baslangic indeinden(dahil) bitis indexine(haric) olan character'leri siler
        System.out.println(sb1);  //ysaeavaJ

        sb1.replace(2,5,"x");  //2 dahil 5 haric index 2,3,4 deki karakterler  yerine x yazar.
        System.out.println(sb1); //ysxvaJ
        //3 karakter yerine bir karakter yazilabilir.

        sb1.insert(3,"2023"); //ilk 3 karakteri bosver sonra 2023 yazdir
        System.out.println(sb1);  //ysx2023vaJ

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Java");
        StringBuilder sb4 = new StringBuilder("Kava");

        int r1= sb2.compareTo(sb3);  //alfabetik olarak karsilatirir ve alafbetik olark ayniysa "0" döner
        System.out.println(r1);

        int r2= sb2.compareTo(sb4);  //alfabetik olarak karsilatirir ve alafbetik olark ayniysa "0" döner
        System.out.println(r2);      //-1 verir

        //Sonuc 0 ise alfabetik olarak ayni siradalar demektir.
        //Sonuc mesela -3 ise sb2,sb3 den alfabetik alark 3 önde demektir
        //Sonuc meslea 3 ise sb2,sb3 den alfabetik olarak 3 sonra demektir

        //StringBuilder nasil String'e cevrilir?
        String str = sb2.toString().toUpperCase();  //StringBuilder'i String e cevrimek icin kullanilir.
                                                   //mesela split(),toUpperCase(), toLowerCase kullanmak icin
        System.out.println(str);

        //Strign nasil StringBuilder'a cevrilri?
        StringBuilder newSb1 = new StringBuilder(str); //yeniden StringBuilder'a cevirdik
        System.out.println(newSb1);

}

}
