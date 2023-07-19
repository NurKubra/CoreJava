package javaders.day02printmethodcreation;

public class MethodCreation {

    public static void main(String[] args) {

        //static ==> protokol tribünü vip class

        //Karenin alanini veren kodu yaziniz.
        kareninAlani(7);   //sonuca 2 ekleyemeyiz cünkü sout ve sonucla islem yapilamaz.

        /*NOT:return type void oldugunda dondurdugu her hangi bir deger olmadigi icin
        sadece ekranda bastirdigi icin; ekleme cikarma ya da method kullanma vs.
        hic bir islem yapamayiz.
        Method sonucunda ortaya cikan datayi kullanamayiz. Sadece ekranda goruruz.
        TV ekraninda elmalari gorup elmali pasta yapamamiz gibi...*/

        //Dikdörtgenin alanini veren kodu yaziniz.

        System.out.println("Dikdörtgenin alani:"+ (dikdörtgeninAlani(10, 20)+2));
        //sonucla islem ypilanilir mesela 2 eklenebilir.

        /*return type'i int oldugu icin bir deger dondurur.Ve bu degeri biz kullanabiliriz.
        Method kullanabiliriz.
        Ekleme cikarma carpma bolme istedigimiz gibi elde edilen datayi kullanabiliriz.. */

    }
    private static void kareninAlani(int a) {
        System.out.println("Karenin Alani:" + (a*a));

    }
    private static int dikdörtgeninAlani(int a, int b) {   //void degil bu sefer int yaptik

        return a*b;                                        //carpmanin sonucunu kullaniciya verdim

    }




}
