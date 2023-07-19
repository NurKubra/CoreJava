package javaders.day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set01 {

    //ArrayList : index kullanilir (eleman arama islemi icin)
    //LinkedList: adres(index) kullanmazlar (elaman ekleme cikarma icin)

    //Set'ler :
    //Tekrarsiz olan elemanlari depolamak icin kullanilir.
    //HashSet: setlerin en hizlisi, hiz ihtiyaciniz oldugunda kullanilir.
    //LinkedHashSet :elemanlri sizin girdiginiz siraya göre dizer
    //TreeSet : elemanlari natural order'e göre dizer.(alfabetik siraya göre dizer)
    //Siraalama yaparak dizenler yavas calisir.

    /*
    1) Set'ler tekrarsiz eleman(unique) depolamak icin kullanilir.
    2) 3 tane Set Class vardir:
       i)  HashSet Class: Hash bir tekniktir.
       "Hash" benzersiz id olusturuma teknigi; Bu teknige "Hashting Technique" denir.
       "HashSet" elemanlari rastgele siralar.
       "HashSet" elemanlari siralamadigindan cok hizli calisir.
       "HashSet"'ler null'i eleman olarka kabul eder.
       "HashSet" tekrarsiz eleman depolamak icindir.

       ii) LinkedHashSet Class:
          "LinkHastSet"ler elemanlari sizin veridginiz siraya göre dizdiklerinden(insertion order)
          "HashSet"lere göre yavas calisirlar
          "LinkHastSet"ler tekrarsiz eleman depolamak icidir.

       iii)TreeSet Class:
            "TreeSet"ler elemanlari natural order'e göre dizerler.
            "TreeSet"ler elemanlari natural order'e gore dizdiklerinden cooooook yavastirlar.
            En yavas Set'tir.

      3) TreeSet cok yavas oldugundan mumkun oldugu kadar TreeSet kullanmamaya calsiirz.

     */
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Ajda");
        hs.add("Cuneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Cuneyt"); //tekrarli eleman girildiginde hata vermez ama tekrarli elemani sadece bir kere ekler
        hs.add(null);  //null'i her zaman en basa ekler.
        hs.add(null); // null'i yeniden eklersek hata vermez ama eklemez

        System.out.println(hs); //[null, Zeki, Ajda, Cuneyt, Esra, Ezel]  kendi kafasina göre siralar.

        hs.hashCode();  //data her data icin bensersz bir id verir bunu yazdirmak icin kullaniirz.
        System.out.println(hs.hashCode());  //2038751948


        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);

        System.out.println(lhs); //veridgimiz siraya göre yazdirir. [234, 87, -32, 124]

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);
        ls.add(null);  //null' nereye koyarsan oraya koyar
        ls.add(null);   //ikinisicini yazdirmaz
        System.out.println(ls); //[451, 87, 231, 124]

        lhs.retainAll(ls);          //ortak olanalari muhfaza et !!
        System.out.println(lhs);     // [87, 124] ==> Ilk linkedHashSet deki farkli elemanlar sinindi.//Sadece ortak elemanlari aldi
        System.out.println(ls);      //[451, 87, 231, 124, null]  ==> ikincisine dokunmadi

        TreeSet<Character> ts = new TreeSet<>();

        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add('R'); //tekrali oldugundan yazdrmaz
        ts.add(null);  //TreeSet'lere "null " eklenmez !! alfabetik siraladigi icin nereye koyacagini bilemez.

        System.out.println(ts);  //[A, G, R, U, Z]
        //Siralama oldguundan ilk eleman son elemani kullanmak icin methodlar var

        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.lower('R'));  //G==> Verilen eleman olan R'den bir önceki eleman olan G'yi verir.
        System.out.println(ts.lower('D'));  //A==>  verir listede olmasada bir öncekini verir.
        System.out.println(ts.lower('A'));   //null verir.

        System.out.println(ts.higher('K')); //R ==> Verilen K den sonraki elemani verir.

        System.out.println(ts.headSet('R'));  //[A,G]==>R den öncekileri set olarak verir. Parantez icindeki dahil degil!!
        System.out.println(ts.headSet('R',true)); //[A,G,R]  Bu sekildeki parantez icindekini de dahil eder.

        System.out.println(ts.tailSet('G')); //[G,R,U,Z] ==> Parentez icindeki G dahildir.
        System.out.println(ts.tailSet('G',false)); // [R,U,Z] ==> Parantez icindkei bu sekilde dahil olmaz !!

        System.out.println(ts.ceiling('R'));  //ceiling ; cati ==> R ==>  Eleman set'in icinde varsa elemanin kendini return eder.
        System.out.println(ts.ceiling('K'));  // R==>  Eleman set'in icinde yoksa sonraki eleman return eder.
                                                         //higher() methodundan farki kendisini de veriyor olmasi
        System.out.println(ts.floor('G')); //G ==> Eleman set'in icinde varsa elemanin kendisini return eder.
        System.out.println(ts.floor('J')); //G ==> Eleman set'in icinde yoksa önceki elemani return eder.

        System.out.println(ts.subSet('G','Z'));  //[G,R,U] ==> Ilk parametre dahil ikinic parametre haric
        System.out.println(ts.subSet('G','U'));  //U'dan sonraki herhnagi bir eleman da yazilabilir.
        System.out.println(ts.subSet('G',false,'Z',true));  // [R,U,Z]
        //ilkini haric ikincisini dahil yaptik



    }
}
