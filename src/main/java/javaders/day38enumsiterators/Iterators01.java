package javaders.day38enumsiterators;

import java.util.*;

public class Iterators01 {

    /*
   1- Iterator'lar loop larin yaptigi ayni isi yapar.
      Ama loop'larda sonsuz loop tehlikesi var.
   2-  Iterator'larda sonsuz loop olusma ihtimali yoktur bu yüzden jaava tarafindan olusturulmustur.
   3-  Iterator'lar ile loop'lar arasinda performans farki yoktur.
   4-  Iterator'lar bir collection'dan eleman silme ve bir collcetion'daki eleman degistirma konusunda daha basarilidir.
   5-  Iki tip Iterator vardir;
         i) Iterator: Bu sadece eleman silmeden kullanilir,
         eleman eklemek veya elemani degistirmek mumkun degildir.
         ii) ListIterator : Bu eleman silebilir, ekleyebilir ve degistirebilir.
          Not: "Iterator" sadece soldan saga (ilk elemandan son elemana) calisir.
               "ListIterator" ise cift yonlu calisir.


     > sonsuz döngü riski varsa Iterator kullanilir genelde while ile
     */

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);// [ Tom,   Jim,   Clara,   Angie,   Mark ]

        //*****  Iterator kullanim  (sadece 3 method var)

        Iterator<String> myItr=  myList.iterator();   //iterator methoduyla List'i Iterator'a cevirdik=> ayni elemanlr iterator icine yazdi
                                                      //[ Tom,   Jim,   Clara,   Angie,   Mark ]
        while(myItr.hasNext()){  //pointer'a senden sonra eleman var mi diye sorar? varsa true döner ve while calisir
            myItr.next();        //next'i  bir sonraki elemanin pointer'ina tasir ve ustunden atladigi elemani return eder
            myItr.remove();      //remove ustunden atladigi elemani siler (return ettigi elemani siler)
                                 //Dolayiyisla List'den de silinir.
        }
        System.out.println(myList);  //tum elemanlari sildik  []  Listi yazdirdik

        //*****   ListIterator kullanimi
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        yourList.add("Mark");
        System.out.println(yourList);// [ Tom,   Jim,   Clara,   Angie,   Mark ]

        ListIterator<String> yourListItr = yourList.listIterator();
        while(yourListItr.hasNext()){  //pointera senden sonra elemanvar mi diye sorar
            String el = yourListItr.next();  //bir sonraki pointer'a gecer bu method ustunden atladigi elemani yazdirir
            yourListItr.set(el+ "!");       //ustunden atladigi elemanin sonuna ! ekle (concat yap)
                                            //set() methodu list'i update etmeye yarar.

        }
        System.out.println(yourList);   //[Tom!, Jim!, Clara!, Angie!, Mark!]

        //****************** hasPrevious() ve previous() nasil kullanilir? **************************
        //pointer'i en sona göndermeden bu methodlari kullanamayiz.Burada bir ustte hasNext ve next ile yaptik!!
        //ama Java da pointer'i direk sondan baslatmak icin ikinci bir yol olarak; descendingIterator() ile islem sondan baslar!(ama sadece LinkedList de kullanilir)
        while(yourListItr.hasPrevious()){        //en sondan baslayacagim icin pointer en sondaki elemana sorar eleman var mi diye
            String el = yourListItr.previous();  //pointer'i bir öne atar ve ustunden atladigi elemani verir ;asagida yazdirdik
            System.out.print(el+ " ");           //Mark! Angie! Clara! Jim! Tom! her seferinde hangi elemanla loop döndügüne baktik(sondan basladi)
            yourListItr.set("?"+ el);            //sagdan sola dogru yapti
        }
        System.out.println(yourList);  //[?Tom!, ?Jim!, ?Clara!, ?Angie!, ?Mark!]



        //En sondan en basa nasil Iterate edebiliriz?  ==> descendingIterator() ==> yalnizca LinkedList ile kullanilir!
        LinkedList<String> ourList = new LinkedList<>();
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);

        Iterator<String> ourListItr = ourList.descendingIterator(); //tersten baslamayi saglar ama sadece LinkedList de kullanilir!!
        while(ourListItr.hasNext()){
            String el = ourListItr.next();
            System.out.println(el);
        }
    }

}
