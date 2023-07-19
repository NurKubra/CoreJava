package javaders.day03methodcreationscanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {



        /*
        Kullanicidan data almak icin Scanner classindan scan/input/scanner objesi olustururuz.
        Bu sekilde kullaniciyi yonlendirerek gerekli datalari elde ederiz.

         */


        //1. Adim Object olusturma
        Scanner input = new Scanner(System.in); //Nur hanim==> input objesi

        //2. Adim Kullaniciya ne yapacagini soyluyoruz
        System.out.println("Lütfen cinsiyetinizi giriniz k/e seklinde:");

        //3. Adim kullanicidan alinan bir data yapisina uygun bir variable'in icine yerlestirilir.
        char cinsiyet = input.next().charAt(0);

        //4. Adim ekranda görebilmek icin ve kullanicinin da verdigi bilgileri teyit edebilmek icin yazdiriyoruz.
        System.out.println("********** Nur Hanim ************");
        System.out.println("cinsiyet = " + cinsiyet);


        //Örnek: Kullaniciya cinsiyetini, adini, memleketini, yasini, boyunu, ülkesini sevip sevmedigi, maasini soran bir
        //program yaziniz.

        //===> Bir kere input objesi olusturmak yeterli baska bir kullanici icin olusturulcaksa input 2 ile olusturulabilir.


        Scanner input2 = new Scanner(System.in);  //input 2:Gönül hanim
        System.out.println("Lütfen cinsiyetinizi giriniz; erkek ise e, kadin ise k giriniz:");
        char gender = input2.next().charAt(0);

        System.out.println("Lütfen Adinizi giriniz:");
        input.next();                      //Buna DUMMY atmak deniliyor.
        String name = input2.nextLine();   //nextLine() alirsak tüm cümleyi; next() olursa tek kelime alir
                                           //Java nextLine kendi icinde bug verdigi icin sildik
                                           //Ya da bu sekilde öncesine input.next() eklersek sorun cözülür
        System.out.println("Lütfen memleketinizi giriniz:");
        String city = input2.next();

        System.out.println("Lütfen yasinizi giriniz:");
        byte age = input2.nextByte();

        System.out.println("Lütfen boyunuzu giriniz:");
        short height = input2.nextShort();

        System.out.println("Lütfen ülkenizi sevip sevmediginizi yaziniz True/False olarak:");
        boolean isLike = input2.nextBoolean();

        System.out.println("Lütfen maasinizi giriniz:");
        long pay = input2.nextLong();


        System.out.println("********* Gönül Hanim *********");
        System.out.println("gender:"+ gender);  //gender==cinsiyet
        System.out.println("name:"+ name);
        System.out.println("city:"+ city);
        System.out.println("age:"+ age);
        System.out.println("height:"+ height);
        System.out.println("isLike:"+ isLike);
        System.out.println("pay:"+ pay);

        System.out.println("gender: "+ gender+ "\nname: "+name+ "\ncity: "+ city+
                "\nage: "+age+"\nheight: "+ height+"\nislike: "+isLike+"\npay: "+pay);



        //Aksam ki ders:

         /*
        Kullanicidan data almak icin Scanner Classi kullanilir.Ve bir input/ scan/ scanner Objesi olusturulur
        .Bu objeyi new objeyi new key worduyle olustururuz
     */

        // 1 )Adim Object Olusturma
        Scanner input3 = new Scanner(System.in);//Tolgahan

        //2 ) Kullaniciya ne yapacagini soyluyoruz
        System.out.println("Lutfen maasinizi giriniz");

        // 3 ) Adim kullanicidan alinan datalar yapisina ve
        // buyuklugune gore bir Variable'a yerlestirilir
        long maas = input3.nextLong();

        // 4) Kullanicini verdigi bilgileri teyit edebilmesi vs. icin yazdiriyoruz
        System.out.println("maas = " + maas);


        // Kullaniciya cinsiyetini, adini, memleketini , yasini,boyunu,
        // ulkesini sevip sevmedigini , soran bir program yaziniz

        System.out.println("Lütfen cinsiyetinizi giriniz:");
        input3.next();
        char cinsiyt = input3.next().charAt(0);


        System.out.println("Lütfen isminizi giriniz:");
        String isim = input3.nextLine();

        System.out.println("Lütfen memlektinizi giriniz:");
        String memleket = input3.next();

        System.out.println("Lütfen yasinizi giriniz:");
        byte yas = input3.nextByte();

        System.out.println("Lütfen boyunuzu giriniz:");
        double boy = input3.nextDouble();

        System.out.println("Lütfen yasadiginiz ülkeyi sevip sevmediginizi True/False olarak giriniz:");
        boolean seviyorMu = input3.nextBoolean();

        System.out.println("********** Levent ********");
        System.out.println("cinsiyt = " + cinsiyet);
        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);


        System.out.println("cinsiyt = " + cinsiyet+ "\nisim = " + isim+
                "\nmemleket = " + memleket+"\nyas = " + yas+
                "\nboy = " + boy+"\nseviyorMu = " + seviyorMu);


    }
}
