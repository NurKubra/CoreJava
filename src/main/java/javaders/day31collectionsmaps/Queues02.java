package javaders.day31collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {

    public static void main(String[] args) {

        Queue<String> line = new PriorityQueue<>(); // PriorityQueue constructer'i kullandik; burda belirlenen öncelige göre list'i yapiyor
                                                    //Nasil listelicegimize biz karar veririz.
                                                    //ornek: Stringleri uzunluklairna gore, ya da belli bir harfle biten stringlere göre diz vs.

        line.add("Milk");
        line.add("Meat");
        line.add("Egg");
        line.add("Orange");
        line.add("Tomatoes");
        System.out.println(line);  //[Egg, Milk, Meat, Orange, Tomatoes]  burda java kendi mantigina gore siraladi


        //Deque=> Double ended Queue ==> iki uclu queue
        //Deque'dkai add)(,get(),peek(),poll(), remove() methodlari first-last seklinde iki uclu olarak bulunur.
        Deque<String> d = new LinkedList<>();             //Deque: iki uclu demek (mesela golf topu tasima cantasi)
        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatoes");      //hem bastan hem sondan calismak icin kullanilir. Cunku Queue de sondaki eleman icin method yoktur. Extra
                                //method yazmak gerekir.

        //7tane collection kullanirsak professyonel gözükürüz. Array'lerde cogu seyi kendimiz olusturmaliyiz.


    }
}
