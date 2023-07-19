package javaders.day05typecastingasciivaluestringmanipulations;

public class C01_MatematikselIslemler {

    /*
    - Java da farkli data type'larin arasinda islem yapiliyorsa sonuc buyuk olan data type'inin turunde olur.
    - Karsilastirma operatorlerinde sonuc hep boolean döner
    <  Kucuktur
    > Buyuktur
    == Esittir
    != Esit Degildir
    <= Kucuk esittir
    <= Buuyk esittir
    && and (ve) operatoru
    || or (veya) operatoru

     */


    public static void main(String[] args) {

        System.out.println(4*(5+2)/3);   //9

        //int/ int ==> olacagi icin 9.3333 yerine virgülden sonrasini
        //siler ve tamsayi kismini alir--> biz ekranda 9 rakamini goruruz.

        System.out.println(6*16/8);      //12  //direk sout'un icinde yazdirdigimiz icin sonuc int

        double sonuc = 4*(2+5)/3;                         //ONEMLIIII
        System.out.println("sonuc = " + sonuc);  //9.0    //int sayiyi int sayiya bolersek sonuc integer cinsinden verilir!!

        double sonuc2 = 4.0*(2+5)/3;
        System.out.println("sonuc2 = " + sonuc2); //9.3333  // 2 farkli data type i kullanildiginda
                                                            // double/int oldugu icin buyuk olanin cinsinden sonucu verir!!


        int sayi1 = 5;
        int sayi2=  2;
        double sayi3 = 2;

        System.out.println(sayi1/sayi2);  //--> 2 // normalde 2.5 ancak int/int =int olcagindan tam sayi kismini alir
                                                  // virgülden sonraki atilir.

        System.out.println(sayi1+sayi2/sayi3);  // 6.0


        boolean first = 2<4;
        boolean second = 2+6 !=8;
        boolean third = 2+3*5<20;

        System.out.println("first = " + first);  //true
        System.out.println("second = " + second); //false
        System.out.println("third = " + third);   //true


        System.out.println(first && second);  //false
        System.out.println(first || second || third); //true



    }
}
