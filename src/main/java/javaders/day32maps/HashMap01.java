package javaders.day32maps;

import java.util.HashMap;

public class HashMap01 {

    public static void main(String[] args) {
        HashMap<String, Integer> stdAges = new HashMap<>();

        stdAges.put("Ajda",77);
        stdAges.put("Ezel",38);
        stdAges.put("Tom",76);
        stdAges.put("Brad",58);
        stdAges.put("Angelina",58);

        //key'i tekrarli kullandigimizda hata vermez, bu yüzden cok hizli calsiir.
        //Bu yöntem value guncellemede kullanilabilir. Buna "owerwrite" denir.
        stdAges.put("Tom",83);

        //HashMap rastgele dizer o yuzden hizli calisir
        //Farkli isteklerim varsa ona göre diger yontemler tercih edilir.
        //HashMap'ler entry'leri rastgele siralar, bu yüzden cok hizli calisir.
        //HashMap'ler enrty'leri siralarken "key"lere bakarak siralama yapar.
        System.out.println(stdAges);

        //replace value'larin degerini degistirmeyi saglar;
        //Ama value'ya gitmek icin key kullaniriz.
        //istenen key var mi yok mu diye bakar
        //replace() methodu "value"'lari, "key"leri kullanarak update etmeye yarar.
        stdAges.replace("Ezel",39);
        System.out.println(stdAges);

        //replace("Angelina",57,61); methodu Map icinde "Angelina" 57 varsa 57'yi 61'e donusturur, yoksa donusturmez
        //
        stdAges.replace("Angelina",57,61);
        System.out.println(stdAges);

        //putIfAbsent("Ali",60) Map'de Ali key olarak yoksa Map'e Ali=60' ekler, varsa eklemez!
        stdAges.putIfAbsent("Ali",60);  //yoksa ekle
        System.out.println(stdAges);

        // getOrDefault("Ayse",0)); methodu Map'te varolan key'ler icin get() methodu ile ayni ciktiyi verir.
        // getOrDefault("Ayse",0)); methodu Map'te olmayan key'ler icin ikinci parametreye koydugumuz degeri "get()" methodu ise null verir.
        //var olan key icin ;
        System.out.println(stdAges.get("Tom")); //83 (value)
        System.out.println(stdAges.getOrDefault("Tom", 0)); // 83 (value)
        //var olmayan key icin;
        System.out.println(stdAges.get("Ayse"));
        System.out.println(stdAges.getOrDefault("Ayse",0)); //Ayse olmayan bir elemansa olmadigini anlatan degeri bizz
                                                                           //veriyoruz mesela burda 0 verdik.
        //containsValue(77) ; methodu value'larin icerisinde 77 olup olmadiigni kontrol eder.
        System.out.println(stdAges.containsValue(77)); //true
        System.out.println(stdAges.containsValue(99)); //false

        //stdAges.containsKey("Ali");methodu keylerin icerisinde Ali'nin olup olmadigini kontrol eder.
        System.out.println(stdAges.containsKey("Ali"));  //true

        //remove("Ali") methodu "key "kullanarak "entry"i silmeye yarar
        stdAges.remove("Ali");
        System.out.println(stdAges);  //Ali'yi siler.

        //remove("Tom",81); methodu "key"si Tom, "value"su 81 olan bir entry varsa onu siler, yoksa silmez
        stdAges.remove("Tom",81);
        System.out.println(stdAges);

        stdAges.size(); //kac tane entry oldugunu soyler

       // stdAges.clear(); //Map'i bosaltir bos yapar.



        HashMap<String, Integer> kidsAge = new HashMap<>();
        kidsAge.put("John", 12);
        kidsAge.put("Jim", 22);
        kidsAge.put("Jack", 32);

        // stdAges.putAll(kidsAge); methodu stdAges Map'ine kidsAge Map'ini ekler.
        //Dolayisiyla stdAges Map'i degisir ama kidsAge Map'i degismez.
        System.out.println(stdAges);  //{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}
        stdAges.putAll(kidsAge);
        System.out.println(stdAges);  //{Tom=83, Angelina=58, John=12, Ajda=77, Brad=58, Jack=32, Ezel=39, Jim=22}
    }
}
