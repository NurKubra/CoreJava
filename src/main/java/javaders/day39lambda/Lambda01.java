package javaders.day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");

        printElements(myList);
        System.out.println();
        printEl(myList);
        System.out.println();
        printElExceptionStartsWith(myList); //Jim Clara
        System.out.println();
        printElLengthThanFour(myList);  //Tom Jim
        System.out.println();
        printElLengthMoreThanFourWithUpper(myList); //CLARA
        System.out.println();
        printElLengthMoreThanFourUniqueLowerCase(myList); //clara angelina
        System.out.println();
        printElUniqueToUpperCaseSorted(myList);  //ANGELINA CLARA JIM TOM
        System.out.println();
        printElUniqueLowerCaseSortWithLenght(myList);  //tom jim clara angelina
    }

    //Example 1: Bir List'deki elemanlari console'a yazdiran methodu olusturunuz.
    //1.YOL;
    public static void printElements(List<String> myList){
        for(String w : myList){
            System.out.print(w+" ");

        }
    }
    //2.YOl:
    /*
    myList'i alcak stream ile List'in yapisini degistiriyor ve yukaridan asagiya yapiyor. "stream" yapisi yukaridan asagiya bir yapidir.
    stream'a donustugunde cok daha fazla method elde ederiz.
    stream donustukten sonra forEach ilk elemani aliyor ve sout icinde yazdiriyor.
    sonra ikinci elemani alip t'nin icine atiyor (artik t demek Jim demek) ve sout icinde yazdiriyor
    sonra ucuncu elemani alip t'nin icine atiyor(artik t demek Clara demek)ve sout icinde yazdiriyor.
    sout'u ln siz yazdirip 1. yol ile ayni sonucu elde ettik.
    1.yol ile olusturulan koda "yapisal kod" ==> "structured Programming"
    2.yol ile olusturulan koda "fonksiyonel kod" ==> "functional Programming"  (sadece method kullanan yapilar)
    Lambda "functional Programming" kullanir.

    //Lambda collection ve listlerde kullanilabilir fakat map'lerde kullanilamaz

    not:Ilk yolumuzda uc katli bir yapi olusturuyoruz. Buna yapisal kod denir.
    Mimari bir yapi olusturduk.
    Ikinci yolda ise sadece for each dedik. Burada bir yapi olusturmak yerine javaya direct methodun ismini veriyoruz.
    Bu proglama tarzina functional programming denir
    reverse order: tersten siralar
     */
    public static void printEl(List<String> myList){
       myList.stream().forEach(t-> System.out.print(t+ " "));        //List'in yapisini degistir "stream " yap==> boylelikle bir suru method elde ederiz
                                                                     //t stream'in elemanlarini temsil eder
    }

    //Example 2: Bir Listdeki T ile baslayanlar haric tum elemanlari console'a yazdiran methodu olusturunuz

    public static void printElExceptionStartsWith(List<String> myList){

        myList.stream().filter(t->!t.startsWith("T")).forEach(t-> System.out.print(t+ " "));
        //List'i aldim filtreledim T harfi ile haric olanlari tek tek yazdir.


    }
    //Example 3: Bir Listde character sayisi 4 den az olan tum elemanlari console'a yazdiran methodu olusturunuz

    public static void printElLengthThanFour(List<String> myList){

        myList.stream().filter(t->t.length()<4).forEach(t-> System.out.print(t+" "));

    }
    //Example 4: Bir Listde character sayisi 4 den cok olan tum elemanlari buyuk harflerler console'a yazdiran methodu olusturunuz
    public static void printElLengthMoreThanFourWithUpper(List<String> myList){

        myList.stream().filter(t->t.length()>4).map(t->t.toUpperCase()).forEach(t-> System.out.print(t+" "));
        // map() ile var olan elemani degistiririz.

    }

    //myList'e 3 eleman daha ekledik
    //Example 5: Bir Listde character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran methodu olusturunuz
    public static void printElLengthMoreThanFourUniqueLowerCase(List<String> myList){

        myList.
                stream().
                distinct().
                filter(t->t.length()>4).
                map(t->t.toLowerCase()).
                forEach(t-> System.out.print(t+" "));
        // distinct() methodu tekrarli elemnalari yazdirmaz.
        //elemanlari azaltanlar once yazilir ==> daha az is yapar
        //distinct'i basa alirsak --> basta gereksiz elemanlari siler
        //funtional Programming de kod lar altalta yazilir bu yüzden burda da alt alta yazip okunur hale getiririz.

    }
    //Example 6: Bir Listdeki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran methodu olusturunuz

    public static void printElUniqueToUpperCaseSorted(List<String> myList){
        myList.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted().
                forEach(t-> System.out.print(t+ " "));
    }
    //Example 7: Bir Listdeki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge siralayarak
    // console'a yazdiran methodu olusturunuz

    public static void printElUniqueLowerCaseSortWithLenght(List<String> myList){

        myList.stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t+" "));

    //siralamanin kuralini ben belirliyorsam 2. sorted() i secerim yani sorted(Comparator.comparing())
        // Copmarator karsilastir demek burda elemanin uzunluguna gore karsilastir dedim.
    }
}
