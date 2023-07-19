package javaders.day21arraylistDT;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

    public static void main(String[] args) {
        ArrayList<String> cities =new ArrayList<>();

        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");
        System.out.println(cities);  //[Miami, Giresun, Yozgat, Barcelona, Miami, Giresun, Giresun, Yozgat]

        //ArrayList'de bir eleman nasil silinir?
        //remove() bir elemanin ilk görünümünü siler!! ilk Miami'yi sildi
        cities.remove("Miami");
        System.out.println(cities.remove("Miami")); //sout icine alirsak Arrayde bulup islemi yapabildiyse true olarak döner.Boolean'nin icinde
        System.out.println(cities);  //[Giresun, Yozgat, Barcelona, Miami, Giresun, Giresun, Yozgat]

        cities.remove(2);
        System.out.println(cities.remove(2)); //hangi datayi sildiyse onu döner
        System.out.println(cities);   //[Giresun, Yozgat, Miami, Giresun, Giresun, Yozgat]

        //Remove() methodu eleman ile kullanilirsa ilk gorunumu siler
        //Remove() methodu eleman ile kullanilirsa size o elemani silip silmedigini ifade eden true ya da false verir

        //Example 1: Bir Integer List olusturun ve bu List'ten 12 elemanini siliniz
        //ArrayList olustururken sag taraf (constructor) Arraylist yazmak zorundeainiz.
        //Ama sol tarafa ister ArrayList yazin ister List yazin ikisi de calisir.
        //Detaylari Collections konusunda görecegiz
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //ages.remove(12);  //burda elemani verdik ama index sandi Java
        //System.out.println(ages);

        //1.yol
       /* Integer nonPrimitive =12;
        ages.remove(nonPrimitive);
        System.out.println(ages);
        */
        //2.yol Recommnded / burda wrapper'a cevirdik. Autoboxing yapmis olduk
        ages.remove((Integer) 12);
        System.out.println(ages);

        //3.yol
      /*  ages.remove(ages.indexOf(12));
        System.out.println(ages);
     */


        //Kisa yoldan bir List olusturumak icin List.of() methodunu kullanabiliirz
        //List.of() methodu degistirilemez bir liste olusturmak icin kullanilir.
        //Bu method ile olusturulan List degistirmeye yönelik methodlari desteklemez (add,remove,set vs.)
        List<Character> initials = List.of('a','b','a','c','d');
        System.out.println(initials);    //[a, b, c, d]

        // initials.add('e');
        // initials.remove(0);
        // initials.set(0,'u');
        System.out.println(initials);  //[a, b, c, d]  elemani eklemeye, silmeye ya da degistirmeye izin vermiyor!!!!

        //indexof() methodu aranan karakterin ilk gorunumunun indexini verir.
        int r1 = initials.indexOf('c');
        System.out.println(r1);

        //lastindexof() methodu aranan karakterin son görünümün indexini verir
        int r2 = initials.lastIndexOf('a');//[a, b, a, c, d]  bunun icin bakiyoruz
        System.out.println(r2);


        //Example 2 (Interview) : Bir List deki tekrarsiz(uniq) elemanlari console da yazdiriniz.
        List<Double> prices = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);

        for (Double w: prices) {
            if(prices.indexOf(w)== prices.lastIndexOf(w)){
                System.out.print(w + " ");  //3.75 4.0
            }
        }
        //Example 3: Bir Listte tekrarli eleman olup olmadigini gösteren kodu yaziniz

        List<Integer> heights = new ArrayList<>();
        int counter =0;
        for(Integer w: heights){

            if(heights.indexOf(w)!= heights.lastIndexOf(w)){
                counter++;
            }
           if(counter==0){
               System.out.println("All elements are unique in the list");
           }else {
               System.out.println("At least one element is not unique in the list"); //En az bir öğe listede tekrarsiz değil /tekrarli
           }
        }



    }
}
