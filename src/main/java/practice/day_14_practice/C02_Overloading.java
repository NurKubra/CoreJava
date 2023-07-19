package practice.day_14_practice;

public class C02_Overloading {

    /*
    Ayni class da ayni isimde ikinci bir method olusturmaya izin vermez; Bunun icin Overloading yapiyoruz
       > isim ayni kalcaksa ==> 1-parametrelerin data turlerini degistirebilirz
                                2-parametrelerin sayisini  degisitiririz.
                                3-parametrlerin data türleri farkli ise, parametrelerin yerlerini degistirebiliriz

     */
    public static void main(String[] args) {

        //Ayni classta ayni isimde method olusturunuz
        toplama(55,66);
        toplama(2.3,4.5);
        carpma(1,2,3);
        carpma(1,2,3,4);
        cikartma(3.7,1.3f);
        cikartma(1.3f,3.7);

    }
    //1-parametrelerin data turlerini degistirebilirz;
    private static void toplama(int a, int b){

        System.out.println("iki int deger toplandi: "+ (a+b));

    }
    private static void toplama(double a, double b){

        System.out.println("iki double deger toplandi: "+ (a+b));

    }
    //2-parametrelerin sayisini  degisitiririz.
    private static void carpma(int a, int b, int c){

        System.out.println("uc int deger carpildi: "+ (a*b*c));

    }
    private static void carpma(int a, int b, int c, int d){

        System.out.println("dort int deger carpildi: "+ (a*b*c*d));

    }
     //3-parametrlerin data türleri farkli ise, parametrelerin yerlerini degistirebiliriz

    private static void cikartma(double a, float b){

        System.out.println("ilki double ikinci float cikartma islemi yapildi: "+ (a*b));

    }
    private static void cikartma(float a, double b){

        System.out.println("ilki float ikinci double cikartma islemi yapildi: "+ (a*b));

    }
}
