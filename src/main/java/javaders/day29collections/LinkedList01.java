package javaders.day29collections;

import java.util.LinkedList;

public class LinkedList01 {
    /*
    Collection : kolesiyon ; bircok ayni tipteki datalari bir araya getirir ve depolar.
    Ayni tipte coklu yapilari bir araya getiriren diger yapilar Array ve ArrayList'tir.
    Ama biz Arraylari eleman sayilari esnek olmadigindan Collection'a dahil etmeyiz.
    Ama List bir Collection'dir.

    > Constructer kullanidigmiz class data type olabilir ya da onun parentlari da data type olabilir.
    Yani List'ler ArrayList altinda oldugundan Data type'i List ya da ArrayList yapbiliriz.

    > Bir ArrayList'de data sildigimizde ve ekledigimizde o elemandan sonraki butun elemanlarin indexleri yeniden
    atanmalidir. Ama bu indexleme isi Java icin oldukca yorucudur ve zaman alir.

    ** ArrayList'ler eleman silme ve eklmede tekrar indexleme yapmak yorunda olduklarindan eleman ekleme ve silmede
    basarisizdirlar. (yani cok yavaslarlar)
    >Bu yüzden java yeni bir yapi olusturmustur.---> Eleman eklemek ve silmek icin.
    LinkedList'lerde her eleman 2 odaciktan olusur. Ilk kisimda data ikinci kismi ise sonraki elemani gösterir.
    Her eleman bir sey gösteriyor, her eleman bir sey tarafindan gösteriliyor.
    Ilk kisim data ikinci kisim pointer bölümüdür. Bu yapiya Node denir.
    Ilk harf icin bos bir kutu Head(icinde sadece pointer var ilk elemani gostermek icin) ve
    en son kutunun 2. kismi ise Tail'dir(pointer kismi bostur en sonda oldugu icin "null" yani.)
    ArrayList de 5 eleman sildim denirken , LinkedList'de 5 tane node sildim diye bahsedilir.

    LinkedList index kullanmaz bu yüzden indexlemezler.
    Bir eleman silindiignde sadece bir ok cikarir. Aradaki baglaniyi siler. Kolayca yapar.
    **LinkedList'ler index kullanmazlar bu yüzden node(eleman yapsisi) ekleme ve silme islemlerinde tekrar indexleme
    yapilmaz.
    **Linkedlist'lerde Node ekleme ve silme islemleri yaparken sadece pointer'lari degistirir.
    Bir önceki yapidaki pointer okunu kirip bir sonraki yapi icin yeni bir ok olusturur.


     */
    /*
    1)LinkedList'ler node silme ve ekleme'de cok basarili olduklari icin, silme ve ekleme
    islemlerini coklukla yapacaginiz zaman LinkedList kullaniniz.

    > Mesela müzeye giren insanlari listeye app'e ekleyip aksam listeden cikarirken bu yapi kullanilir.
    > Kütüphanler vs Market ürünleri depoluyor ve ekleme cikarma yapiyor. Bu amacla kullanildiginda oldukca faydalidir.
    > Arraylist'lerde istenen eleman indexleme sayesinde cok kolay bulunur(yani her elemanin bir adresi var gibi )
    **ArrayListler eleman bulmada cok basarili.LinkList'ler eleman ekleyip silmede oldukca basarilidir.

     2)ArrayList'ler indexleri adres gibi kullanir, bu yüzden ArrayList'ler search  isleminde cok basarilidir.
     Note: ihtiyaciniz olan collection cogunlukla silme ve ekleme islemleri yapacaksa (muze ziyaretcilari gibi)
     LinkedList, "search" islemleri yapcaksa (Amerika eyalatelri gibi) ArrayList kullaniniz.


     */
    public static void main(String[] args) {

        LinkedList<String> s= new LinkedList<>();   //bütün collection'lar non-primitive data kullanir.
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");

        //LinkedList ekleme ve silmede usta oldugu icin remove ve add icin cok fazla methodu vardir.
        System.out.println(s);

        //istedigim indexe eleman eklerken
        s.add(2, "Esen");  //LinkedList'ler index kullanmazlar ama index varmis gibi yazip nereye yazilcagini ayarlariz.
        System.out.println(s);

        //ilk basa eklerken
        s.addFirst("Kemal");
        System.out.println(s);

        //En sona eklerken
        s.addLast("Ajdar"); //addLast ile add esasinda ayni ,sondakini vurgulamak icin
        System.out.println(s);

        //istegimiz indexi silmek icin
        s.remove(2);
        System.out.println(s);  //[Kemal, Steve, Esen, Muge, Cuneyt, Esra, Ajdar]

        s.remove();  //bos yazarsak ilk elemani sile
        System.out.println(s);

        //Bastan Tekrarli eleman silmek icin
        s.removeFirstOccurrence("Esra");  //buldugu ilk esra'yi silcek

        //Sonden Tekrarli eleman silmek icin
        s.removeLastOccurrence("Esra");   //sondan baslayarak ilk gördugu esra'yi siler

        //ilk node(elemani) kopyalayip silmeden bize verir ---> ilk eleman olmadiignda hata almak istemiyorsak bu method!!
        // (hat vermeden devam etmesi)
        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:
        the head of this list, or null if this list is empty
         */
        String r1 = s.peek();
        System.out.println(r1);
        System.out.println(s);

        //ilk node(eleman) kopyalayip silmeden bize verir  --> ilk eleman bossa hata verir!!
        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:
        the head of this list
        Throws:
        NoSuchElementException – if this list is empty
        Note: peek() ile element() ikisi de ilk elemani silmeden size verir. Ama peek() list bos oldugunda size "null" verir,
        element() ise "hata" verir.
         */
        String r3 = s.element();
        System.out.println(r3);
        System.out.println(s);


        //Ilk node(elemani) size verir ve verdikten sonra siler
        String r2 = s.poll();
        System.out.println(r2);
        System.out.println(s);

        /*Pops an element from the stack represented by this list. In other words, removes and returns the first element of this list.
        This method is equivalent to removeFirst().
        Returns: the element at the front of this list (which is the top of the stack represented by this list)
        Throws: NoSuchElementException – if this list is empty
        Note: poll() ile pop() ikisi de ilk elemani siler ve size verir. Ama poll() list bos oldugunda size "null" verir,
        pop() ise "hata" verir.
        */
        //pop() da ilk elemani verir ve verdikten sonra siler
        String r4 =s.pop();
        System.out.println(s);
        System.out.println(s);

    }
}
