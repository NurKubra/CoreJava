package practice.day_18_practice;

import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class C03_Iterator {
    public static void main(String[] args) {


      /*
    Bir Deque olusturunuz icerisine int elemanlar ekleyiniz.
    5'den buyuk elemanları iterator ile yazdırınız

     */
        //List'in haricindeki collectionlarda index yok ama bize loop lazim bu yuzden Iterator ile icinde dolasabiliyoruz.
        //deque de bir interface old. icin conts. kismi override edilmeli
        Deque<Integer> dq = new LinkedList<>(Arrays.asList(1, 8, 3, 6, 7));
        // dq.add(); ile de eleman ekelenebilir.
        System.out.println(dq);

        Iterator itr = dq.iterator(); //Iterator'i cevirdik
        while (itr.hasNext()) {
            Object sayi = itr.next(); //bir sonraki elemana tasi
            if ((Integer) sayi > 5) {
                System.out.print(sayi + " ");  //8 6 7
            }
        }
    }

}