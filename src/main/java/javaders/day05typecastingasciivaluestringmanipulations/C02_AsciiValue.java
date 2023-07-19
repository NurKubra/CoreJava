package javaders.day05typecastingasciivaluestringmanipulations;

public class C02_AsciiValue {

    /*
    Javada char data type'ini matematiksel islemlerde kullanirsaniz
    Ascii table'daki sayisal degerleri alir.

    NUMERIC DATA TYPELARI: byte-short-int-long-float-double
    char karakterinin hem sayisal hem de resim karakteri barindirir.
    boolean ise => numeric olmayan data typedir.
    Javada char datat type'ina int degerde atanabilir Sembol Harf vs de atanabilir
        Cunku char data type'inin Ascii 'den gelen bir  sayisal == numeric bir degeri birde
        resim karakteri vardir

     */

    public static void main(String[] args) {

        //A karakterinin Ascii degerini yazdiran kodu yaziniz

        int asciiA = 'A';
        System.out.println("asciiA = " + asciiA); //65
        System.out.println(asciiA);  //65

        int asciia = 'a';
        System.out.println("asciia = " + asciia); //97

        int asciiUnlem = '!';
        System.out.println("asciiUnlem = " + asciiUnlem); //33

        int asciiSpace = ' ';
        System.out.println("asciiSpace = " + asciiSpace);// 32

        // int asciiHiclik = '','  '; hic bir karakter ya da iki bosluk sonuc vermez

        int asciiSembol = '*';
        System.out.println("asciiSembol = " + asciiSembol); //42



        //char hem resim hem de rakam barindirma ozelligi vardir.
        //char konteynrini int a koyuyoruz.

        //Ascii tablosundaki degerler tam sayi oldugu icin INTEGER kullandik.

        String isim = "Zeki";  //Java sayisal ya da resim halinde gorur. Burdaki zeki ismini bir resim olarak görür.
        char ch = 'Z';
        char sembol = '*';
        char isaret = '?';
        char space = ' ';
        char rakam = '9';
        char sayi = '0';
        //char sayi ='50';  olmaz sadece bir karakter olmali
        //char hem saiysal hem de resim(yani harf ve sembol) barindirabilir.

        int deger = 20;
        char harf = 'A';
        System.out.println(deger + harf);//85  //int'in yanina yazdirmak char'in sayisal yani ascii degerini aldirir.

        //149.9999 Tl * 2

        int deger2 = 20;
        char smbl = '$';
        System.out.println(deger2 + smbl);  //$ Ascii table daki degeri 36+20=56

        //char matematik islemine girince ascii degerini aliyor
        //ayni zamanda int konteyniri char konteynirjndan buyuk oldugu icin int karakterin ascii degerini topladi


        /*
         Javada "+" sembolu iki int icin matematikteki gibi toplama islemi yapar
         iki String data arasinda ya da bir String bir int arasinda ise yanyana yazdirir
         Buna "Concatination" denir
         Java metematik bilir islem onceligine gore calisir
         i)Uslu Sayilar
         ii)Parantez ici
         iii)carpma/bolme
         iv) toplama/cikarma

         */
        int asciiG = 'G';
        System.out.println("asciiG = " + asciiG);

        int deger3=0;
        char smbl2 = '+';
        System.out.println("deger3+smbl2  = " + deger3+smbl2);// 0+ ==> Cünkü String 'in yanina yazdigimizdan direk yan yanayazdirir.
        System.out.println("deger3+smbl2  = " +( deger3+smbl2));// 43 ==>parantez icine aldik islem yapti


        String name="123";
        int number= 45;
        System.out.println(name + number);//12345  Concatination uc uca ekleme yan yana yazdirma


        String str1="Java";
        char ch3='G';
        int sayi1=5;
        System.out.println(str1+ch3+sayi1);//JavaG5
        System.out.println(str1+(ch3+sayi1));//Java76
        System.out.println(ch3+sayi1+str1);//76Java  //Önce matematik yapar sonra yan yana yazdirir.
                                                     //char i matematik islemine soktugumuz icin ascii degerini alir.

        String sayiStr="123";
        String sayiStr2="45";
        System.out.println(sayiStr+sayiStr2);//12345 //iki sayiyi yan yana yazrdirmak icin



        char rakam1 = '1';
        System.out.println("rakam1 = " + rakam1);//1

        char rakam2 = '2';
        System.out.println("rakam2 = " + rakam2);//2

        char rakam3 = '3';
        System.out.println("rakam3 = " + rakam3);//3

        char rakam4 = '4';
        System.out.println("rakam4 = " + rakam4);//4


        System.out.println("rakam4+rakam3+rakam2+rakam1 = " + rakam1+rakam2+rakam3+rakam4); //1234
        // "rakam4+rakam3+rakam2+rakam1"  STRING bir data oldugu icin yanindaki + islem yapmaz direk yan yana yazdirir.
        // gercekten toplamak istersek parantez icine aliriz böylece String ile birlesmez
        // ve toplamada ASCII degerleri sonucnu verir !!
        // Cünkü Javada char data type'ni matematiksel işlemlerde kullanirsaniz,Ascii table daki sayisal degerleri alir.

        System.out.println("rakam4+rakam3+rakam2+rakam1 = " + (rakam1+rakam2+rakam3+rakam4)); //202 Ascii toplami
        System.out.println(rakam1+rakam2+rakam3+rakam4); //202



        int rakam5 = '1'; //49
        System.out.println("rakam5 = " + rakam5);

        int rakam6 = '2'; //50
        System.out.println("rakam6 = " + rakam6);

        int rakam7 = '3'; //51
        System.out.println("rakam7 = " + rakam7);

        int rakam8 = '4'; //52
        System.out.println("rakam8 = " + rakam8);

        System.out.println("rakam5+rakam6+rakam7+rakam8 = " + rakam5+rakam6+rakam7+rakam8); //49505152
        System.out.println("rakam5+rakam6+rakam7+rakam8 = " + (rakam5+rakam6+rakam7+rakam8));//202


        ///******************* Ascii Degerlerinden Faydalanilarak Neler Yapilabilir ? *******************\\\\


        //ASCII degeri bulma
        int asciih = 'h';
        System.out.println("asciih = " + asciih); //104
        int ascii5 = '5';
        System.out.println("ascii5 = " + ascii5); //53

        byte b = 5;
        char ch2 ='h';
        System.out.println("b>ch2=" + (b>ch2)); //b>ch2=false   5>104 == false


        long l=542168784578L;
        System.out.println("ch2>l = " + (ch2 > l)); //false

        float f=2.45648f;
        double d= 2.19658;

        System.out.println("f>d = " + (f > d)); //true

        System.out.println("b<f = " + (b < f)); //false


        byte sayi3= 5;
        byte sayi4= 6;
        System.out.println("sayi3<sayi4:"+(sayi3<sayi4)); //true

        //sayi cinsinden olan datalari cok rahat kiyaslar ama biz sembol ya da harflerin kiyaslamsini yapmak istersek
        //o zaman ASCII degelrini kullaniriz.

        int sayiInt = 100;
        long sayiLong =100L;
        int sayiInt2 = 200;
        System.out.println("sayiInt<sayiLong= "+ (sayiInt<sayiLong)); //false
        System.out.println("sayiInt<sayiLong= "+ (sayiInt==sayiLong)); //true
        System.out.println("sayiInt2>sayiLong= "+ (sayiInt2>=sayiLong)); //true
        //Valuo direk matematiksek degeri burda valuo leri kiyasladik


        int sayiInt3 =9;
        char sayiChar ='9';

        System.out.println("sayiInt3>= sayiChar = " + (sayiInt3 >= sayiChar)); //false
        //cünkü 9 un ascii tablosundaki degeri farklidir
        //9==> 57 ASCII tabble

        String str = "9";
        String str2 = "9";
        // System.out.println("sayiChar>str = " + (sayiChar > str));
        //Bunu hesaplamya java izin vermiyor.

        String str3 = "Ahmet";
        String str4 = "Melih";
        // System.out.println("str3> str4 = " + (str3 > str4));
        //Bunu da kiyaslamaz cünkü STRING formunu resim olarak görür ve kiyaslamya almaz.

        //Sayilarin da ASCII TABLE da degerleri vardir.!!!!!

        //Ascii table daki degerlerini kiyaslamak istersek birinin sembol ya da harf olmasi lazim











    }
}
