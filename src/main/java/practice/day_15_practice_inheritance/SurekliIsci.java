package practice.day_15_practice_inheritance;

public class SurekliIsci extends Isci{

    @Override
    public String toString() {
        return "SurekliIsci{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {


       //******* Surekli Isci 1 *******
        SurekliIsci surekliIsci1 = new SurekliIsci();
        surekliIsci1.persNo=5001;    //personel
        surekliIsci1.isim = "Cem";   //personel
        surekliIsci1.soyisim ="Oz";  //perosnel
        surekliIsci1.statu="Isci";   //Muhasebe
        surekliIsci1.saatUcreti=11;  //muhasebe
        surekliIsci1.maas= surekliIsci1.maasHesapla();  //muhasebe

        System.out.println(surekliIsci1.persNo);  //5001
        //boyle tek tek yazdirmak yerine toString methodunu kullaniyorum
        System.out.println(surekliIsci1.toString());
        //SurekliIsci{isciStatu='Surekli Isci', saatUcreti=11, statu='Isci', maas=2640, persNo=5001, isim='Cem', soyisim='Oz', adres='adres girilmedi', tel='tel girilmedi'}
    }

}
