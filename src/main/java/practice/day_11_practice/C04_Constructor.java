package practice.day_11_practice;

public class C04_Constructor {

    // marka, model, yil, yakit  seklinde dort tane instance variable olusturalım.
    // Bu variable'lara parametreli constructor kullanarak, farkli bir class'dan deger ataması yapınız ve yazdırınız


    String marka;
    String model;
    int yil;
    String yakit;


  /*  public C04_Constructor(String mrk, String mdl, int yl, String ykt) {

        marka = mrk;
        model= mdl;
        yil = yl;
        yakit=ykt;

    }
*/
    public C04_Constructor(String marka, String model, int yil, String yakit) {

        this.marka = marka;
        this.model= model;
        this.yil = yil;
        this.yakit=yakit;

    }
}
