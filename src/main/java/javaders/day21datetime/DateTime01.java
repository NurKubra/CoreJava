package javaders.day21datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

    // Not : Application'lar "stand alone" olmalidir !!! Kendi basina calisabilir demek baska bir app e bagli kalmadan
    public static void main(String[] args) {

        //Anlik zamani nasil aliriz?
        LocalTime myCurrentTime = LocalTime.now();//class ismiyle cagirdigimiz icin static
        System.out.println(myCurrentTime);    //19:03:24.989492

        //Anlik zamanda bilesenler nasil alinir?
        int saat = myCurrentTime.getHour();
        System.out.println(saat);          //19

        int minute = myCurrentTime.getMinute();
        System.out.println(minute);

        int second= myCurrentTime.getSecond();
        System.out.println(second);

        int nano = myCurrentTime.getNano();
        System.out.println(nano);    //750953800  Nano saniyesi

        //Gelecek ve gecmis zaman nasil alinir?
        LocalTime next = myCurrentTime.plusMinutes(23).minusSeconds(11);  //23 dakika ekledik ve 11 saniye cikardik
        System.out.println(next);

        //Zaman formati nasil degistirilir?
        //"HH" 24'luk saat sistemini, "hh" 12'lik saat sistemini kullanir.
        //"hh.mm a" ifadesindeki "a" 12'lik saat sisteminde "AM" , "PM" yazilmasini saglar
        //"ss" saniyeyi gösterir.
        //"mm" "minute" demek. "MM" olursa "month" demektir.
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH.mm");  //olmasini istedigimiz formata cevirir.
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh.mm");
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh.mm a");
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("hh:mm:ss a");

        String formattedMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);   //19.20

        //Date formati nasil degistirilir?
        LocalDate myCurrentDate = LocalDate.of(2022,8,25);   //static class ile cagrildigindan
        System.out.println(myCurrentDate);  //2022-08-25

        //Tarihi ay/Gun/Yil sekline ceviriniz
        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyCurrentDate = dtf6.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate); //08/25/2022

        //Tarihi Gun/Ay isminin ilk 3 harfi/yil sekline ceviriniz. 25/Aug/22

        DateTimeFormatter dtf7= DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyCurrentDate2 = dtf7.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate2);  //25/Aug./22

        DateTimeFormatter dtf8 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedMyCurrentDate3 = dtf8.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate3);  //25/August/2022


        //Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        //Tokyo'da ayin kaci?
        LocalDate dateInTokya = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokya); //2023-03-17

        //Tashkent'de ayin kaci ?
        LocalDate dateInTashkent = LocalDate.now(ZoneId.of("Asia/Tashkent"));
        System.out.println(dateInTashkent);  //2023-03-16

        //Tokyo'da saat kac ?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);  //03:46:45.074788200

        //Berlin de saat kac?
        LocalTime timeInBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInBerlin);//19:52:19.433288





    }
}
