package javaders.day04memorykullanimiwrapperclass;

public class Runner04 {

    public static void main(String[] args) {

        //Önce Obje olusturuyoruz

        OgrenciEmrah ogrenci = new OgrenciEmrah();
        System.out.println("ogrenci.name = " + ogrenci.name);
        System.out.println("ogrenci.brans = " + ogrenci.brans);
        System.out.println("ogrenci.yas = " + ogrenci.yas);


        ogrenci.study();
        ogrenci.derseDevam();

    }

}
