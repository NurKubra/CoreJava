package javaders.day29collections;

import java.util.LinkedList;

public class Tekrar {

    public static void main(String[] args) {

        LinkedList<String> s= new LinkedList<>();
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");
        System.out.println(s);            //[Steve, Ajda, Muge, Cuneyt, Esra]
        s.add(2,"Esen");
        System.out.println(s);            //[Steve, Ajda, Esen, Muge, Cuneyt, Esra]
        s.addFirst("Kemal");
        System.out.println(s);            //[Kemal, Steve, Ajda, Esen, Muge, Cuneyt, Esra]
        s.addLast("Ajdar");
        System.out.println(s);            //[Kemal, Steve, Ajda, Esen, Muge, Cuneyt, Esra, Ajdar]
        s.remove(2);
        System.out.println(s);            //[Kemal, Steve, Esen, Muge, Cuneyt, Esra, Ajdar]
        s.removeFirstOccurrence("Esra");
        System.out.println(s);            //[Kemal, Steve, Esen, Muge, Cuneyt, Ajdar]
        s.removeLastOccurrence("Esra");
        System.out.println(s);            //[Kemal, Steve, Esen, Muge, Cuneyt, Ajdar]

        s.peek();
        s.element();
        //Not: ikisi de ilk elemani silmeden bize verir.
        //peek() List bossa ==> null
        //element() List bossa ==> hata verir!
        s.poll();
        s.pop();
        //Not: ikisi de ilk elemani bize verir ve sonrasinda siler.
        //poll() List bossa ==> null
        //pop() List bossa ==> hata verir!


    }
}
