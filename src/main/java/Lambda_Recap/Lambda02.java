package Lambda_Recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) {

       List<String> meyve = new ArrayList<>(Arrays.asList("elma","portakal","uzum","cilek","greyfurt","nar",
               "mandalina","armut","elma","keciboynuzu","elma"));

       ilkHarfEVeyaCYazdir(meyve);  //elma cilek elma elma
        System.out.println("\n  ******");
        basaVeSonaYildizEkle(meyve); //*elma* *portakal* *uzum* *cilek* *greyfurt* *nar* *mandalina* *armut* *elma* *keciboynuzu* *elma*
        System.out.println("\n  ******");
        System.out.println(kararkterSayGoreBuyKucSirKarSayEnBuyIlkUcElYazdir(meyve)); //[keciboynuzu, mandalina, portakal]


    }
    // SORU1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari yazdıralım
    public static void ilkHarfEVeyaCYazdir ( List<String> meyve ){
     meyve.stream().filter(t-> t.startsWith("e") || t.startsWith("c")).forEach(Utils :: yazdir);

    }
    // SORU2 : List elemanlarının hepsinin basina ve sonuna yildiz ekleyerek yazdiralim
    public static void basaVeSonaYildizEkle ( List<String> meyve ){

        meyve.stream().map(t->"*"+t+"*").forEach(Utils ::yazdir);
        //elemanlar degisiklige ugrayacagi icin map kullandik
    }
    // SORU3 : List elemanlarını karakter sayısına gore buyukten kucuge sıralayınız,
    // karakter sayısı en buyuk ilk 3 elemanı List halinde return ederek yazdırınız
    public static List<String> kararkterSayGoreBuyKucSirKarSayEnBuyIlkUcElYazdir (List<String> meyve ){

      /*  List<String> sonuc =meyve.
                stream().
                sorted(Comparator.comparing(t->t.toString().length()).reversed()).
                limit(3).
                collect(Collectors.toList());
        return sonuc;*/
        List<String> sonuc =meyve.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                limit(3).
                collect(Collectors.toList());
        return sonuc;

        //to.String yaparak lenght'in kizarmasini engelledik.Her gelen elemanin String olma garantisini verdik
        //limit(3) ile ilk 3 karakteri aldim.
    }



}
