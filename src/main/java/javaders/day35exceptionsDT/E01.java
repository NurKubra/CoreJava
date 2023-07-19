package javaders.day35exceptionsDT;

public class E01 {

    /*
    *"Exception" beklenmedik problem demektir. Java cozemedigi bir sorunla karsilastiginda Exception Class'I devreye girer
      Exception class'i bize karsilasilan sorunun cinsini, bu sorunun nereden kaynaklandigini ve sebebini verir.
    * Java Exception firlattiginda kodun calismasi durdurur. Java exception olusturuna kod icin bizden bir karar vermemizi ister
    * Eger hic bir sey yapmazsak beklendigi gibi kodumuzun calismasini durdurur.
    * - Kodumuzun calismaya devam etmesini istiyorsak try catch exception olusturmasi muhtemel kodlarimizi catch blogu icinde yazmaliyiz.
    * Exception i halledebilmke icin iki temel yol vardir;
       1) Exception a uygun cozumler uretebilirisniz. buna Exception Handling denir.
       2)Exception olustugunda bunu ilan eder ve geri cekilirisniz. Buna da "Throw Exception" denir.
    * Exception a uygun coumler uretmede "try catch" kullanilir, try block icinde yapilmasi gereken islemi Java'dan isteriz.
    * Eger java bu islemi sorunsuz bir sekilde yaparsa "catch block" devreye girmez.
    "try block" icerisinde eger bir "exception" olursursa "catch block" o zaman devreye girer, ve catch block icindeki kodlar calisir
    *"try block" icinde islem yapilirken "exception" olusursa "try block" icindeki exceptiondan sonraki kodlar calistirilmaz.
    * "catch" satirindeki parantez icine karsilasilmasi muhtemel olan exception class ismini ve bir obje ismi(e) yazariz.
    * if-else kullanirsak olusabilcek her problemi spesific olarak if parantezinin icine yazamiz gerekir.
      Bu da ciddi bir matematik bilgisi gerektirir
      ve yazacaginiz kodu cok uzatir. Ama try catch de java ilgili Exception ile alakali olusabilcek tum problemleri yakalar.

     */

    public static void main(String[] args) {
        divide(12,6);
        divide(12,0);
        divide2(3,0);
    }

    public static void divide(int a, int b){
        if(b==0){
            System.out.println("sayi sifira bolunmez");
        }else{
            System.out.println(a/b);
            System.out.println("divide methodu ici");
        }
    }

    //tavsiye edilmez
    public static  void divide2(int a, int b){
        //ArithmeticException yazdiginiz code da matematiksel islem kullaniyor iseniz alinabilecek bir exception dir.
        try{
            System.out.println(a/b);
            System.out.println("try-catch block ici");

        }catch (ArithmeticException e){
            System.out.println("sayi sifira bolunmez");

        }
        System.out.println("try catch ile handle edildi");
    }
}

