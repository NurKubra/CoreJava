package practice.day_18_practice;

import java.util.*;

public class C02_Iterator {

    /*
       Sadece List'de index yapisi vardir. Onun disindaki collection uyelerinde islem yapacaksak Iterator kullaniliriz.
       List haricinideki Collection'larda index yapisi yaktur.

     */
    /*
       Bir Set olusturunuz icerisine int elemanlar ekleyiniz.
       set'deki cift elemanları iterator ile siliniz
     */

    public static void main(String[] args) {
        Set<Integer> st = new TreeSet<>(Arrays.asList(1,2,3,4,5));  //istedigimiz elemanlari byle kisaca ekleybiliriz
                //SEt bir Interface bu yüzden cont. kismi tarafindan Override edilmeli
                //Cont kismina new Set() yazmayiz bu yüzden.
                //Dogal sirali olsun diye TreeSet sectik
        System.out.println(st);  //[1, 2, 3, 4, 5]
        Iterator itr = st.iterator(); //set'lerde index yapisi yoktur, bu sebeple Iterator yapsisi kullandik
                                      //List haric hic bir Collections uyesinde index yapisi yoktur, sadece Listlerde var
                                      //eger soruda List seklinde isteseydi bu islemi ForLoop ile cözcektik, ama index
                                      //olmadigi icin for Lopp yerine iterator kullaniyoruz.

        while(itr.hasNext()){ //itr.'in yaninda eleman var mi varsa true yoksa false döndürür.
                              //true oldugu muddetce while dongusu devam etcek
            Object sayi = itr.next();       //next() ile iterator'i bir adim ileri atiyor ve ustunden atlaidgi elemani aklinda tutup yazdirir.
            if((Integer) sayi%2==0){        //Integer'a Objecte cevirdik sayisnin 0'a esitligi soz konusu old. icin(Java istedigi icin)
                itr.remove();               //cift sayilari sildik

            }
        }
        System.out.println(st);  //[1, 3, 5]
    }
}
