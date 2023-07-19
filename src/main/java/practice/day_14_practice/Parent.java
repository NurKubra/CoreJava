package practice.day_14_practice;

public class Parent {

    // Parent class'da isim, soyisim adında static variable olusturalım,
    // method1 ve method2 adında static methodlar olusturalım
    // yas adında instance variable olusturalım
    // method3 ve method4 adında instance methodlar olusturalım
    // olusturdugumuz variable ve methodları Child class'dan extends(inharitance) ederek cagıralım


    //static variablelar
    protected static String isim ="Ali";   //inheritance kullancagimiz icin protected yaptik
    protected static String soyIsim ="Can";


    protected static void method1(){
        System.out.println("parent static method1");
    }
    protected static void method2(){
        System.out.println("parent static method2");
    }




    //***********************  instance *************
    protected int yas =32;    //instance variable

    protected void method3(){
        System.out.println("parent instance method3");

    }
    protected void method4(){
        System.out.println("parent instance method4");
    }
}
