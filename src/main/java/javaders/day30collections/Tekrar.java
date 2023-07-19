package javaders.day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Tekrar {


    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Ajda");
        hs.add("Cuneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Cuneyt");
        hs.add(null);
        hs.add(null);

        //null'i her zaman listenin en basina ekler.
        System.out.println(hs);
        hs.hashCode(); //Her data icin benzersiz bir id verir bunu yazdirmak icin kullanilirz.
        System.out.println(hs.hashCode());


        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);
        System.out.println(lhs);   //[234, 87, -32, 124] verdiigmiz siraya göre yazdirir
        lhs.add(null);  //null'i hangi siraya koyarsan oraya yazdirir.
        System.out.println(lhs);   //[234, 87, -32, 124, null]

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);

        lhs.retainAll(ls); //lhs'de ortak elemanlari muhafaza et!! Farkli elemanlari sil, ls oldugu gibi kalir
        System.out.println(lhs);  //[87, 124]
        System.out.println(ls);   //[451, 87, 231, 124]


        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        //ts.add(null);  //null'i eklemez !

        System.out.println(ts);  //alfabetik siraya göre dizer  [A, G, R, U, Z]
        //ilk eleman ve son eleman ile ilgili methodlar;

        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.lower('R'));  //G
        System.out.println(ts.lower('D'));  //A
        System.out.println(ts.lower('A'));  //null

        System.out.println(ts.higher('K'));  //R

        System.out.println(ts.headSet('R')); //[A,G] R den öncekiler. R dahil degil
        System.out.println(ts.headSet('R',true)); //[A,G,R] R bu sekilde dahil olur





    }
}

