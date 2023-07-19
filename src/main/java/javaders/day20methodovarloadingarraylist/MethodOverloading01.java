package javaders.day20methodovarloadingarraylist;

public class MethodOverloading01 {

    //overloading ==> asiri yükleme anlamina gelir, ayni isme birden cok is yükleme
    //"ayni isimde farkli isler yapabilen methodlar demek!!!!"
    public static void main(String[] args) {      //static klubüne girmek icin static olmali
        String s="Java";

        //1) Method Overloading ne demek?
        // Ayni isimde farkli isler yapabilen methodlar olusturmak demek
        //2) Ne icin var ?
        //Daha derli toplu bir yapi olsun diye, her parametreye göre yeni method olusturmamak adina var.
        //Ornek : substring() methodu
        // a)tek parametre
        // b)ikk parametre

        //Asagida olusturudugumuz overloadingler add yazip nokta koydugumuzda yanda cikti !!

        add(3,5);
        //tekrardan sout yazmaya gerek yok zaten method icinde yazdik

        //explicit narrowing olayindan dolayi asagida uygun bir konteynr bulamazsa hata verir.
        //Auto widening olursa sikinti olmaz(kucuk kutudan buyuk kutuya koyma )
        //Javaya ayni iki secenek verirsek calismaz bizim adimiza secim yapmaz
        //java methodlar isim ve parametreden tanir. (Method signature 'dur bu özellikler)


        /*
        1)Method Overloading yaparken method ismi degistirilmez
        2)Method Overloading yaparken, parametreler degistrilebilir.
           a)Parametre degistirirken, parametrelerin data type'lari desistirilebilir
           b)Parametre degistiriken, parametrelerin data type'lari farkli ise yerleri degistirilebilir
           c)Parametre degistirirken, parametrelerin sayisi degistirilebilir.
         3)Java icin isim ve parametreleri ayni olan iki method tamamiyla aynidir.
           Bu yüzden ismi ve parametre ==> "method signature" olarak adlandirilir.
         4)Method Overloading olustururken return type'i degistirmenin hic bir etkisi yoktur.
           Method Overloading olusturuken access modifier'i degistirmenin hic bir etkisi yoktur
           Method Overloading olusturuken methodu static veya non static hic bir etkisi yoktur
           Method Overloading olusturuken method body'i degistirmenin hic bir etkisi yoktur
         5)"private" methodlar overload edilebilir. Cunku method overloading sadece bir class in icinde olur
           "private" olmak ise baska classlara gidildiginde problem olusturur.
         6)"static" methodlar overload edilebilirler.

         */
    }

    public static void add(int a, int b){                                //yeni bir data üretmiyorsa void yazariz

        System.out.println(a+b);

        //void olmasaydi return yazmam gerekirdi.
    }
    public static void add(double a, double  b){
        System.out.println(a+b);
    }
    public static void add(double a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, double  b){
        System.out.println(a+b);
    }
    public static void add(int a, int b, int c){
        System.out.println(a+b);
    }
}
