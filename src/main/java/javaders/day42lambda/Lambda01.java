package javaders.day42lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda01 {

    //Lambdanin List disindaki kullanimlarini bu derste görecegiz(set, map vs)

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");

        System.out.println(sortWithLastCharDistinctUpperInList(names));
        System.out.println(sortWithLenghtReversedSameLenghtInNaturalOrderLowerInList(names));
        //[alexander, michael, alex, alex, mary, jim, tom]
        System.out.println(isLenhgtMoreThanTwo(names));  //true
        System.out.println(noLenghtLessThanThree(names)); //true
        System.out.println(atLeastOneLenghtLessThanFour(names));  //true


        //Example 1: List elemanlarini son harflerine gore natural order'da tekrarsiz olarak buyuk harfle
        // bir List'in icinde return ediniz.

        // [Tom, Alex,Jim, Michael, Mary, Alexander, Alex] ==>[ MICHAEL, JIM, TOM, ALEXANDER, ALEX, MARY]
        //Ekrana yazdri demiyor sonucu List'in icinde istiyor.
    }
    public static List<String> sortWithLastCharDistinctUpperInList(List<String> names){

       return names.
                stream().
                distinct().
                map(String :: toUpperCase).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                collect(Collectors.toList()); //Normalde distinct elemanlari depolamak icin "Set" kullanilir.
                                             //ama lambda'daki collect(Collectors.toSet()); method'u elemanlari
                                             //rastgele siralar; halbuki  bu soruda rastgele siralama kabul edilmiyor.
                                             //Bu yüzden mecburen collect(Collectors.toList()); kullandik


                //map(t->t.toUpperCase()) ==> map(String :: toUpperCase)

    }
     /*alinti not ;
     Eger collect methodunu Set ile kullanmak istersek, kodumuz kizarir. Bu durumda methodumuzun data type'ini
     List yerine Set olarak degistiririz. Bu durumda problem cozulmus olur. Ancak baska bir problem ile
     karsilasiriz. Yukarida kodumuz icine yazdigimiz sorted methodunu kabul etmez. Cunku toSet icinde HashSet
     kullanilir ve HashSet elemanlari sirali olarak degil rastgele siralar. Bu sekilde kodumuzu tamamlayamadik.
     Oyleyse kodumuzda toSet degil to List kullanmamiz gerektigini anladik.
     Normalde distinct elemanlari depolamak icin Set kullanilir. Ama Lambda'daki toSet methodu elemanlari rastgele
     siralar. Sorumuzda siralama istenmeseydi, distinct de olunca toSet kullanmak okunurluk acisindan daha dogru olurdu.
      */
  /*  public static Set<String> sortWithLastCharDistinctUpperInList1(List<String> names){

        return names.
                stream().
                distinct().
                map(String :: toUpperCase).sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                collect(Collectors.toSet());

        //Set kulanmak istedik tekrarsiz eleman elde etmek icin ve böylece distinct kullanilayacakti
        //ama toSet rastgele dizilim yaptigi icin */

    //Example 2: List elemanlarini character siralarina gore ters sirada kucuk harfle bir List'in icinde return ediniz.
    //           Ayni character sayisina sahip elemanlar kendi icinde alfabetik sirada olsun
    // [Tom, Alex,Jim, Michael, Mary, Alexander, Alex]==> [Alexander, Michael,Alex,Alex,Mary, Jim,Tom]

    public static List<String> sortWithLenghtReversedSameLenghtInNaturalOrderLowerInList(List<String> names){

        return names.
                stream().
                map(String :: toLowerCase).
                sorted(Comparator.comparing(String :: length).reversed().thenComparing(t->t.charAt(0))).
                collect(Collectors.toList());



         //uzunluklarina gore tersten siraliyor ama ayni lenght'e sahipleri de kendi arasinda siralayacagim icin thenComparing ile ilk
         //karakterlere gore kendi icinde siralama yapiyoruz.



                // sorted(Comparator.reverseOrder()) sadece tersine göre deseydi bunu secerdim
    }

    //Example 3: List elemanlarinin tamaminin character sayisinin 2'den buyuk olup olmaidigini kontrol eden methodu olusturunuz

    public static boolean isLenhgtMoreThanTwo (List<String> names){

        return names.
                stream().
                allMatch(t->t.length()>2); //icine yazdigin kural hepsi icin dogru ise true döner, bir icin bile dogru degilde false döner

    }
    //Example 4: List elemanlarinin hicbirinin character sayisinin 3 den kucuk olmadigini kontrol eden method'u olusturunuz.
    public static boolean noLenghtLessThanThree(List<String> names){
        return names.
                stream().
                noneMatch(t->t.length()<3);  //noneMatch allMatch'in tersi ==> hic biri 3 den kucuk olmamali

    }

    //Example 5: List elemanlarinin en az birinin character sayisinin 4 den kucuk olup olmadigini kontrol eden method'u olusturunuz.
    public static boolean atLeastOneLenghtLessThanFour(List<String> names){

        return names.
                stream().
                anyMatch(t->t.length()<4);

        //kurala uyan bir tane bulunca digerlerini kontrol etmez.

    }
    /*
    /* Match
     allMatch() ==> tum elemanlar sarti saglarsa true dondurur
     anyMatch() ==>bir yada birden daha fazla eleman sarti saglarsa true dondurur
     noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur
     */

}
