package javaders.day12switchloopsDT;

import java.util.Scanner;

public class Switch02HesapMak {

    public static void main(String[] args) {

        //Example 1:
        //Kullanicidan iki sayi ve yapilcak islemi alan ve +,-,*,/,% islemlerini yapan kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz..");
        double a = input.nextDouble();
        double b= input.nextDouble();   //2 sayi dedigi icin iki sefer sonuc aliyoruz!!

        System.out.println("Yapilca islemi giriniz.+,-,*,/,%'den birisini seciniz..");
        char opr = input.next().charAt(0);  //nextChar() diye bir sey yok bu yuzden girilen karakterin 0.indexi yani direk o karakteri aldik.

        switch (opr){
            case '+':
                System.out.println(a + " + " + b + " = " + (a+b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a-b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a*b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + (a/b));
                break;
            case '%':
                System.out.println(a + " % " + b + "=" + (a*b/100));
                break;
            default:
                System.out.println("Isleminiz tanimlanmamistir");

        }
    }
}
