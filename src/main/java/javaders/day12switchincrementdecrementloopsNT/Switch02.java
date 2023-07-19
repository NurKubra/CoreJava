package javaders.day12switchincrementdecrementloopsNT;

import java.util.Scanner;

public class Switch02 {

    public static void main(String[] args) {

        //Dinamik kod olmasi icin farkli yollar kullandik.
        /*
        Kullanicidan aldiginiz character'in sesli harf olup olmadigini kontrol eden kodu yaziniz.
        sesli harf ==> a,e,i,o,u
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter");
        char letter = input.next().charAt(0);

        //1.Way
        switch (letter){  //tek bir kod bir cok ihtimal icin caliscaksa bu sekilde yazilir.
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(letter +" is a vowel");
                break;
            default:
                System.out.println(letter +" is not a vowel");

        }

        //2.Way:
        System.out.println("Please enter a letter");
        String letter2 = input.next().substring(0,1).toLowerCase(); //ilk harfi String olarak verir
                                                                    // ve elimizde String oldugu icin toLowerCse kullanilabilir.
                                                                    //Ve Case'leri String e cevirmeliyiz.
        switch (letter2) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":

                System.out.println("It is a vowel");
                break;
            default:
                System.out.println("It is not a vowel");
        }

        //3.Way:
        System.out.println("Please enter a letter");  //kisa kod makbuldur fakat istenileni vermek daha önmeli yani kod uzayabilir.
        String letter3 = input.next().substring(0,1); //toLowerCase kaldirdik

        switch (letter3) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":

                System.out.println(letter3+ " is a vowel");  //DINAMIK kod yapmak icin letter3 ekledik!
                break;
            default:
                System.out.println(letter3+ " is not a vowel");
        }

    }
}
