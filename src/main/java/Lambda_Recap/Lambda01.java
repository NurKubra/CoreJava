package Lambda_Recap;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        //Lambda ile tekrarlar
        //Lambda'yi Map haric butun Collection uyerinde kullanailiriz.
        //Map'lerdeki key-value ilsikisinden dolayi
        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5, -8, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));

        //methodun argumenti olarak sayi aliyoruz.
        ciftVePozitifLamExYazdir(sayi);  //12 6 8
        System.out.println("\n*****");
        ciftVePozitifLamMetRefYazdir(sayi); //12 8 6
        System.out.println("\n*****");
        kareYazdir(sayi);  //25 64 144 0 1 144 25 25 36 81 225 64
        System.out.println("\n*****");
        kareleriTekrarsiz(sayi); //25 64 144 0 1 36 81 225
        System.out.println("\n*****");
        buyKucSirala(sayi);      //15 12 9 8 6 5 5 1 0 -5 -8 -12
        System.out.println("\n*****");
        pozKupBirlerBas5(sayi);   //125 125 3375
        System.out.println("\n*****");
        toplamMetRef(sayi);      //Optional[36]
        System.out.println("\n*****");
        toplamLambdaEx(sayi);  //36
        //System.out.println("\n*****");
        System.out.print(ciftElKareKucBuyListReturn(sayi));  //[0, 36, 64, 64, 144, 144]
        System.out.println("\n*****");


    }

    //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftVePozitifLamExYazdir(List<Integer> sayi) {
        sayi.stream().filter(t -> t % 2 == 0 && t > 0).forEach(t -> System.out.print(t + " "));

        //t akistan gelen elemanlari temsil eder
    }

    //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftVePozitifLamMetRefYazdir(List<Integer> sayi) {

        sayi.stream().filter(t -> t % 2 == 0 && t > 0).forEach(Utils::yazdir);

        //Utils class'i olusturup yazdirma islemini yapcak bir method olusturuyorum
    }

    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın
    public static void kareYazdir(List<Integer> sayi) {

        //sayi.stream().map(t->t*t).forEach(Utils::yazdir);
        sayi.stream().map(Utils::kareBul).forEach(Utils::yazdir);

        //akistan gelen elemanlari aksiyon sonrasi degisime ugratcagimiz icin map kullaniyoruz!!
    }

    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void kareleriTekrarsiz(List<Integer> sayi) {

        sayi.stream().map(Utils::kareBul).distinct().forEach(Utils::yazdir);
        //distinct'sonra kullandik cunku karelerinden ayni olanlari elememiz lazim
        //ayni methodu tekrar tekrar kullancaksak Met-Ref tercih edilir.

    }
    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın

    public static void buyKucSirala(List<Integer> sayi) {

        sayi.stream().sorted(Comparator.reverseOrder()).forEach(Utils::yazdir);
        //sorted() default olarak kucuktan buyuge dogru siralar ama bize tam tersi gerektigi icin parantez icinde belirttik

    }
    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız

    public static void pozKupBirlerBas5(List<Integer> sayi) {
        sayi.stream().filter(t -> t > 0).map(t -> t * t * t).filter(t -> t % 10 == 5).forEach(Utils::yazdir);
        //once filtrelerdik ve sonra akistan gelen elemanlari degistirdik
        //arrow function  t-> t ile yapilan islem

    }

    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın
    public static void toplamMetRef(List<Integer> sayi) {

        Optional<Integer> sonuc = sayi.stream().reduce(Integer::sum);
        System.out.println(sonuc);
        //reduce() akistan gelen elemanlarin aksiyon sanrasinda tek bir eleman olarak cikmasini saglar
        //met-ref i ya Utils de olusturdugumuz kendi methodlar ile ya da lamdanin bize sagladigi hazir methodlardan kullanabiliriz.
        //20-30 tane hazir method var
        //alternatif :reduce(Math::addExact)
        //reduce () terminal bir method o yüzden sonrasinda method yazilmaz
        //bu yüzden int konteynirina esayn ettik.Ama kabul etmedi Optinal olarak esayn etmemizi istedi.
        //Optional isteem sebebi; int konteynirinin bos olma durumunda int null vermez ve Exception verir icin bu durum tehlikeisnden dolayi Optional yapar.
        //Yani; Ya List'in iicnde hic bir eleman yoksa null olur ve biz bu null degeri int'a esayn etmek istersek hata verir bu yüzden Java tedirgin oluyor.


    }

    // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın
    public static void toplamLambdaEx(List<Integer> sayi) {
        int sonuc = sayi.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sonuc);
        //toplama islemi yapcagim toplama islminin etkisiz elemanini identiy olarak veriyorum.
        //ilk deger olarak identy degeri yaziyoruz. Ve toplama islemi yaptigimizdan icin iki degisken giriyoruz.
        //a ilk degeri her zaman identy'den alir ve b ise degrini her zaman akistan alir.Böylece iki degeri toplar
        //ve a'ya yeni deger olarak atar. b bu sefer bir sonraki elemani alir ve yeniden a ile toplayip a#ya yeni deger atariz.
        //Ve sonucu int bir konteynira asigne ederiz. Ama bu sefer Java kizarmaz --> cunku ilk deger olarak zaten 0 atadik
        // bu sayede hic bir eleman dönmese bile 0 doner.

    }

    //SORU9 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız
    public static List<Integer> ciftElKareKucBuyListReturn(List<Integer> sayi) {
        List<Integer> sonuc = sayi.  //List halinde elde etmek icin
                stream().
                filter(t -> t % 2 == 0).
                map(Utils::kareBul).
                sorted().collect(Collectors.toList());
        return sonuc;
        //return ediyorsak sonucu main de yazdirabiliriz

    }

}
