package javaders.day44lambda;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) throws IOException {

        //Example 1: Verilen Text file icindeki texti console'a yazdiran kodu yaziniz.

        //satir satir okumak icin
        Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).forEach(System.out :: println);

        //forEach(t-> System.out.println(t)) ==> yerine method reference kullandik ==>
        //java bana dosyanin adini ver ben sana String sekilde vercem diyor
        //lines methodu direk stream olarak verir bu yüzden stream'e cevirmeye gerek yoktur.
        //Ve stream de kullanilan butun methodlari kullanabiliyoruz.
        //forEach ile her satiri ayri ayri vercek

        //Example 2: Verilen Text file icindeki texti buyuk harflerle console'a yazdiran kodu yaziniz.
        Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).map(String ::toUpperCase).forEach(System.out::println);

        //Example 3: Verilen Text file icindeki textlerde "Java" kelimesinin olup olmadigini yazdiriniz.
        boolean r1= Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).anyMatch(t->t.contains("Java"));
        System.out.println(r1);

        //anyMatch bize boolean dondircegi icin
        //anyMatch(t->t.contains("Java")) ==> neyi aradigimizi yazmamiz gerektigi icin method reference ile yapamayiz
        //eger method kullanmak istersek Utilde method olusturp cagimaliyiz.

        //Example 4: Verilen Text file icindeki textlerde kullanilan kelimeleri bir list icinde return ediniz.
       List<String> words = Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).
                        map(t->t.replaceAll("\\{Punct}","").
                        split(" ")).
                        flatMap(Arrays::stream).
                        distinct().collect(Collectors.toList());

        System.out.println(words);

        /*
        lines methdounu kullaninca bir tane streamimiz olcak, bu streamin iicnde sizin text file 'a koydugunuz stirlar olcak.
        4 tane satir. map() methoudnu kullanarak noktalma isaretlerini sildik ve bosluklardan kestik. Normalde satir varken
        kestikten sonra kelimeler haline dondu. split kullaninca Java bize Array verir. Eger bu stream ile direk calisirsak
        java Array'lerle calisir ama bizim kelimelerle calismaamiz lazim.
        Bu yüzden flatMap ==> dumduz et Array duvarlarini yik demek. duavrlari yikip sonra da onalri stream'in icine koyar.
        Sonra tekrarli kelimeleri distinct ile silip List'in icine koyduk.
         */

        //Example 5: Verilen Text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.
        long numOfLetters = Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^a-zA-Z]","")).
                map(t->t.split("")).
                flatMap(Arrays :: stream).
                count(); //count long döndürdügü icin long konteynirina aldik, count() methodundan sonra method göstermiyor
                                                                             //Lambdada methodlarin bazilari son kullanim icindir o zman ondan sonra
                                                                             //method göstermez.
                                                                             //Kendinden sonra method gostermeyen kodlara "terminal kod "denir.
        System.out.println(numOfLetters);  //161

        //Example 6: Verilen Text file icindeki text'de kullanilan tum harfleri alfabetik olarak
        // ters sirada bir List'in icinde return eden kodu yaziniz.

        List<String> letters = Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^a-zA-Z]","")).
                map(t->t.split("")).
                flatMap(Arrays :: stream).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(letters);

    }
}
