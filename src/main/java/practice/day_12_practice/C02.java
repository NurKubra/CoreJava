package practice.day_12_practice;

public class C02 {

    //Kod blogu okuma alistirmasi 2

    /*
    Ilk basta class seviyesinde olusturulmus hem de static olmayan instance variable'lar atadik.
    Main de kod okumaya basliyoruz. Ilk olarak obj1 objesi olusturarark ==> ilk asamada olusutrulan
    instance variable'lari default degerleri ile birlikte obj1'e bagladik.
    isim= null, yas= 0, telefon= null
    Olusturduugmuz obj1 parametrli bir cont sahip bu yuzden parametreli olan cont. gider ve yaninda
    atanan degerleri götürür.
    Boylece yeni atadigimiz degerleri cont. icinde guncellemis olduk.
    isim= Burak, yas=32, telefon=null (==> deger atamadigimiz icin null olarak kaldi) oldu.

    Not ; char default degeri==> hicliktir

     */

    String isim;  //static ve instance variable'lara deger atamasi yapmmak zorunda degiliz. Ama lokal Variable'lara deger atanmali
    int yas;
    String telefon;  //Matematiksel bir islem yapmayacgimiz icin String atadik.

    public C02(String isim, int yas, String telefon) { //this keywordu instance olan varible'i belirtir.Ikiside ayni isimle tanimlandigi icin kullndk
        this.isim=isim;  //ism olarak parantez icinde tanimlarsak ==> isim=ism; de yapabilirdik.
        this.yas= yas;

    }

    public static void main(String[] args) {
        C02 obj1 = new C02("Burak",32,"0246");
        System.out.println(obj1.isim+","+obj1.yas+","+obj1.telefon);  //Burak,32,null
    }

}
