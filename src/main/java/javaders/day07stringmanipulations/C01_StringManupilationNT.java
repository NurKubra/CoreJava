package javaders.day07stringmanipulations;

public class C01_StringManupilationNT {

    public static void main(String[] args) {

        //*********** replaceAll) *******\\
        /*
        Bir grup datayi degistirmek icin kullanilir.
        Bir Grup data = Regular Expression(Regex) kullanilir.

        En cok kullanilan Regexler :
        1) Tum Rakamlar ==> [0-9]  //alternatif tüm büyük harfler dijitd ya da tum buyuk harfler D olarak da kull.?
        2) Tum Kucuk Harfler ==> [a-z]
        3) Tum Buyuk Harfler ==> [A-Z]
        4) Tum Harfler ==> [a-zA-Z]
        5) Tum Harfler ve Rakamlar ==> [a-zA-Z0-9]
        6) Tum Sesli Harfler ==> [aeiouAEIOU]
        7) Tum Noktalama Isaretleri ==> \\p{Punct}

          ^ ==> den farkli, haricinde
        1) Tum rakamlar Haric ==> [^0-9]
        2) Tum kucuk harfler Haric ==> [^a-z]
        3) Tum buyuk harfler Haric==> [^A-Z]
        4) Tum harfler Haric==> [^a-zA-Z]
        5) Tum harfler ve rakamlar Haric==> [^a-zA-Z0-9]
        6) Tum noktalama isaretleri Haric==> [^\p{Punct}]  // ya da  ^\P{P}  ? ***Ornek uzerinde bakicaz (Noktalma isaretleri icin ^ yok)
        7) Tum sesli harfler Haric==> [^aeiouAEIOU]
         */


        String s = "Mehmet Fatih bey 20 yasinda QA_Developer kursunda $ dolarla maas kazanmistir...";

        //Example : s String'ndeki tum rakamlari "*" ceviriniz
        String sreplaceAll = s.replaceAll("[0-9]","*");
        System.out.println("sreplaceAll = " + sreplaceAll);
        //Mehmet Fatih bey ** yasinda QA_Developer kursunda $ dolarla maas kazanmistir...

        //Example : s String'indeki tüm harfleri ve tum rakamlari "@" isaretine cevriniz.
        String sreplaceAll2 = s.replaceAll("[a-zA-Z0-9]","@");
        System.out.println("sreplaceAll2 = " + sreplaceAll2);
        //@@@@@@ @@@@@ @@@ @@ @@@@@@@ @@_@@@@@@@@@ @@@@@@@@ $ @@@@@@@ @@@@ @@@@@@@@@@@...

        //Example : s String'indeki tum spaceler disindaki karakterleri "+" ceviriiniz
        String sreplaceAll3 = s.replaceAll("[^ ]","+");
        System.out.println("sreplaceAll3 = " + sreplaceAll3);
        //++++++ +++++ +++ ++ +++++++ ++++++++++++ ++++++++ + +++++++ ++++ ++++++++++++++

        //Example : s Stringdeki tum kucuk harfler disindaki karakterleri "*" ceviriniz.
        String sreplaceAll4 = s.replaceAll("[^a-z]","*");
        System.out.println("sreplaceAll4 = " + sreplaceAll4);
        //*ehmet**atih*bey****yasinda*****eveloper*kursunda***dolarla*maas*kazanmistir***

       //Example : s Stringdeki tum sesli harfler disindaki karakterleri "&" ceviriniz.
       String sreplaceAll5 = s.replaceAll("[^aeiouAEIOU]","&");
        System.out.println("sreplaceAll5 = " + sreplaceAll5);
        //&e&&e&&&a&i&&&e&&&&&&a&i&&a&&A&&e&e&o&e&&&u&&u&&a&&&&o&a&&a&&aa&&&a&a&&i&&i&&&&




    }
}
