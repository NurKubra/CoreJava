package practice.day_15_practice_inheritance;

public class Isci extends Muhasebe{   //aslinda isci diye bir calisan yok ; departmanin adi isci bu yüzden burda obje olusturmaya
                                      //ihtiyac duymadik. Asil calisanlar isci'nin child'lari olan surekliisci ve ustabasi.

    protected String isciStatu= "Surekli Isci"; //child class'larda deger atanmazsa bu degeri atayacak bu yüzden olusturuduk.
    protected void mesai(){
        System.out.println("Isciler gunluk 8 saat  vr haftada 5 gun calisir.");
    }


    //Not: bu class'dan da obje olusturabiliriz. Bu class'in child class'larinin olmasi obje olusturmaya engel degil
    // fakat isciler icin, surekli isci ve ustabasi olmkatan baska ihtimal olmadigi icin isci class'indan isci üretmeye gerek yok
}
