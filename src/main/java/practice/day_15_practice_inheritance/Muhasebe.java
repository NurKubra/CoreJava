package practice.day_15_practice_inheritance;

public class Muhasebe extends Personel{

    //Memur ve Isci class'inin muhabese genel bilgileri Muhasebede tutulur.

    protected int saatUcreti;
    protected String statu;
    protected int maas;

    protected int maasHesapla(){
        int maas = saatUcreti*8*30;
        return maas;
    }
}
