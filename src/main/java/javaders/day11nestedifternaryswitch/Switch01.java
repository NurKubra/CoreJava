package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        /*
        Kullanicidan gün isimlerini aliniz, o gunun kacinci gun oldugunu ekrana yazdiriniz.
        Sunday ==>1 Monday ==>2
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day name..");
        String dayName = input.next();

        //1.Way
        if(dayName.equalsIgnoreCase("Sunday")){
            System.out.println("Sunday is the first day");
        }else if (dayName.equalsIgnoreCase("Monday")){
            System.out.println("Monday is the second day");
        }else if (dayName.equalsIgnoreCase("Tuesday")){
            System.out.println("Tuesday is the third day");
        }else if (dayName.equalsIgnoreCase("Wednesday")){
            System.out.println("Wednesday is the fourth day");
        }else if (dayName.equalsIgnoreCase("Thursday")){
            System.out.println("Thursday is the fifth day");
        }else if (dayName.equalsIgnoreCase("Friday")){
            System.out.println("Friday is the sixth day");
        }else if (dayName.equalsIgnoreCase("Saturday")){
            System.out.println("Saturday is the seventh day");
        }else {
            System.out.println("Invalid day name");
        }

        //2.Way
        switch (dayName.toLowerCase()){    //daha clean bir kod icin 2 den fazla durum oldugunda switch yazmak tavsiye edilir.
            case "sunday":  //dayName sunday olamsi durumunda degistir demek.
                System.out.println("Sunday is the first day");
                break;     //cik disari demek gibi skop disina yani en alttaki süslü parantez disina
            case "monday":
                System.out.println("Monday is the first day");
                break;
            case "tuesday":
                System.out.println("Tuesday is the first day");
                break;
            case "wednesday":
                System.out.println("Wednesday is the first day");
                break;
            case "thursday":
                System.out.println("Thursday is the first day");
                break;
            case "friday":
                System.out.println("Friday is the first day");
                break;
            case "saturday":
                System.out.println("Saturday is the first day");
                break;
            default:                                             //default else ile ayni isi yapar degilse anlaminda
                System.out.println("Invalid day name");
                break; //olsa da olur olmasa da olur
        }
        //switch = degis demek, case olay-durum demek
        //Sunday olma durumunda bunu yazdir. Sonra birak (break)

        //If ile yaparsak Javanin String Class 'a gitmesi lazim daha cok is yapiyor.
        //If else if de max 3 durumda kullanirlar. Daha fazlaysa switch kullanirlar
        //switch de buyuk kucuk harf duyarli yani buyuk ya da kucuk harf girilmeli
        //dayName toLowerCase yaptik boylece buyuk kucuk harf duyarsiz hale getirdik.







    }
}
