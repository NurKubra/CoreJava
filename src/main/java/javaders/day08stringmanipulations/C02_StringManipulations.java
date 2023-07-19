package javaders.day08stringmanipulations;

import java.sql.SQLOutput;

public class C02_StringManipulations {

    public static void main(String[] args) {
        
        //********* replaceFirst() ************\\

        /*
        replace () ile ayni isi yapiyor ancak ilk gordugu datayi degistiriyor
         */
        String str ="Hayirli Olsunda ";


        //Example : str Stringindeki ilk görünen a harfini e harfi ile degistiriniz.(ilk gördugu a'yi e yapar!!)
        String strReplaceFirst =str.replaceFirst("a","e");
        System.out.println("strReplaceFirst = " + strReplaceFirst); // s = Heyirli Olsunda

        System.out.println(str.replaceFirst("a","e")); //Heyirli Olsunda

        // Ilki tercih edilmeli !! Yani baska bir konteynra alip islem yaptiktan sonra sonucu yazdirmak
        //parantez cileri olabildiignce sade olmali


        String str3 = "Bizimle Java Ogrenmek Cok Kolay";

        //Example :str3 Stringindekki "i" harflerinin yerine "e" harfi yerlstiriniz.
        String replaceFirst = str3.replaceFirst("i","e");
        System.out.println(replaceFirst); // Bezimle Java Ogrenmek Cok Kolay

        String replace = str3.replace("i","e");
        System.out.println(replace); // Bezemle Java Ogrenmek Cok Kolay





        //********* trim() ************\\
        /*
        trim()
        bir String deki basinda ve sonundaki space karakterlerini siler.
        Aradaki spacelere dokunmaz. Saclar icin uclarindan kiriklarinin aldirilmasi gibi
        Cümledeki spacelerin silinmesi
         */

        //Example : str String`'indeki bas ve sonda varsa space karakterlerini siliniz.

        String str2 ="       Ali Can     ";
        System.out.print(str2);
        System.out.println("*******");  //       Ali Can     *******
        //ln' i sildik cunku yan yana yazdirip bakmak istedik

        String strTrim = str2.trim();
        System.out.print("strTrim = " + strTrim);
        System.out.println("*******");  //Ali Can*******

        //Example : Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz
        //String tv = 599.99$   String laptop = 299.99$
        String tv ="599.99$";
        String laptop ="299.99$";

        //öncelikle dolar isaretinde kurtulmak lazim
        String tv2 = tv.replace("$","");
        System.out.println("tv2 = " + tv2);  //599.99

        String laptop2 =laptop.replace("$","");
        System.out.println("laptop2 = " + laptop2);  //299.99

        //replaceAll() da daha cok datayi degistirmek icin kullanilir

        //int ya da sayi degiller o yüzden toplanmazlar concat yapar yanyana yazdirir (resim gibi görüyor)
        System.out.println("tv2+laptop2 = " + tv2 + laptop2);  //599.99299.99

        //valueOf() Methodu bize String olan datayi sayi haline getirir.
        Double totalPreis = Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println("totalPreis = " + totalPreis);      //totalPreis = 899.98
        //Methodlarindan yararlanamabilmek icin Double in wrapper ini kullandik.


        //******** split()[]*******\\\\
        //split metodu, böl ve istediğin indexi al.
        //split(" ")[1].charAt(0) //BOSLUKTAN BOL VE 1. INDEKSI AL

        //Example : Verilen ismin ilk ismini ilk harfini
        //ve soyisminin ilk harfini ekrana yazdiriniz   // ==> MF

        String tamIsim = "   mehmet fatih   ";

        //Once bastaki ve sondaki boslukalri sil
        char first = tamIsim.trim().toUpperCase().charAt(0);
        System.out.println("first = " + first);  //M

        char second = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0); //Bosluktan böl dedigimiz icin " "koyduk.
        System.out.println("second = " + second);  //F
        System.out.println("Ilk ve son Harf = " + first + second); //soutv seklinde ascii degerlerini toplmasini önledik


        // Ikinci yol olarak
        String tamIsim2 = tamIsim.trim().toUpperCase().substring(0,1);
        System.out.println(tamIsim2); //M
        String tamIsim3 = tamIsim.trim().toUpperCase().substring(7,8);
        System.out.println(tamIsim3); //F
        System.out.println(tamIsim2+tamIsim3); //MF

        //Eger 3 kelimeli olursa
         String TamIsim = "  mehmet fatih yildirim ";
         char first2 =TamIsim.trim().toUpperCase().charAt(0);
         char second2 =TamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
         char third2 =TamIsim.trim().toUpperCase().split(" ")[2].charAt(0);

         System.out.println("Bas harfler yazdir:"+ first2+second2+third2); //MFY






    }
}
