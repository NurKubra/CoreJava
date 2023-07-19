package practice.day_15_practice_inheritance;

public class UstaBasi extends Isci{
    @Override
    public String toString() {
        return "UstaBasi{" +
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

        UstaBasi ustabasi1 = new UstaBasi();
        ustabasi1.isim ="Murat";     //personel
        ustabasi1.soyisim="Gokcek";  //personel
        ustabasi1.saatUcreti=15;     //muhasebe
        ustabasi1.maas= ustabasi1.maasHesapla();   //muhasebe
        ustabasi1.statu="Isci";         //muhasebe
        ustabasi1.isciStatu= "Ustabasi";  //isci  //bura ustabasi olarak deger atamsaydik-- >default degerini yazdirirdi yani==> surekli isci
        ustabasi1.mesai();   //isci  ==>Isciler gunluk 8 saat  vr haftada 5 gun calisir.


        System.out.println(ustabasi1.isim);  //isim
        System.out.println(ustabasi1.toString());

        //UstaBasi{isciStatu='Ustabasi', saatUcreti=15, statu='Isci', maas=3600, persNo=0, isim='Murat', soyisim='Gokcek', adres='adres girilmedi', tel='tel girilmedi'}




    }

}
