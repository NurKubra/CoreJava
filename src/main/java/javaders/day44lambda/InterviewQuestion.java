package javaders.day44lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InterviewQuestion {
    public static void main(String[] args) {

        //Example 1: Size verilen bir array'in  "mountain Array "olup oladigini gosteren kodu yaziniz.
        //      [0,2,5,3,1,-1]

        int[] arr = {0, 2, 5, 3, 1, -1};
        //önce array'i list 'e ceviyrouz. cunku listi kullnmak daha kolay.
        List<Integer> myList = new ArrayList<>();

        //Array'i stream'e ceviriyoruz, farkli olarak Array'in ismini icine yaziyoruz.
        //forEach() her elemani alip List'e ekler.
        Arrays.stream(arr).forEach(t -> myList.add(t));
        System.out.println(myList);  //[0, 2, 5, 3, 1, -1]

        //List'deki max elemani buluruz
        int max = myList.stream().reduce(Math::max).get();
        System.out.println(max);

        //List deki max elemanin indexini buluruz
        int idxOfMax = myList.indexOf(max);
        System.out.println(idxOfMax);

        //Max elemana kadarkileri yeni bir Liste koyup bir kopya olustrucam sonra kopyayi sort yapip kucukten buyuge dizcem
        //ve bunu orjinalle karsilastircam.
        List<Integer> firstList = new ArrayList<>();
        myList.
                stream().
                filter(t -> myList.indexOf(t) <= idxOfMax). //elemani alip indexini buluyor indexi max elemana esit ya da kuckse onlari al Liste ekle.
                forEach(t -> firstList.add(t));             //myList deki elemanlari firsList'in icine ekleyerek yazdiriyoruz
        System.out.println(firstList);

        //firstList'in copy'sini olusturur.
        List<Integer> firstListCopy = new ArrayList<>();
        firstList.stream().forEach(t -> firstListCopy.add(t));
        System.out.println(firstListCopy);

        //Cpoy olan List'i sort et.
        Collections.sort(firstListCopy);


        //firstList ile firstListCopy'nin ayni olup olmadgini kontrol et
        boolean rule1 = firstList.equals(firstListCopy);
        System.out.println(rule1);

        //Maximun elemandan sonraki tum elemanlari bir list icine koy
        List<Integer> secondList = new ArrayList<>();
        myList.stream().filter(t -> myList.indexOf(t) >= idxOfMax).forEach(t -> secondList.add(t));
        System.out.println(secondList);

        //secondList'in copy'sini olustur.
        List<Integer> secondListCopy = new ArrayList<>();
        secondList.stream().forEach(t -> secondListCopy.add(t));
        System.out.println(secondListCopy);

        //secondListCopy'i ters olarak sirala
        Collections.sort(secondListCopy);  //once duz
        Collections.reverse(secondList);   //sonra ters yani buuykten kucuge siraladik
        System.out.println(secondListCopy);

        //secondList ile secondListCopy ayni mi diye kontrol et.
        boolean rule2 = secondList.equals(secondListCopy);
        System.out.println(rule2);

        System.out.println("Is the array mountain array ? "+ (rule1 == rule2));
    }
}
