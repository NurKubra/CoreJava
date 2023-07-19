package javaders.day12switchincrementdecrementloopsNT;

public class Switch01 {

    //Example : Ay numarasi verildiginde numarasi verilen ay'in ismini ve December'a kadar tum
    // aylarin isimlerini consol'a yazdiran kodu yaziniz.
    /*
    Note: Switch parantezi icinde "String", "int", "byte", "short" ve "char" kullanilabilir.
          "boolean", "float", "double","long" kullanilmaz. Memory'iyi korumak icin Java long'u yasaklamistir.
          switch icinde max 2 milyar durum..
     */

    public static void main(String[] args) {

        int monthNumber = 3;
        switch (monthNumber){
            case 1:
                System.out.println("January");
               // break;
            case 2:
                System.out.println("February");
                //break;
            case 3:
                System.out.println("March");
                //break;
            case 4:
                System.out.println("April");
                //break;
            case 5:
                System.out.println("May");
                //break;
            case 6:
                System.out.println("June");
                //break;
            case 7:
                System.out.println("July");
                //break;
            case 8:
                System.out.println("August");
                //break;
            case 9:
                System.out.println("September");
                //break;
            case 10:
                System.out.println("October");
                //break;
            case 11:
                System.out.println("November");
                //break;
            case 12:
                System.out.println("December");
                break;
            default:
            System.out.println("Invalid month number");
        }
     //Eger sadece bir ay yazdirmak istersek her adimda break kullanilmali
     //Belli bir aydan itibaren yazdircaksak break'ler kaldirilir.
    }
}
