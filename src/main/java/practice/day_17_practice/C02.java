package practice.day_17_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02 {

    /*
    Bir kod yazilirken olasi Exception'lari öngörüp exception olustugunda javanin ne yapmasini istedgimize karar vermeliyiz.
    1) Eger Exception olustugunda kodun calismya devam etmesini istemiyorsak ;
    method isminin yanina olusabilecek exception'i deklare ederiz.

    2)Eger Exception olussa da kodun calismya devam etmesini istiyorsak;
    sorun olusturabilecek kodu try blogunun icine yazmaliyiz
    catch bloguna ise exception durumunda javanin ne yapmasini istedigimizi yazmaliyiz.


    Exception'lar icin Parent-Child ilskisi mervcuttur. Eger bir kod icin birden fazla exception olusma ihtimali varsa
    öncelikle olasi Exception'lar parent child iliskisi tasiyor mu bakmamiz gerekir
    Eger Parent-Child ilskisi yoksa, istedigimiz sirada Catch cumleleri olusturabiliriz.
    Eger Parent-Child iliskisi varsa; sadece Parent Exception'i yazabilriz veya ikisini de yazmak istersek
    Child olani once Parent'i sonra yazmaliyiz.
     */

    // Bir tane txt dosyası olusturunuz.
    // txt dosyasının icerisine cumleler yazınız
    // Olusturdugunuz txt dosyasına ulasınız.
    // icerisindeki cumleleri yazdırınız
    public static void main(String[] args) {
        //once txt dosyasinin yolunu bulcaz
        //txt üzerinde "Copy/Path Reference" ==> sonrasinda "Path From Content Root" secip sonra olustururln String'e yapistirdik
        //FileInputStream ile
        //bu sirada CompileTime Error verir yani calismadan kirmizi cizgi
        //bu durumda exception'in nasil davrancagina biz karar verebiliriz.
        //Ve javanin verdigi CTE i javanin cozumu ile cozduk; yani exception ver (methodun yanina yazdik)==>  throws FileNotFoundException
        //ve bununla exception alidignda kod calismaya devam etmeyecek
        //ama exception verdiginde kodun calismasini istiyorsam ==> throws FileNotFoundException yerine try/catch ile cözüyoruz


        String dosyaYolu ="src/main/java/practice/day_17_practice/dosya.tt";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            //dosyadaki kelimelri okuyacak (harf harf)
            int k=0;
            while((k= fis.read())!=-1){  //orada bir harf var demek
                System.out.print((char)k); //k'yi harf harf yazdircagimz icin k'nin data turunu char olarak degistiridk
            }
        } catch (FileNotFoundException e) {   //dosya var mi yok mu diye bakiyor
          //  e.printStackTrace(); //Exception'i yazdir ama yoluna devam
            System.out.println("Yoluma devam ediyorum"); //ya da bunu yazdririp programi durdurmaz yani exception da vermez sadece bunu yazdirir

        } catch (IOException e) {  //read yazdigimizda okuyamazsam diye korkutugu icin baska bir try/cath daha ekledik
            e.printStackTrace(); //Exception'i yazdir ama yoluna devam
          //  System.out.println("Yoluma devam ediyorum");


            //ilk catch deki exception IOException'in child'i oldugu icin onu silsek de olur.Zaten ilk catch'in isini de yapar
            // daha detayli inceleme yapar
        }

    }
}
