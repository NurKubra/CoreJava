package javaders.day42lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Tekrar {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");

    }
    //Example 1: List elemanlarini son harflerine gore natural order'da tekrarsiz olarak buyuk harfle
    // bir List'in icinde return ediniz.

    public static List<String> sonHarfeGoreTekrarsizBuyukHarfleSirala( List<String> names ){

      return   names.
               stream().
               distinct().sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
               map(String :: toUpperCase).
               collect(Collectors.toList());


    }
}
