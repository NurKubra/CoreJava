package javaders.day07stringmanipulations;

public class C01_StringManipulations {

    public static void main(String[] args) {

        /*
        endsWith()
        Metnin belirli bir datayla bitip bitmedigini verir
        Bize True ya da False yani boolean bir sonuc dondurur.
        Tek karakterde, cok karakter de kullanilabilir.
        Buyuk kucuk harf duyarlidir.

        contains()
        Cümlenin herhangi bir yerinde istenilen datayi bulursa true döndürür.
        Ancak task'in bizden istedigi "money" kelimesiyle bitip bitmedigi oldugu icin endsWith() kullaniriz.


        replace()
        Metnin icerisindeki belirli bir datanin yerine verilen diger datayi yerlestirir.
        Bize String bir data döndürür.
        Tekli (Char) karakterler ile de coklu (String) karakter ile de calisir.
        Ancak her iki tarafta da cift tirnak "" ya da her iki tarafta da tek tirnak '' kullanilmalidir.
        Bir karaker yerine birden cok karakter koyulabilir.
        Char data type'inin icerisne mutlaka bir karakter yerlestrilmeli.
        Space bir karakterdir. Ancak hiclik javada char icin kullanilmaz.
        Bu nedenle silme islemi yaparken mutlaka String kullanilmali.

        replaceAll()
        Bir Grup datayi degistirmek icin kullanilir.
        Bir grup datayi ifade edebilmek icin Regular Expression(Regex) kullanilir.

         */


        //*********** endsWith() *******\\


        String s = "Learn Java earn money";

        //Example : s String'nin "money" ile bitip bitmedigini kontrol ediniz
        boolean isEnd = s.endsWith("money");
        System.out.println("isEnd = " + isEnd); //true

        //*********** replace() *******\\

        //Example : s String`deki "money" kelimesini "dolar" kelimesi ile yer degistiriniz.

        String sReplace = s.replace("money","dolar");
        System.out.println("sReplace = " + sReplace); //Learn Java earn dolar

        //Example : s Stringdeki "earn" kelimesini "win" kelimesine ceviriniz

        String sReplace2 = s.replace("earn","win");
        System.out.println(sReplace2);  //Lwin Java win money
        //Learn' nun icindeki earn' de dagistirir.

        //Example :s String'indeki "a" harflerini "*" ile degistirniz

        String sReplace3 = s.replace("a","*");
        System.out.println(sReplace3); //Le*rn J*v* e*rn money

        //tek karakter degistirmek icin   " " değil ==> ikisi icin de ' ' kullanıyoruz
        String sReplace4 = s.replace('a','*');
        System.out.println(sReplace4); //Le*rn J*v* e*rn money

        //Daha az yer kapladigi icin char kullanmak tavsiye edilir

        //Example : s String'deki "n" harflerini "***" ile degistiriniz
        String sReplace5 = s.replace("n","***");
        System.out.println(sReplace5);   //Lear*** Java ear*** mo***ey

        //Tek bir karakter yerine birdem cok karakter koyulabilir.

        //Example : s Strind'deki tum e harflerini siliniz.
        String sReplace6 = s.replace("e","");
        System.out.println(sReplace6);
        // String sReplace6 = s.replace("e"," " ); Bosluk koyulursa silinmis olmuyor. Baska bir karakter olmus olur.
        //s.replace('e',' ' ); char ile yapinca icine hiclik ekleyemiyoruz.

        //Example : s String'ndeki tum earn kelimelrini siliniz
        String sReplace7 = s.replace("earn","");
        System.out.println("sReplace7 = " + sReplace7); //


        String a = "Dolma Kalem";
        //Example : a String'in deki "Kalem" kelimesi yerine "Biber" yerlestiriniz.
        String aReplace8 = a.replace("Kalem", "Biber");
        System.out.println("aReplace8 = " + aReplace8);

        //*********** replaceAll() *******\\

        //Bir grup datayi degistirmek icin kullanilir.
        String t = "Yucel 25 yasindadir sandik ama 30'mus!";

        //Example : t String'ndeki tum rakamlari "*" a ceviriniz.

        String tReplaceAll = t.replaceAll("[0-9]","*");
        System.out.println(tReplaceAll); //Yücel ** yasindadir sandik ama **'mus!
        //tüm rakamlar demek icin [0-9] kullandik.

        /*
        En cok kullanilan Regexler
        1) Tum rakamlar ==> [0-9]
        2) Tum kucuk harfler ==> [a-z]
        3) Tum buyuk harfler ==> [A-Z]
        4) Tum harfler ==> [a-zA-Z]
        5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
        6) Tum noktalama isaretleri ==> \\p{Punct}
        7) Tum sesli harfler ==> [aeiouAEIOU]

         ^ ==> den farkli, haricinde
        1) Tum rakamlar Haric ==> [^0-9]
        2) Tum kucuk harfler Haric ==> [^a-z]
        3) Tum buyuk harfler Haric==> [^A-Z]
        4) Tum harfler Haric==> [^a-zA-Z]
        5) Tum harfler ve rakamlar Haric==> [^a-zA-Z0-9]
        6) Tum noktalama isaretleri Haric==> [^\p{Punct}]   // ya da  ^\P{P} ?
        7) Tum sesli harfler Haric==> [^aeiouAEIOU]

         */

        //Example :t String'indeki tum harfleri ve tum rakamlari ! cevirniz

        String tReplaceAll2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(tReplaceAll2); //!!!!! !! !!!!!!!!!! !!!!!! !!! !!'!!!!

        //^ HARIC demek!!
        //Example : t String'ndeki tum space'ler disindaki karakterleri +'ya donusturunuz

        String tReplaceAll3 = tReplaceAll.replaceAll("[^ ]", "+");
        System.out.println(tReplaceAll3); //+++++ ++ ++++++++++ ++++++ +++ +++++++


        //Example : t String'indeki tum kucuk harfler disindaki karakterleri "?" ne donusturunuz

        String tReplaceAll4 = t.replaceAll("[^a-z]","?");
        System.out.println(tReplaceAll4); // ?ucel????yasindadir?sandik?ama????mus?

        //Example : t String'indeki tum sesli harfler disindaki karakterleri "&"ine donusturunuz.

        String tReplaceAll5 = t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println(tReplaceAll5); // &u&e&&&&&&a&i&&a&i&&&a&&i&&a&a&&&&&u&&
        //SPACE 'leri ve sembolleri de cevirir.!!











    }
}
