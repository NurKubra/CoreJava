package javaders.day40lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01_2 {

    public static void main(String[] args) {

        List<String> iller = new ArrayList<>(Arrays.asList("Van", "MUS", "Gumushane", "Kutahya", "Ankara", "MUS", "Ordu", "Gaziantep", "Hatay", "Edirne"));
        bykHarfLenghtArtanDistinct(iller);
        System.out.println();

        bykHarfSonHarfArtanDistinct(iller);
        System.out.println();

        bykHarfLenhgtArtanDistinctLenghtAlfabetikSirada(iller);
        System.out.println();

        System.out.println(krtrSysBesFazlaOlanlariSil(iller));  //[Van, MUS, MUS, Ordu, Hatay]
        System.out.println();

        System.out.println(hIleBaslayanOrUileBitenElSil(iller)); //5) [Van, MUS, MUS, Ordu]


    }

        // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz

    public static void bykHarfLenghtArtanDistinct(List<String> iller ){

        System.out.print("1) ");
        iller.stream().                                     //akisa koyduk
                distinct().                                 //tekrarsizlari aldik
                map(t->t.toUpperCase()).                    //Buyuk harfle yapsini degistiridik
                sorted(Comparator.comparing(t->t.length())).//Uzunluguna gore siralama yaptik
                forEach(t-> System.out.print(t+" "));     //Yazdirdik

    }


        // 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz
        public static void bykHarfSonHarfArtanDistinct(List<String> iller ){

        System.out.print("2) ");
        iller.stream().
                distinct().
                map(t->t.toUpperCase()).  //Lambda Expression
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                forEach(t-> System.out.print(t+" "));

        }


        // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
        // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar

        public static void bykHarfLenhgtArtanDistinctLenghtAlfabetikSirada(List<String> iller ){

        System.out.print("3) ");
        iller.stream().
                distinct().
                map(String :: toUpperCase).
                sorted(Comparator.comparing(String :: length).thenComparing(Comparator.naturalOrder())). //thenComparing ==> uzunluklari ayni ise bi de boyle sirala
                forEach(System.out::println);  //Lambda Expression da ==> forEach(t-> System.out.print(t+" ")); bu sekilde yazilirken
                                               //Method referans'da  ==> forEach(System.out::println); bu sekilde yazilir.(ln'siz yazdiramiyoruz, araya bosluk koyamdigimiz icin)


           //map(String :: toUpperCase) ==    map(t->t.toUpperCase())  ayni anlama gelir. Ilk kullanima Lambda Expression denir. 2.si method-referans yöntemi
           //ile yaptik.
        }



        // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz
        public static List<String> krtrSysBesFazlaOlanlariSil(List<String> iller ) {

            System.out.print("4) ");
            iller.removeIf(t->t.length()>5);

            //stream bize bazi methodlari sunmaz mesela remove.
            //bu yüzden akisa sunmadan sildik

            return iller;  //donus type'ini bir List olarak alacagimiz icin void yerine List yazdik
        }



        // 5)"H" ile baslayan veya "u" ile biten elemanlari siliniz
        public static List<String> hIleBaslayanOrUileBitenElSil(List<String> iller ) {
            System.out.print("5) ");
            iller.removeIf(t->t.startsWith("H") || t.endsWith("u"));  //bu sartlar dogruysa silsin

            return iller;

        }
        // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin




        //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.



}
