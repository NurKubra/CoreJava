package javaders.day26abstraction;

/*
   1)Bazen parent class daki methodun body'si hic bir child tarafindan
     kullanilmaz.
     Bu durumda parent daki methoda body yazmak hic kullanilmadigi icin mantikli
     degildir.
     Biz de o methoda body yazmayiz.

   2)Body'si yazilmayan methoda abstract method denir.
     Abstract ingilizcede "vucütsuz veya soyut" anlamindadir.

   3)Methodun body'ini yazmayinca Java hata verir. Biz de abstract keyword'unu
     kullanrak bu methodun body'si olmucak deriz.


   4)Abstract keyword'unu kullanica elde ettgimiz class normal class'lara
     koyulamaz, o yüzden class'i da abstract yapariz.

   5)Parent daki method abstract ise butun child class'lar o methodu Override
     etmek zorundadir. Bu yüzden tüm child'lar icin mecburi olmasini istedigimiz
     fonksiyonlari abstract yapmak mantikli bir secimdir.

   6)Body'si olan method'lar()(Concrete Method==somut yada beton)
     abstract methodlarin icine yazilir.
     Abstract methodlar concrete class'lar icine yazilamazlar.

   7)"Abstract" Keyword ile "method body" bir method da ayni anda kullanilamaz.

   8) Abstract class'larin iicnde abstract method lar olur, abstract methodlar body si
   olmadigi icin eksik method'lar gibi düsününülebilir
   Yani abstrat class icinde eksik bir yapi barindiirr, siz abastract class'dan
   object ürettirseniz abstract class icindeki eksiklik object'e yansir ve
   object eksigi olan bir object oolmus olur.
   Java bunu istemez cunku eksik object eksik is yapmis olur,
   bu da application yanlis calismasina sebep olur.
   Java app'i korumak icin "abstract class" lardan object üretilmesini
   engellemistir.

   9) "abstract class"larin constructer'leri vardir ama object olusturumazlar

   10) "final" methodlar abstract olamazlar. (bir final varsa o mutlaka concrete olmalidir)

   11) "Private" methodlar abstract olamazlar

   12) "abstarct" class'in "abstract" child'i veya concrete child' i olabilir!!


   **** Abstract method yapmanin faydasi; child class'larin bu methodu
    kesinlikle kullanilmasini saglar.
    (mesela math dersi butun siniflarda mecburi ise bu methodu
    abstract yaparak butun child larda kullanmayi saglar.)
    Abstract ile yazdiigmiz method aslinda eksik method'dur. Bu eksikligi child
    class tamamlar.(mat() methodu yarim ama art() methodu tamdir)

    Bir Application da OBJELER mükemmel olursa cok güzel calisir.
    Ama eksigi olan OBJE olursa App güzel calismaz.
    Bu yüzden abstract claasindan "OBJE" olusturmaya iizin verilmez.

    Private methodlar "abstract " edilmezler. Cunku zaten private lar Override edilmezler
    Parent class abstract iken child class concrete olabilir.



 */

/*
            Interview Sorusu!
    "Final" keyword'u aciklar misiniz ?
    "final" keyword i) Variable'larda
                    ii)method'larda
                    iii)class'larda kullanilir.
    i) variable'larda kullanildiginda a) o variable'a kesinlikle deger atamasi yapilmalidir.
                                      b) Ilk atanan deger degistirilmez. !!
    ii) Method'larda kullanildiginda  a) o methodun body'si degistirilemez.
                                      b) o method Override edilemez
    iii) class`larda kullanildiignda  a) o class'in cocugu child class'i olamaz. Ama final class'in kendisi child olabilir.

 */

public abstract class Courses {

    //Bazen methodun body'sine yazilan kod hic bir child tarafindan kullanilmaz, override edilir. O zaman kod body'si yazilmaz.
    //Body'si olmayan methoda "abstract()" (vucütsuz/soyut) method denir.

    //Nicin body'si olmayan method üretiriz; cünkü bazen hic bir child tarfindan body'deki kod kullanilmaz.

    //Burda body'i sildik ve abstract ekledik.
    //Ama abstract() methodlar normal class da yasamayamazlar.
    //Bu yüzden ona özel bir class olusturmak gerekir
    //Yani class'in ismine de abstract ekleriz.

    //Ama abstract olmayan methodlar da bu class'a yazilabilir.

    public abstract void math();

    public void art() {
        System.out.println("Learn art");
    }

    // public final abstract void multipy(){
    //yapamayiz cunku final ve abstarct kombinasyonu yanyana olmaz

    //private abstract void sum();
    //private 'lar override edilemediginden abstract da edilemzler
}