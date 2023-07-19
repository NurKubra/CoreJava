package javaders.day08stringmanipulations;

import java.util.Scanner;

public class C01_StringManipulations {

    public static void main(String[] args) {

        //sembol ile noktalama isaretleri farklidir.
        //space noktalama degildir!!

        /*
        Kullanicidan email adresini girmesini isteyin. Asagidaki kurallar göre kullanicinin
        girdigii email adresini kontrol ediniz:
            i)mail adresi "@gmail" icermeli
           ii)Space characteri mail'de olmamali
           iii)mail adresinde buyuk harf olmamali
           iv)En az bir tane noktalama isareti bulunmali

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen mail adresinizi \n" +
                "i)mail adresi \"@gmail\" icermeli\n" +
                "ii)Space characteri mail'de olmamali\n" +
                "iii)mail adresinde buyuk harf olmamali\n" +
                "iv)En az bir tane noktalama isareti bulunmali giriniz...");

        String mail= input.nextLine();

        //i)mail adresi "@gmail" icermeli  (meli,mali  ==> Contains)
        boolean first = mail.contains("@gmail");
        System.out.println("@gmail Iceriyor mu = " + first);

        //ii)Space characteri mail'de olmamali
        boolean second = !mail.contains(" ");
        System.out.println("Space Iceriyor mu= " + second);

        //iii)mail adresinde buyuk harf olmamali
        //1.yol
        boolean UpperCaseNot = mail.replaceAll("[^A-Z]","").length()==0;
        System.out.println("BuyukHarf iceriyor mu= " + UpperCaseNot);
        //2.yol
        boolean third = mail.replaceAll("[a-z0-9]","").
                replaceAll("[\\p{Punct}]","").
                replaceAll(" ","").length()==0;

        System.out.println("Buyuk harf Iceriyor mu = " + third);

        //boolean third = !mail.contains("[A-Z]");
        //System.out.println("Buyuk Harf Iceriyor mu= " + third);   ==> Contains Methodu regex karakterler dogru calismaz
        // bu yüzden replace ile silme yapip geriye kalanlarin length() bakilir.

        //iv)En az bir tane noktalama isareti bulunmali
        //1.Yol
        boolean fourth = mail.replaceAll("[^\\p{Punct}]","").length()>1;
        System.out.println("Noktalama iceriyor mu = " + fourth);
        //Bu yolda @' noktalama isareti olarak görüyor nokta silinmasine ragmen true dönüyor o yuzden tercih etmiyoruz!

        //2.Yol
        boolean fourth2 = mail.replaceAll("[a-zA-Z0-9]","").
                replaceAll(" ","").length()>0;
        System.out.println("fourth2 = " + fourth2);
        //3.Yol
        boolean fourth3 = mail.replaceAll("^[^\\W]","").length()>0;
        System.out.println("fourth3 = " + fourth3);

        System.out.println(first && second && third && fourth);
       /* Noktalama Isaretleri :
        17 noktalama işareti var. Bunlar; nokta, virgül, noktalı virgül, iki nokta,
                üç nokta, soru işareti, ünlem işareti, kısa çizgi, uzun çizgi, eğik çizgi, ters eğik çizgi,
        tırnak işareti, tek tırnak işareti, denden işareti, yay ayraç, köşeli ayraç, kesme
        */

        String str = "Burada bir gariplik var .?-!";
        System.out.println(str.replaceAll("[^\\p{Punct}]","")); //.?-!





    }
}
