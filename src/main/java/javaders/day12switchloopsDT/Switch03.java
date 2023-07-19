package javaders.day12switchloopsDT;

import java.util.Scanner;

public class Switch03 {

    public static void main(String[] args) {

        /*
            Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

            Kullanicidan bir ulke ismi aliniz. Alinan ulke adina gore kisaltmalari yaziniz.
         */

        Scanner input= new Scanner(System.in);
        System.out.println("Ulke adi giriniz..");
        String countryName = input.nextLine();  //toLowerCase 'i buraya da ekleyebiliriz ama girilen datayi direk degistirir.
                                                //Bu yüzden asagiya yazdirmak mantikli

        switch (countryName.toLowerCase()) {   //caseSentive yani buyuk kucuk harf duyarlidir

            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "india":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "spain":
                System.out.println("S");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "albania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("Bu ülke tanimli degildir..");
        }


    }
}
