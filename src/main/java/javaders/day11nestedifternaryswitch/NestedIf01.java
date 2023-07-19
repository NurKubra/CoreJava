package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class NestedIf01 {

    public static void main(String[] args) {

        /*
        Kullanicidan =0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
        Eger calisan kadinsa 60 dan buyukse "Emekli Olabilir" yazdirin
        Eger calisan erkek ise 65 yasindan buyukse "Emekli olabilir" yazdirin
         */

        /*
        1)"If" icinde "if" kullanirsaniz "Nested if" olusturmussunnuz demektir.
        2)"Nested if" Javayi yavaslatir bu yüzden mecbur kalmadikca kullanmayiz
        3)"Nested if" gibi Javayi yavaslatan kodlar "Time Consuming" olarak adlandirir...>  Zaman emici.
         */
        //if yapisinin icine baska bir if yapisi girerse buna "Nested if" denir. (ic ice koyulan sehpalara ested table denir)
        //Javada nested if kullanmak tavsiye edilmez; cunku nested yapilar cok zaman harcar ve javayi yavaslatirlar yani App'i.


        Scanner input = new Scanner(System.in);  //Scanner class'i
                                                 //input varibable'inin data type'i Scanner
                                                 // new ile yeni obje Scanner(constrakter) ile insa edilir.
        System.out.println("Please enter your age..");
        int age = input.nextInt();

        System.out.println("Please enter your gender.."); //male, female
        String gender = input.next();

        if(age<0 || age>120){
            System.out.println("Negative ages or ages greater than 120 are invalid");

        }else if(gender.equalsIgnoreCase("male")){  //female girdginde false olur ve bu kod calismaz direk asagidakine gecer
            if(age>65){
                System.out.println("Can be retired");
            }else {
                System.out.println("Should work");
            }

        }else if(gender.equalsIgnoreCase("female")){   //equals iki tane String esitlemek icin kullanilir
            if (age>60){
                System.out.println("Can be retired");
            }else {
                System.out.println("Should work");
            }

        }else{
            System.out.println("Undefined gender");  //cinsiyet icin trans yazarsak bu sekilde yazdirir.
        }
        //kod yazmak icin once okuyabilmek lazim
        //equalsIgnoreCase buyuk kucuk harf umursamadan iki String data kiyaslamak icin
        //yani --> male=MALE =MaLE
        //bu yüzden burda equalsIgnorCase tercih ederiz





    }
}
