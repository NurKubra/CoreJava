package javaders.day07stringmanipulations;

import java.util.Scanner;

public class C02StringManupilationNT {

    public static void main(String[] args) {

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
        boolean karakterSayis = pwd.length()>=8;
        boolean karakterSayisi= pwd.length()>7;  //Daha cabuk döndürdügü icin bunu tercih ediyoruz.

        //2) Bosluk icermesin
        boolean boslukVarMi = !pwd.contains(" ");

        //3)En az bir tane buyuk harf olsun
        boolean buyukHarfOlmali = pwd.replaceAll("[^A-Z]","").length()>0;
        //Contains ile calisir mi dene ??

        //4)En az bir tane sembol olsun
        boolean kucukHarfOlmali = pwd.replaceAll("[^a-z]","").length()>0;

        //5)En az bir tane sembol olsun
        boolean sembolOlmali = pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        // sembol harici herseyi sil
        //6)En az bir tane rakam olsun
        boolean rakamOLmali = pwd.replaceAll("[^0-9]","").length()>0;







    }
}
