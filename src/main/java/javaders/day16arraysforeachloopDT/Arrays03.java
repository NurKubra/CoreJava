package javaders.day16arraysforeachloopDT;

import java.util.Arrays;

public class Arrays03 {

    //spesific bir elemanin array'de olup olmadigini anlamak icin gerekn kodu yaziniz.
    public static void main(String[] args) {
        String names[] ={"K","C","R","A","S"};
        String el="R";              //aradigim eleman

        int counter=0;
                                    //loops icinde butun harflere tek tek bakiyor ve
        for(String w : names) {     //for each olabildigince tercih edilmeli
            if (w.equals(el)) {    //datam eger w sepetindeki data el sepetindekine esitse sayaci 1 arttir
                counter++;         //saddece var mi yok mu diye baktik
                break;             //saymak istemedigimiz icin break koyduk ilk gordugu yerde cikar
            }
        }

        if(counter>0){
            System.out.println("Array has ==>" + el);
        }else{
            System.out.println("Araay doeent have ==>" + el);
        }


        //2.yol

        Arrays.sort(names);
        int result = Arrays.binarySearch(names,el);  //names Array'in ismi, el Array de arancak eleman
        //bu method icin once elemenlari sort ile siralamamiz gerek!!  int bir deger döndürür
        System.out.println(result);

        if(result<0){
            System.out.println("Araay doeent have ==>" + el);
        }else{
            System.out.println("Array has ==>" + el);
        }


        //ornek
        //int arr[]= {2,1,7,6};
        //Arrays.sort(arr); --> int arr[]={1,2,6,7}   1==> 0.index ,6==> 2.index, 5==> -3.sira
        //Olan karaketerle icin index olmayan karekterer icin -sira sayisi düsünüyoruz


        //1) binarysearch() methodunu sort() kullanmadan kullanamayiz, cunku  binarysearch() antigi sirali elemanlar icin gecerlidir
        //2) binarysearch() methodu var olan elemanlar icin size o elemanin index ini verir
        //3) binarysearch() methodundan aldigimiz index 0 veya 0'den buyukse bu aradigimiz eleman arrayde var demektir
        //4)  binarysearch() methodu olmayan elemanlar icin negatif deger verir,
        //   "-" isaretinin anlami o eleman arrayde yok demektir
        //   "-" isaretinin yanindaki sayi ise "eger o eleamn arrayde olsaydi kacinci eleman olurdu" demektir.


    }
}
