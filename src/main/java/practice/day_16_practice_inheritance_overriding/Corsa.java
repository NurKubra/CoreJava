package practice.day_16_practice_inheritance_overriding;

public class Corsa extends Opel{

    /*
    Ozet Not: Variable'lar sadece obje olusturulan Class ve Parent'indan alinabilir.
              Ilk buldugum yerden aliyorum.
              Ama methodlar obje olusturlan class'dan Override edildiyse Constr. olusturlan class'dan da alir.Edilmediyse
              en son nerde Override edildiyse ordan alir.
     */
    /*
    Onemli Notlar:
    inheritance variable ;
    Olusturdugumuz Objenin data turu hangi Class'a aitse oradan baslayarak bakar.
    (const. olusturdugumu class ile obje olusturdugumuz class farkli ise const. olusturulan class'a bakmaz)
    Yoksa parent'ina gider.
    Ilk buldugu yerden alir.

    inheritance methodlar:
    Olusturdugumuz Objenin data turu hangi Class'a aitse oradan baslayarak bakar.
    Yoksa Parent'ina gider.
    Buldugu yerden hemen almaz.Override edilmis mi diye kontrol eder.
    (Constructor Class'ina kadar ayni isimde method var mi diye kontrol eder (const. olustrulan CLass da varsa onu yazdirir)
    Override edileni alir.
    Override edilmediyse o methodu kullanmaz!!
     */

    //En spesifik bilgileri bu class'da yazcaz, yani corsa'ya ozel

    protected String hiz="Corsa max 200 km hiz yapar";
    protected String yakit="Corsa benzinli veya elektriklidir";
    protected String model="Corsa";


    protected void motor(){
        System.out.println("CORSA ARABALAR CEVRECI MOTOR KULLANIR");
    }
    protected void yakitTuketimi(){
        System.out.println("CORSA 5,6 LITRE YAKIT TUKETIR");
    }

    protected void vitesSayisi(){
        System.out.println("CORSA 5 VITESLIDIR");
    }

    public static void main(String[] args) {
        //instance variable'lara static bir main methid icinden ulasmak icin obje olusturmaliyiz
        //Olusturdugumuz objenin data turu de const. da Corsa class'ina ait.

        Corsa arb1 =new Corsa();  //data turu ve constructor'i ayni class'a ait bir obje olusturuduk ve bu obje ile instance variable'lari cagiriyouz
        //**Ilk olarak Corsa class'ina bakar sonra Parent'a bakar onda da yoksa onun da parent'ina bakar.
        //Variable'larda ilk buldugu yerden alir gelir.
        //Her zaman ilk kendi class'ina bakar.


        System.out.println(arb1.hareket);  //Arabalar teker ile hareket eder
        System.out.println(arb1.hiz);      //Corsa max 200 km hiz yapar
        System.out.println(arb1.yakit);    //Corsa benzinli veya elektriklidir
        System.out.println(arb1.marka);    //Opel
        System.out.println(arb1.sirketMerkezi); //Almanya
        System.out.println(arb1.model);         //Corsa

        arb1.motor(); //CORSA ARABALAR CEVRECI MOTOR KULLANIR  (ayni class'dan method cagirdik)


        //Bu objede data turu ve cont. farkli class'lara ait
        //**Ilk olarak opel class'ina gitcek sonra yoksa onun parent'ina
        //ilk olarak Opel class'ina baktigi icin ilk ordaki "hiz" instance variable'ini alir.

        Opel arb2 = new Corsa();

        System.out.println(arb2.hareket);  //Arabalar teker ile hareket eder (araba class'indan aldi)
        System.out.println(arb2.hiz);      //Opel arabalar max 220 km hiz yapar (opel class'indan aldi)
        System.out.println(arb2.yakit);    //Arabalar farkli yakitlar kullanabilirler  (Araba class'indan aldi)
        System.out.println(arb2.marka);    //Opel (Opel class'indan aldi)
        System.out.println(arb2.sirketMerkezi); //Almanya (Opel class'indan aldi)
        //System.out.println(arb2.model);  //Compile Time Error ==> Calismayz cunku Objeyi Opel class'indan olusturduk

        //Onemli :
        //methodlarda Override edilmis mi once onu kontrol etmek lazim
        //direk Opel class'ina bakar varsa buldugu yerden hemen almiyor
        //Bu method const. i olustudugumuz class'da Override edilmis mi diye bakar
        //Edildiyse direk conts. olusturulan class'daki methodu yazdirir.
        //Eger Override edilmediyse Obje olusturulan class'daki methodu alir yani Opel class'indan
        //Override edildiyse en özel bilgiyi almak isteriz
        //Ama Variable'lar override edilmedginden durum farkli

        arb2.motor();  //CORSA ARABALAR CEVRECI MOTOR KULLANIR  (Corsa class'indan)
        arb2.garanti(); //OPEL ARABALAR 2 YIL GARANTILIDIR  (Corsa class'inda Override edilmedigi icin Opel dekini alir.)
        arb2.yakitTuketimi(); //CORSA 5,6 LITRE YAKIT TUKETIR
        //Once obje olusturlan class' a bakar yoksa parentina sonra yukardan asagiya
        //dogru Override edilip edilmedigini kontrol eder.

        //arb2.vitesSayisi();  //CTE Hic bir yerde bulamadik ==> Override edilmedigi icin Corsa class'indan da almaz


        Araba arb3 = new Corsa();

        //burdaki tum variable'lari obje olusturdugumuz class'dan aldik
        //parent'i olmadigi icin sadece ondakileri alabildik.
        System.out.println(arb3.hareket);  //Arabalar teker ile hareket eder
        System.out.println(arb3.hiz);      //Arabalar motor gucune gore hiz yapar
        System.out.println(arb3.yakit);    //Arabalar farkli yakitlar kullanabilirler
        System.out.println(arb3.marka);    //Arabalar uretildikleri markaya sahiptir
        //System.out.println(arb3.sirketmerkezi);  CTE
        //System.out.println(arb3.model());  CTE

        arb3.yakitTuketimi();  //CORSA 5,6 LITRE YAKIT TUKETIR
        //yakitTuketimi methodu override edildiginden const. clasiindan alabildik
        arb3.motor();  //CORSA ARABALAR CEVRECI MOTOR KULLANIR
        //en son override edildigi yer burasi oldugu icin bu class'dan aldik

        //arb3.garanti();  Opel class'inda vardir ama Araba class'indan override edilmediginden yazdirmaz


    }
}

