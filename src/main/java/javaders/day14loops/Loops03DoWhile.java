package javaders.day14loops;

import java.util.Scanner;

public class Loops03DoWhile {

    public static void main(String[] args) {

        int i=1;
        while (i<1){  //while loop da loop body sinin hic calismamasi mumkundur (Zero execution is posssible).
            System.out.println("while loop");  //bunu yazdirmaz  //once kontrol eder sonra calistirir.
            i++;
        }

        //do-while-loop
        int k=1;
        do { //note: loop'da loop body si en az bir kez calisir
            System.out.println("do-while loop");  //bunu yazdirir  //Önce kod calisir sonra kodu kontrol eder!!
            k++;
        }while(k<1);

        //mayin oyununda once basilir kod calsiir sonra mayin var mi diye kontrol edilir!!
        //oyunlarda kullanilir genellikle

        //hata yapma riski veriyorsak kullaniciya,

        //Example : Kullanici bir sayi girsin, sayi 100 den kucuk ise kullanici "Kazandiniz" mesaji alsin
        //diger durumlarda "Kaybettiniz" mesaji alsin.


        Scanner scan = new Scanner(System.in);
        //System.out.println("Please enter an integer");
        //int n = scan.nextInt();  ==> bu islemi her seferinde tekrar etmesi icin body icine yazdik

        do{
            System.out.println("Please enter an integer");
            int n = scan.nextInt();
            if(n<100){
                System.out.println("Won!");  //bu kod false oldugunda else calisir ve kod calismayi break ile durdurur
                                             //break yazmaysak mayin patlayinca da oynamya devam edilir
            }else {
                System.out.println("Lost!");
                break;
            }
        }while(true); //true yazdik cunku break olmadigi surece kod calismali

        //burdaki true bizim increment/decrement i cunku true sonucu almaya devam ettikce kodu calistirmaya devam edebilirz
        //true yazarak sonsuza kadar calistirma ozelligi ekledir ,loop kirilmadigi sürece

        //for ile yapilan hersey while ile yapilir
        //while ile yapilan hemen hemn hersey de do-while ile yapilir



        //Example : Kullanicidan alinan bir cumlenin buyuk harfle baslayip nokta ile bittigini kontrol eden kodu yaziniz

        scan.nextLine();  //extra ekledik tam cumle alabilmek icin !!

        do{
            System.out.println("Please enter a sentence");
            String s =scan.next();

            if(s.endsWith(".") && (s.charAt(0) >='A' &&  s.charAt(0)<= 'Z')) {
                System.out.println("Your sentence is correct grammatically");
            }else
                System.out.println("Your sentence has grammatical mistake");
                break;
        }while(true);

        scan.close();
    }
}
