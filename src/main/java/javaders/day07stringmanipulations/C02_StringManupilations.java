package javaders.day07stringmanipulations;

import java.util.Scanner;

public class C02_StringManupilations {

    public static void main(String[] args) {

        //Methodlari ayni satirda yan yana yazilabilir buna "Method Chain"(Method Zinciri) denir.
        /*
        Asagidaki kurallara gore kullanicinin girdigi Passwor'u kontrol ediniz

              1) En az 8 karakterden olussun
              2) Password'da bosluk(space) olmasin
              3) En az bir tane buyuk harf olsun
              4) En az bir tane kucuk harf olsun
              5) En az bir tane sembol olsun
              6) En az bir tane rakam olsun

         */


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen passwordunuzu "+
                        "\n1) En az 8 karakterden olussun"+
                        "\n2) Password'da bosluk(space) olmasin "+
                        "\n3) En az bir tane buyuk harf olsun" +
                        "\n4) En az bir tane kucuk harf olsun"+
                        "\n5) En az bir tane sembol olsun"+
                        "\n6) En az bir tane rakam olsun "+ "giriniz...");


        String pwd = input.nextLine();
        //1) En az 8 karakterden olussun
        boolean krktrSys = pwd.length()>7;
        boolean krktrSys2 = pwd.length()>=8;

        //boolean krktrSys = pwd.length()>7; sadece 1 islem yapmasi lazim bu yüzden bunu tercih ederiz
        //cunku java daha is yapmak ister

        //2) Password space icermesin
        boolean spaceOlmamali = !pwd.contains(" ");
        //" " = space karakteri icersin  !== icermesin

        //3)En az bir tane buyuk harf olsun
        boolean buyukHarfOlmali = pwd.replaceAll("[^A-Z]","").length()>0;
        //tum buyuk harfler disindaki datalar hiclikle silinir ve geriye kalan buyuk harf sayisi 0 dan buyuk yani
        //en az 1 olmalidir.

        //Methodlari ayni satirda yan yana yazilabilir buna "Method Chain"(Method Zinciri) denir.

        //4)En az bir kucuk harf olmali
        boolean kucukHarfOlmali = pwd.replaceAll("[^a-z]","").length()>0;

        //5)En az bir tane sembol olsun
        boolean sembolOlmali = pwd.replaceAll("[a-zA-Z0-9]","").length()>0;

        //boolean sembolOlmali = pwd.replaceAll("[^a-zA-Z0-9]","").length()>0; haric eklememiz gerekmez cunku
        //olmaisni istemedigimiz kisimlari zaten sil diya komut vermis olduk.

        //6) En az bir tane rakam olsun
        boolean rakamOlmali = pwd.replaceAll("[^0-9]","").length()>0;

        System.out.println("Password Gecerli mi? : "+ (krktrSys && spaceOlmamali && buyukHarfOlmali && kucukHarfOlmali &&
                sembolOlmali && rakamOlmali)); //Acd123?. ==> true
                                               //YUKSEK123 ==> false

        //&& ve kullandik cunku tum sartlari ayni anda karsilamali




    }//main

}
