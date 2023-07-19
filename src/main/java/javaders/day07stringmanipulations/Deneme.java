package javaders.day07stringmanipulations;

import java.util.Scanner;

public class Deneme {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lufen sifre giriniz");
        String pwd1 = input.nextLine();


        boolean sembolOlmali = pwd1.replaceAll("\\p{Punct}","").length()>0;
        System.out.println("sembolOlmali = " + sembolOlmali);

        
    }
}
