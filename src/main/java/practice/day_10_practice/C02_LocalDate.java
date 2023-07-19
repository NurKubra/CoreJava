package practice.day_10_practice;

import java.time.LocalDate;

public class C02_LocalDate {
    public static void main(String[] args) {
         /*
        Ali 29.10.1923 tarihinden 45 yıl 8 ay 5 gun sonra dogdu.
        Veli  15.09.1993 tarihinden 24 yil 2 ay 11 gun once dogdu.
        Ali ve Veli'nin dogum tarihini hesaplayıp yazdırınız.
        Ali ve Veli'nin dogum tarihlerinin aynı olup olmadıgını kontrol eden kodu yazınız
         */

        LocalDate dogAli = LocalDate.of(1923,10,29).plusYears(45).plusMonths(8).plusDays(5);
        System.out.println(dogAli);
        LocalDate dogVeli = LocalDate.of(1993,9,15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println(dogVeli);
        if(dogAli.equals(dogVeli)){  //String yapida algiladigi icin equals kullandik

            System.out.println("Ayni tarihte dogmuslardir..");
        }else{
            System.out.println("Ayni tarihte dogmamislar..");
        }


    }
}
