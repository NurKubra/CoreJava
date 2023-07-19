package javaders.day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {

    /*
    Queues : otobus ya da bilet kuyrugu demek
    Constructer; LinkedList'den ya da PriorityQueue dan alabilir, Collection'lardan almaz : cunku collection'lar interface'dir.
    Ve interface'lerin constructer'i yoktur!!!!
    Queue;
    Ilk girenin ilk cikmasi durumlarinda kullanilir. Mesela markette ilk giren ürün ilk cikan ürün olmalidir.
    Yani firstIn--firstOut mantigiyla calisir.Ya da Bankayaki siralama sistemi gibi, ilk giden ilk isini hallededer, ve cikar

     */

    public static void main(String[] args) {
        Queue<String> wareHouse = new LinkedList<>();  //LinkedList'i constructer olarak sectigimiz icin bizim verdigimiz siraya göre list'i olusturudu.
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");
        System.out.println(wareHouse); //[Milk, Meat, Bread, Egg, Cheese]

        //ilk giren ile ilgili methodlar var, giris sirasi onemli remove, peek, element, poll
        //Cunku Queue kullaninca ilk elemana odaklanilir.
        wareHouse.remove(); // ilk elemani silcek
        System.out.println(wareHouse);  //[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.peek()); //[Meat] ilk elemani silmeden verir --> boslar icin null verir.
        System.out.println(wareHouse); //

        System.out.println(wareHouse.element()); //[Meat] ilk elemani silmeden verir --> boslar icin hata
        System.out.println(wareHouse); //

        System.out.println(wareHouse.poll());  //ilk elemani verir ve siler. --> bos ise null verir
        System.out.println(wareHouse); //


        wareHouse.clear();  //Önce hepsini sildik
        System.out.println(wareHouse.poll());    //null  ---> ilk elemani siler
        System.out.println(wareHouse.remove());  //Exception ---> ilk elemani siler

        //offer : kapasiteyi kontrol ederk iceri eleman alir.



    }
}
