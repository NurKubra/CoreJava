package javaders.day19arraylist;

import java.util.ArrayList;

public class ArrayList01 {

    /*
    1) Ayni data type'indeki coklu data'lari depolamak icin Array kullanabilirz.
    2)Array'lerin bir negatif yönü vardir; icine koyacaginiz eleman sayisini en basta belirlemek zorundasiniz.
    Kodun dinamik olmasini engeller.
    3)Array'ler eleman sayisinda esnek degildirler, bu yüzden Java "ArrayList" adli yeni bir yapi olusturdu,
    bu yapi eleman sayisinda esnektir. Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar, 1000
    eleman koyarsaniz eleman sayisini 1000 olarak ayarlar.
    4)"ArrayList" yerine sadece "List" de diyebiliriz.
    5)Java "ArrayList" olusturduktan sonra Array'leri iptal etmedi cunku;
        i)Array'ler super hizlidir
        ii)Array'ler memory'de coook az yer kaplar.
        ==> sayisi degismeyen datalar icin Arraylar kullanilir. Mesela : Ay, gün isimleri, sinif sayisi 1. den 12. ye kadar degismez
    6)Array'ler "primitive data" type'lari ve "reference"lari depolayabilir ama ArrayList'ler
    "non-primitive" data type'larini depolar bu yüzden "ArrayList"ler Array'lerden daha cok yer kaplar.

     */
    public static void main(String[] args) {
        //ArrayList nasil olusturulur?
        ArrayList <Integer> ages= new ArrayList<>();
        System.out.println(ages);  // [ ] ici bos cunku hic eleman eklemedim

        //ArrayList'e eleman eklemek icin
        ages.add(12);
        ages.add(24);
        ages.add(9);  //add methodu elemanlari giris sirasina(insertion order) göre List'e yerlestirir.
        System.out.println(ages);  // [12,24,9]
        //2.way
        ages.add(1,99); //index 1 e 99 yerlestir.
        System.out.println(ages);     //[12, 99, 24, 9]


        ArrayList <Integer> price = new ArrayList<>();
        price.add(23);
        price.add(33);

        //3.way
        ages.addAll(price);   //addAll metdodu bir List'i diger List'in icine yerlestirir.Ama sonuna ekler
        System.out.println(ages);   //[12, 99, 24, 9, 23, 33]

        //4.way
        ages.addAll(3,price);
        System.out.println(ages); //bu sekilde bir Listin istedigimiz indexine baska bir List'i yerelstirmek icin (3. index mesela)
        //[12, 99, 24, 23, 33, 9, 23, 33]

        //ArrayList'de eleman sayisi nasil bulunur?
        int numOfElement= ages.size();
        System.out.println(numOfElement);

        //ArrayList'de spesific bir eleman nasil alinir?
        int el1 = ages.get(3);  //get() methodu index kullanarak istedigimiz elemani almaya yarar.
        System.out.println(el1); //23

        //ArrayListe'de spesific bir eleman nasil degistirilir?
        ages.set(6,111);  //[12, 99, 24, 23, 33, 9, 23, 33] ==> [12, 99, 24, 23, 33, 9, 111, 33]
        System.out.println(ages);

        //ArrayList'te spesific bir elemanin olup olmadigini nasil kontrol ederiz?
        boolean r1 =ages.contains(99);
        System.out.println(r1); //true

        //ArrayList'in bos olup olmadigini nasil kontrol ederiz ?
        boolean r2 = ages.isEmpty();
        System.out.println(r2);  //false

        //Bir ArrayList'deki tüm elemanlari nasil sileriz?
        ages.clear();
        System.out.println(ages);  //[]

        boolean r3 = ages.isEmpty();
        System.out.println(r3);  //true

        //Example 1: Bir List'in bos olup olmadigini kontrol eden kodu yaziniz
        ArrayList<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cüneyt");
        names.add("Angelina");
        names.add("Brad");

        if(names.size()==0){
            System.out.println("List bostur");
        }else {
            System.out.println("List'te en az bir eleman vardir");
        }
        //2.way: Recomended  ==> tercih edilen
        if(names.isEmpty()){
            System.out.println("List bostur");
        }else {
            System.out.println("List'te en az bir eleman vardir");
        }





    }


}
