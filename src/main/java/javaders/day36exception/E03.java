package javaders.day36exception;

public class E03 {

    /*Interwiev sorusu ;
    "throws" ile "throw" arasindaki farklar nelerdir?
    1) "throws" method signature satirinda kullanilir, "throw" is method body icinde kullanilir.
    2) "throws" method signature satirinda bir ya da birden cok "Exception" ile bir kere kullanilir
       "throw" ise method body icinde bir tane Exceptio ile tekrar tekrar kullanilabilir.
    3) "throws" dan sonra sadece Exception Class isimleri yazilir,
       "throw" dan sonra Exception Class'dan object olusturulur.

     */
    public static void main(String[] args) {

        //Example 1: Kullanicidan alina yas'i console yazdiran methodu olsuturunuz
        printAge(23);
        try {
            printAge(-12);
        }catch(IllegalArgumentException e){
            System.out.println("Negative aages are not valid");

        }
    }
    public static void printAge(int age){
        System.out.println(age);
        if(age<0){
            throw new IllegalArgumentException("Used negative integers for ages");  //method olusturuken istedigimiz durumlar icin Exception olusturabiliriz.

        }
        System.out.println(age);
    }
}
