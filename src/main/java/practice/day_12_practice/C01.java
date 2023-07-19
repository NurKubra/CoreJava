package practice.day_12_practice;

public class C01 {

    //Bu class calistirildiginda output ne olur. Calisma mantigini anlatiniz.(instance variable)

    //instance variable'lar class sevyesinde ousturulur
    /*
    Bizim iki tane instance variable'larimiz var(static yazmiyor basinda)
    Kod okumaya main den basliyoruz.
    Mainin ilk satirinda birince obje olusturulmus; obj1 ==> instance variable'lar objeye baglidir.
    Biz instance variable'lari objeye bagliyoruz.
    Olusturdugumuz bu obje parametreli bir const. sahip dolayisiyla ==> bu kodu run ettigimizde parametreli cont. gelcek
    gelirken yaninda "Nuri" ve 25 i getircek ==> Yani parantez icin parametre olarak
    Biz bu durumda isimleri isim ve yas olarak degisitirip; intance variablara esayn ediyoruz. Ayni isimlere sahip oldukalri icin
    this ile hanisi oldugunu belirttik.
    Bunu mainde obj1 uzerinden yazdirdigimizda isim ve yas=>Nuri ve 25 olarak verir.

    Ikinci bir obje olusturdugumuzda parametrsiz bir const. yaptik. Bu yüzden parametresiz bir cont. kullanir.
    obj2 ye intstance olan isim ve yas variable'larini bagladik. Herhangi bir ywni bir deger atamasi yapmadigimiz icin;
    Degerler ilk atanan degerler olarak yazdirir. ==> Hasim ve 20 olarak verir.
     */

    String isim="Hasim";
    int yas =20;

    public C01(String isim, int yas) {  //parametreli constructor olusturduk(return type'i yok)
        this.isim=isim;   //instance variable'a esayn ediyorum
        this.yas= yas;
    }
    public C01() {    //parametrsiz constructor

    }
    public static void main(String[] args) {
        //static bir main icinden static olmayan instance variable'lara ulasmak icin obje olusturuyoruz.

        C01 obj1= new C01("Nuri",25); //constructor'i parametreli olan bir obje olusturdun bu yuzden parametreli bir constructor olusturmamiz lazim
        System.out.println(obj1.isim+ " ,"+ obj1.yas);  //Nuri ,25

        C01 obj2 = new C01();   //parametresiz bir obje bu yüzden parametrsiz bir constructor yani default const. yerine gececek bir const. olusturmak lazim
        System.out.println(obj2.isim+ ", "+ obj2.yas);  //Hasim, 20
    }

}
