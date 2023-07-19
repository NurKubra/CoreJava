package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {

    public static void main(String[] args) {
        /*
        Kullanicdan bir sayi aliniz, o sayi pozitif ise ekrena "Pozitif" yazdirin,
        degilse ekrana "Pozitif Degil" yazdirin
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();
        //1.yol
        if (num>0){
            System.out.println("Positiv");
        }else if (num<0){
            System.out.println("Positiv degil");
        }else {
            System.out.println(" ");
        }
        //2.yol

        String result  =num>0 ? "Positiv" : "Positiv degil";
        System.out.println(result);


    }
}
