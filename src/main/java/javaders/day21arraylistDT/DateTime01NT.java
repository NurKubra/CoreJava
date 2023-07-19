package javaders.day21arraylistDT;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01NT {

    //Application larda kim ne zaman datalarda degisiklik yaptiysa gun-saat-saniye olarak kayit yapilir.(dijital iz)
    //Datetime ülkeye gore farkeder. Buyüzden LocalDate ya da Local

    public static void main(String[] args) {

        //Icinde bullunduugmuz aktuel tarihi(now) aliriz. Interneti kapatsak da kod calisir.(lokal bilg. dan bilgiyi alir)
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);  //2023-03-16

        //Tarihten istedigimiz bileseni nasil aliriz?
        int monthValue = myCurrentDate.getMonthValue(); //non-static
        System.out.println(monthValue);  //3

        int yearValue = myCurrentDate.getYear();
        System.out.println(yearValue);  //2023

        int dayValue = myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);  //16

        //Asagidaki month bir Enum'dir.
        //Enum Java da sabit degerleri(Ay isimleri, gun isimleri, ulkdedeki sehir isimleri,gezegenler) depolamak icin kullanilir.
        //Ya da App icinde sabit datalari depolamak icin kullanilir.
        //App google ya da baska app lere bagli olmasin diye Java icinde sabit datalar var olmali bunlari Enum larla depolariz
        Month monthName =  myCurrentDate.getMonth();
        System.out.println(monthName);  //MARCH

        //Asagidaki "DayOfWeek" bir Enum'dir.
        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println(dayName);

        //Ileriki tarihe nasil gidilir?
        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(4));
        //simdiki tarihe 5 gun,2 ay ve 4 yil ekle

        //Gecmis tarihe nasil gidilir?
        System.out.println(myCurrentDate.minusYears(30).minusMonths(2).minusDays(18));
        //simdiki tarihten 30 yil,2 ay ve 18 gun geri gitme

        //Specific bir tarih objesi nasil olusturulur?
        LocalDate gokhanDob= LocalDate.of(1986,6,10);  //clasin ismiyle of methoduna ulasiyorsak ==> static'tir!!
        LocalDate fatihDob= LocalDate.of(1985,3,25);

        //Bir tarihin bir tarih'ten sonra olup olmadigi nasil kontrol edilir?
        boolean r1 = gokhanDob.isAfter(fatihDob);
        System.out.println(r1);//true

        //Bir tarihin bir tarih'ten once olup olmadigi nasil kontrol edilir?
        boolean r2 = fatihDob.isBefore(gokhanDob);
        System.out.println(r2);// true

        //Bir tarihin bir tarih'e esit olup olmadigi nasil kontrol edilir?
        boolean r3 = gokhanDob.isEqual(fatihDob);
        System.out.println(r3);// false

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year, month, and day numbers in the given order");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year, month, day);

        if(givenDate.isBefore(LocalDate.now())){
            System.out.println(givenDate + " invalid date");
        }else{
            System.out.println("Enter time for the ticket");
        }

        int lengthOfMonth = myCurrentDate.lengthOfMonth();  //ayin kac gun oldugunu
        System.out.println(lengthOfMonth);

        //Example 2: Kullanicinin girdigi tarihin gun ismini bulan kodu yaziniz.
        System.out.println("Please enter year, month, and day numbers in the given order");
        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate date = LocalDate.of(y, m, d);

        System.out.println(date.getDayOfWeek());

    }
}
