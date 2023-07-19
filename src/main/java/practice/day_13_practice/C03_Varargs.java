package practice.day_13_practice;

public class C03_Varargs {
    public static void main(String[] args) {
    /*
    Kac tane kelime verilsin ?
    Iclerinden en uzun olani yazdiran bir method olusturun?(Varargs)
    Bu Methodun access modifier'ini default yapip ayni packagedaki farkli bir class'dan calistiriniz(ayni packagedaki butun classlardan ulasilabilir)
    Bu methodun acsess modifier'ini protected yapip farkli packagedaki bir classdan calistiriniz.(parent child ilskisi demek; farkli bir package dan cagrilabilir(parent-child ilskisi varsa))
    Bu methodun accses modifier'ini public yapip farkli bir packagedaki farkli bir classdan calistiriniz(her yerden ulasilabilir)

     */

        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Ahmet";
        String str4 = "Abdullah";
        String str5 = "Abdulrezzak";

        String sonuc = enUzunKelime(str1, str2, str3, str4, str5);
        System.out.println(sonuc);
    } //main

     public static String enUzunKelime(String... str) {  //birden fazla String gelcegi icin "String...str" yaptik => Birden fazla ayni data turune ait
        //datalari tek tek yazmamak icin Varargs kullaniriz.
        String enUzunKelime = "";

        for (String each : str) {
            if (each.length() > enUzunKelime.length()) {
                enUzunKelime = each;
            }
        }
        return enUzunKelime;

        //System.out.println(enUzunKelime);  //Abdulrezzak void olursa bu sekilde yazabiliriz

    }
}
