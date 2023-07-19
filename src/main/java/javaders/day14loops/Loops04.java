package javaders.day14loops;

import java.util.Scanner;

public class Loops04 {
    public static void main(String[] args) {

        //Kullanici username ve password'u girsin.
        //3 kereden fazla yanlis girerse "Hesabiniz bloke olmustur" mesaji alsin
        //3 kereye kadar yanlis girerse "Yanlis girdiniz tekrar deneyiniz" mesaji atsin
        //Dogru girerse "Hesabiniza hosgeldiniz" mesaji alsin


        Scanner input = new Scanner(System.in);

        int counter =0; //sayac
        String validUserName = "techpro123";
        String validPassWord = "Education12?";

        do{
            if(counter ==3){
                System.out.println("Hesabiniz bloke oldu /Your account was bloked");
                break;
            }
            System.out.println("Please enter your username");
            String userName = input.next();
            System.out.println("Please enter your password");
            String passWord = input.next();
            counter++;

            if(userName.equals(validUserName) && passWord.equals(validPassWord)){
                System.out.println("Hosgeldiniz / Welcome to your account");
                break;
            }else {
                System.out.println("Yanlis girdiniz tekrar deneyiniz / Invalid username or password, try again");
            }

        }while(true);

    }
}
