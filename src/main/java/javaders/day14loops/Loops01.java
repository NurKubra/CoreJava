package javaders.day14loops;

import java.util.Scanner;

public class Loops01 {
    public static void main(String[] args) {
        //Example 1:Kullanicidan alinan bir tamsayinin tekrarsiz rakamlarinin toplamini bulunuz
        //1838 ==> 1+3 =4

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer...");
        String s = scan.next();   //bilerek String kullandik cunku lastIndexOf ve indexOf methodu kullanmak istiyoruz.
                                  //sayi olarak versede kullanici String sekilde yazdirmak problem olmaz

        int sum =0; //cikan sonuclarin toplamini koyduugmuz konteynr!!! Yeni bir datayi memory e koymak icin

        for (int i=0; i<s.length(); i++){
            String d = s.substring(i,i+1);
            if (s.indexOf(d)==s.lastIndexOf(d)){  //s.indexOf(d)!=s.lastIndexOf(d) olursa tekrar eden sayilari toplar!!
                sum = sum + Integer.valueOf(d);   //String ifadeleri integer yapar!! string 1 'i integer 1 e cevirdik
            }
        }
        System.out.println(sum);






        //Example 2:Bir String deki tekrarli karakterleri ekrana yazdiran kodu yaziniz.
        //Alala  ==> la

        String t="Alala";
        String sonuc="";
        for (int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(t.indexOf(ch)!= t.lastIndexOf(ch)){

                sonuc = sonuc + ch;   //ilk olusturdugumuz bos string deki "" ile char sonuclar birlesince concatination dan dolayi
                                     //sonuc String olur ve yan yana yazdirilir.
            }
        }
        System.out.println(sonuc); //lala




        String t1="Alala";
        String sonuc1="";
        for (int i=0; i<t1.length(); i++){
            char ch1 = t1.charAt(i);
            if((t1.indexOf(ch1)!= t1.lastIndexOf(ch1)) && !sonuc1.contains(""+ch1)){  //""+ch1 concatinationdan String hale getirir.
                // sonuc1 in icinde ilk seferden l vardir fakat bu kodla l yoktur diyerek false sonuc verir bu sayede 2. kez "la" yazdirmaz!

                sonuc1= sonuc1+ ch1;   //ilk olusturdugumuz bos string deki "" ile char sonuclar birlesince concatination dan dolayi
                //sonuc String olur ve yan yana yazdirilir.
            }
        }
        System.out.println(sonuc1); //la ==> && ekldik bu sayede 2 sefer lala yazmak yerine la yazdirdik!



        //JAVA ÖGRENME
        //What ?
        //Why?
        //Simple Implementation
        //Mid level Implementation
        //Advanced level Implementation
        //Mini Project


    }
}
