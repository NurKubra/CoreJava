package practice.deneme;

import practice.day_13_practice.C03_Varargs;

public class Den2_C03_Varg extends C03_Varargs {
    public static void main(String[] args) {
        //day13 C03 deki soru; acsess modifier protected yaptik
        //Bu iki class arasinda parent-child iliskisi olmali

        String ad1 ="Cihan";
        String ad2= "Suleyman";

        System.out.println(C03_Varargs.enUzunKelime(ad1, ad2)); //Suleyman
        //parent -child iliskisi oldugu icin Class ismi yazmadan da methoda ulasabiliriz
        System.out.println(enUzunKelime(ad1, ad2)); //Suleyman

    }
}
