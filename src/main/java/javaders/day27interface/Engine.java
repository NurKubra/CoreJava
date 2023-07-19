package javaders.day27interface;


/*             interface'deki Methodlar
    1) "Interface" icine "concrete method" konulmaz.

    2) Interface icindeki methodlarda abstract keyword'u koymaya gerek yoktur
       (koymak istege bagli--> intellij gri yapar ve bu olsa da olur olmasa ya da kullanmadin dmeketir)
      --> cünkü Java interface'deki methodlarin abstract oldugunu bilir.

    3) Interface icindeki abstarct methodlarin tamami public'tir.

       Bu yüzden interface icinde abstract method olusturuken "Accsess Modifier" yazmaya gerek yoktur.
    4) Bir "interface"i bir "class"in parent'i yapmak istedgimizde "extends"keyword yerine
       "implements" keyword kullanilir.

    5) "Concrete Child Class"'lar "Parent interface"'deki "abstract methodlar"i Override etmek zorundalar.
        Cunku interface parentlara eklenen tum methodlar child'larda mutlaka kullanilmalidir.

    6) "interface"'ler bir applicationda "Concrete Class"larin yapmak zorunda olduklari
       fonskiyonlari barindirirlar. Bu yüzden "interface"lere to-do list de denir.
       (ama nasil yapcagini söylemez, nasil yapcagini söylemek icin body'ye ihtiyac vardir.
       Mesela Parentda star() diyoruz ama nasil yapcagina child class karar verir.)

    7) Birde fazla "parent interface "icinde ayni isimli abstarct methodlar olusturabilirisniz.
       abstract methodlarin body'si olmadigi icin child class'lar ayni isimli method'lardan
       herhangi birini override ederek kullanabilir.

    8) Birde fazla "parent interface "icinde ayni isimli abstarct methodlar olusturdugunuzda,
       bu methodlarin "return type"lari ayni olmak zorundadir.
    9) Normalde "interface" icine concrete method konulmaz ama bazi ozel durumlarda "concrete method"
       koymamiz gerekirse
        i) "default" keyword'unu asagidaki gibi kullanarak "interface " icine "concrete method"
            koyabiliriz. default void eco(){  System.out.println("Uses gas less..");}

        ii) "static" keyword'unu asagidaki gibi kullanarak "interface " icine "concrete method"
            koyabiliriz.  static void stop(){  System.out.println("Stops securely..");}

     10) "default" veya "static" keyword'uyla olusturdugunuz "concrete method"larin
         "concrete child class"lar tarafindan kullanilma zorunlulugu yoktur.

     11)  "default" keywordunu kullarak olusturdugunuz "concrete method"lara Object olusturarak
           ulasilabilir.
          "static" keywordunu kullarak olusturdugunuz "concrete method"lara Object olusturmaya gerek
           yoktur."interfaec" ismi yeterlidir.

     12)  interface 'lerden Object olusturulamaz. Cunku bu methodlar body'si olmadigindan yarim objedir.
          interface'lerin Constructer'i yoktur.
          (abstract class larin constructer'i vardir ama obje olusturamaz, ama interface de constructer yoktur)


     Eger iki Interface Parent'a da ayni methodu yazarsak sorun olmaz. Child class'da bir kere Override
     etmek yeterlidir.Zaten Parent de nasil yapacagi söylenmediginden Child de icereigini istegime gore
     degistirebilrirz.
     Ama ayni islemi abstract methodun basina return type'lari farkli iki method eklersek problem cikar.
     Bu yüzden bir method iki kez yazilcaksa ayni return type sahip olmali

     Normalde interface'lerde conrete method kullanilmaz. Ama ihtiyaca binayen java tarafindan sonrdan
     eklenmistir.
     Bunu default keyword'u kullanrak yapabiliriz.
     Burdaki "default" acsess modifier olan default degildir.
     Cünkü default acsess modifier olarak kullanildiignda yazilmaz.
     Burda yazilan interface'e ozel bir keyword'udur.
     Ya da static keyword kullanarak !!




 */
public interface Engine{
    //public void start() ; //Normalde abstract class'larin icine body'li method koyabiliyorduk.
                          //Ama interface de abstarctir ve icine body'li method yazamayiz!

      void start();

      void payment();

      default void eco(){
            System.out.println("Uses gas less..");
      }

      static void stop(){
            System.out.println("Stops securely..");
      }
}
