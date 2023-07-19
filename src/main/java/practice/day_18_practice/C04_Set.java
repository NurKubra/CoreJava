package practice.day_18_practice;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C04_Set {

    //Verilen bir aary'dan tekrar eden elemanlari silip
    // unique elemanlardan olusan bir array haline donusturen method olusturunuz
    // int[] arr = {1,2,2,3,4,4,5};


    /*
    ozetle; array icinde verilen elemanalr unique degil,
    array icindeki elemanlari unique hale getirmeliyiz.
    benzersiz elemanli dedigi icin SEt olusturduk ve arraydeki butun elemanlari bu Set'e ekledik.
    Set unique oldugu icin Set'i yazdirdigimizda unique bir sonuc aldik.
    Sonrasinda tekrarsiz Set'in uzunlugu kadar arr2'yi olusturduk.
    Bu sefer Set deki benzersiz elemanlari arr2'ye tasimiz lazim .
    Setlerde index olmadigi iicn idx sayci olusturdum ve bu sayede butun elemanalri arr2'ye tasidik.
    Elimizdeki arr 'i donusturmek zorunda oldugumuz icin arr2 ye esayn edip arr'yi return ettik ve main icinde yazdirdik.

     */

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5};

        System.out.println(Arrays.toString(benzersizYap(arr)));

    }

    private static int[] benzersizYap(int[] arr) {

        Set<Integer> tekrarsizSet = new TreeSet<>();
        for(int w : arr){
            tekrarsizSet.add(w);   //set'ler zaten tekrarsiz(unique) olacagindan array'I direk set'e ekledik

        }
        System.out.println(tekrarsizSet);

        int arr2[] = new int[tekrarsizSet.size()];
        int idx =0;
        for (Integer w : tekrarsizSet){    // bu sefer Set lerde index kullanamiyoruz bu yuzden disarda bir index sayaci olusturduk
                                           // ve sayac arttikca bir sonraki inexe gecip her elemani tek tek aldi
            arr2[idx] = w;
            idx++;

        }

        System.out.println(Arrays.toString(arr2));

        arr= arr2;
        return arr;
    }

}
