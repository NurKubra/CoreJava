package javaders.day31collectionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    /*

            Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
            "key" kismi tekrarsiz, "value" tekrarli olabilir.
            Map'ler "key" ve "value" structure'ini kullanir.
            Map'lerdeki elemanlara "Entry" denir.
            Elemanlarin tamanina ise "EntrySet" denilir.
            "Entry"ler tekrarsiz oldugu icin "EntrySet"denilir.
            "Key" ve "Value" lar ayri ayri data type'larinda olabilirler.
            HaspMap'ler "entry"leri rastgele siralar, bu yüzden en hizli map'tir.
            "Map"ler Collection degildir. Farkli bir yapidir.(köseli parantez kullanir)
     */

    /*
    Hash : unique id olustururken.
    Map : diyince aklimiza sözlük gelsin sol tarfta kelime sag tarafta manasi olur.
    Bu durumda sol taraf tekrarsizdir, bu durumda sag taraf tekrarli olabilir.
    Map'lerde de ayni mantik vardir. Key kismi = tekrarsiz, Value kismi= tekrarsiz kismi ifade eder.
    Map'ler "Key-Value" yapsini kullanir.Iki yapidaki datanin da Data Type'i farkli olabilir .Bunu HashMap olusturuken
    buyuk-kucuk isareti icinde belirtiyoruz.
    Bu yapinin ismine "Entry" denir.
    Bu elemanlarin tamamina "EntrySet" denir. Entry'lerin ilk kismi (key) tekrarsiz oldugundan Entry'ler de tekrarsizdir.
    Ve Java da benzersiz seylere Set denir, bu yüzden sonuna Set eklenmis.
     */
    public static void main(String[] args) {

        HashMap<String, Integer> countryPopulation = new HashMap<>();

        //Map'e "entry" nasil eklenir?
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 40000000);
        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 18000000);
        System.out.println(countryPopulation);  //{Turkiye=83000000, Netherland=18000000, USA=40000000, Germany=83000000, Albania=3000000} rastgele dizdi

        //get() methodu "key" ile calisir ve "value" kismini verir.
        int usaPopulation = countryPopulation.get("USA");
        System.out.println(usaPopulation); //40000000

        //Butun "key"leri nasil alabilirz ?
        Set<String> keys = countryPopulation.keySet();   //butun key'leri verir ve tekrarsiz oldugundan Set'in icinde verir.
        System.out.println(keys);  //[Turkiye, Netherland, USA, Germany, Albania]  ==> dikkat burda bize set döndü , map degil !!(tekrarsiz olduklaindan "set" secti)
        //burda keySet() methodunun return type olusturcagimiz data type'i ayni olmali. Onu da method üstünde "strg" uzun basarak bulabiliriz

        //Butun "value"leri nasil alabilrim?
        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);  //[83000000, 18000000, 40000000, 83000000, 3000000]

        //Example 1 : countryPopulation map'indeki ulkelerin nufuslari ortalamasi nedir?
        Collection<Integer> value = countryPopulation.values();
        int sum =0;

        for (Integer w: value) {
            sum = sum +w;
        }

        System.out.println(sum /value.size());  //


        //entrySet() "entry"leri kalip halinde alip bize "Set"in icine koyarak verir
        //Loop'lar "map"lerde calismaz ;Map'lerde elemanlar arasinda gezmek istersek o zaman entrySet() ile "Set"'lere cevirip yapabiliriz.

        Set<Map.Entry<String,Integer>> entries = countryPopulation.entrySet();  //Entry'leri Set'in icine koyar, cunku entry'ler de tekrarsizdir.
        //Map'deki Entry'ler bu Set'in elemanidir ve o Entry'lerin key'i String, value'si Integer'dir.

        System.out.println(entries); //[Turkiye=83000000, Netherland=18000000, USA=40000000, Germany=83000000, Albania=3000000]


        //Example 2: countryPopulation map'indeki ulkelerin isimlerinin character sayisi ile nufuslarininin toplamini bulunuz
        int toplam = 0;

        for(Map.Entry<String,Integer> w:entries){
            toplam = toplam +w.getKey().length()+ w.getValue();
        }

        System.out.println(toplam);


    }
}
