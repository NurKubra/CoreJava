package javaders.day19arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
        //Object ile kullanilan methodlar non-static
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");
        System.out.println(cities);

        /*
        Bir method ne iş yapar?
        Bir method nasıl kullanılır?
        Bir method size neyi verir?
         */

        //ArrayList'te bir elemanin "ilk gorunumu" nasil silinir?
        cities.remove("Miami");
        System.out.println(cities.remove("Miami"));  //true döner ==> silip silmedigini kontrol eder!!!
        System.out.println(cities);  //[Giresun, Yozgat, Barcelona, Miami, Giresun]

        //ArrayListe'te  bir eleman indexi kullanilarak nasil silinir?
        cities.remove(2);
        System.out.println(cities.remove(2)); //Barcelona döner ==> yani sildigi elemani gösterir.
        System.out.println(cities); //[Giresun, Yozgat, Miami, Giresun]

        //ArrayList olustururken en basa ArrayList yerine List de yazabilirisniz.Sebebini Collections konusunda görecegiz
        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //Example 1: 12 elemanini ages List'inden siliniz
         //ages.remove(12); yazarsak;
        // primitiv int olur, primitiv int remove() method icinde kullanilinca Java onu index sanar.
        // Java'ya 12 nin index olmadigini soylemek icin primitive int yerine wrapper class integer kullanmaliyiz.

        ages.remove((Integer)12); //bu sekilde yazilmali !!!
        System.out.println(ages); //[23, 7, 4]

        //Bir ArrayList'deki bir elemanin tum görünümlerini nasil sileriz
        List<String> citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Giresun");
        citiesToRemove.add("Yozgat");

        cities.removeAll(citiesToRemove);
        System.out.println(cities.removeAll(citiesToRemove)); //true
        System.out.println(cities); //[Miami]     ??????

        //Iki ArrayList'in birbirine esit olup olmadigini nasil anlariz?
        //Kisa yoldan bir List olusturmak icin asagidaki List.of() methodu kullanilabilir.
        List<Character> initials =List.of('a','k','c','d','k');  //ArrayList'i kisa yoldan olusturma!!!
        System.out.println(initials); //[a,k,c,d,k]

        List<Character> letters =List.of('a','k','c','d','k');
        System.out.println(letters); //[a,k,c,d,k]

        //Iki ArrayList'in birbirine esit olup olmaidig nasil anlariz?
        //equals() methodu ayni elemanlar ayni indexte oldugu sürece true verir.
        boolean r1 = initials.equals(letters);
        System.out.println(r1); //true
        //hem elemanlar ayni mi diye hem de ayni indexler mi diye bakar

        //indexof('k') yazarsanniz 'k'nin ilk gorunumunun indexini verir.
        int r2= initials.indexOf('k');
        System.out.println(r2); // 1
        //lastindexof('k') yazarsanniz 'k'nin son gorunumunun indexini verir.
        int r3= initials.lastIndexOf('k');
        System.out.println(r2); // 4

        //EXample1 :Bir Listteki tekrarsiz elemnalri console'a yazdiriniz
        List<Double> price =List.of(2.5,1.25,2.5,3.75,1.25,4.0);

        for(Double w :price){
            if(price.indexOf(w)==price.lastIndexOf(w)){
                System.out.println(w+ " ");

            }
        }
        //Example 2: Bir Listdeki tekrarli eleman olup olmadigini gösteren kodu yaziniz.
        List<Double> heights =List.of(2.5,1.25,2.5,3.75,1.25,4.0);

        int counter = 0;
        for(Double w:heights) {
            if (heights.indexOf(w) !=heights.lastIndexOf(w)) {
                counter++;
            }
        }
        if(counter==0){
            System.out.println("All elements are unique ");
        }else {
            System.out.println("At least one element is not unique in the list");
        }

    }
}
