package javaders.day33maps;


import java.util.Hashtable;

/*
   Interview sorusu ;

   HashMap ile HashTable arasindkai fark nedir?
   i)  "HashMap" "thread-safe" degildir "HashTable" "thread-safe"dir.  (thread safe: coklu isi ayni anda yapablimesi )
       "HashMap" "synchronized" degildir "HashTable" "synchronized"dir.  (synchronized: mantikli siralama yapmak )
   ii) "HashMap" bir tane "null" key'e ve istediginiz kadar "null" value'ya musahade eder.
       "HashTable" key'lerde de "value"larda da "null" kullanima izin vermez.

   iii)"HashMap" hizlidir, "HashTable" "HashMap"e gore yavastir.
   iv) "HashMap" ve "HashTbale" ikisi de entry'leri rastgele siralar.



 */
public class HashTable01 {
    public static void main(String[] args) {

        Hashtable<String, Integer> stdAges =new Hashtable<>();
        stdAges.put("Tom", 43);
        stdAges.put("Jim", 52);
        stdAges.put("Jack", 21);
        stdAges.put("Henry", 43);
        stdAges.put("Walker", 85);
        //stdAges.put(null, 85); //hashTable 'larin key'lerine null konulmaz.
        //stdAges.put("Chris", null); //hashTable 'larin value'larina da  null konulmaz.
        //Ama HashMap'lerde konulabilir. Her iki tarafda.

        System.out.println(stdAges);//{Jim=52, Henry=43, Tom=43, Walker=85, Jack=21}



    }
}
