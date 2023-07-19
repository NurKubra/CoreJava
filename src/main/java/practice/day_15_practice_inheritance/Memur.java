package practice.day_15_practice_inheritance;

public class Memur extends Muhasebe{

    //Daha once olusturudugumuz varible'lari buraya atayip yeni degerler atayacagiz.

    //toString() --> Objelerin tüm ozellikleirni pratik bir sekilde yazdirmak icin bir yöntemdir.
    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    //memur1 objesi, memur class'inin objesi olmasina ragmen inherit ettigi muhasebe ve onun da parent'i olan
    //Personal class'indaki tum datalari alabilir.
    public static void main(String[] args) {
        // ******* Memur 1 **********
        Memur memur1 = new Memur();  //olusturdgumuz obje ve onun constructor'i memur classina ait.
                                     //Memur class'indan olusturdugumuz icin variable'lari
                                     //ilk olarak memur'a sonra Muhasebeye sonra da Personel'e bakip arayacak

        //personel class'indan cagirip deger atadik
        memur1.persNo=1001;
        memur1.isim ="Ahmet";
        memur1.soyisim="Tepe";
        memur1.adres="Ankara";
        memur1.tel ="3214556758";

        //muhasebe class'indan
        memur1.saatUcreti =10;
        memur1.statu ="Memur";
        memur1.maas =memur1.maasHesapla(); //maasa, degerini maasHesapla() methodu ile deger atadik

        System.out.println(memur1.persNo); //1001
        System.out.println(memur1.maas);   //2400

        //Her seferinde tek tek yzmak yerine toString kullaniriz.
        System.out.println(memur1.toString());  //bu sekilde yzdiririz.
        //Memur{saatUcreti=10, statu='Memur', maas=2400, persNo=1001, isim='Ahmet', soyisim='Tepe', adres='Ankara', tel='3214556758'}



        // ******* Memur 2 **********
        Memur memur2 = new Memur();

        memur2.persNo =1002;                //personel
        memur2.saatUcreti =10;              //muhasebe
        memur2.maas= memur2.maasHesapla();  //muhasebe

        System.out.println(memur2.toString());
        //Memur{saatUcreti=10, statu='null', maas=2400, persNo=1002, isim='null', soyisim='null', adres='adres girilmedi', tel='tel girilmedi'}

        // Artik bu fabrikada istedigimiz kadar memur ureteiliriz. Urettigimiz her memur, muhasebe Class'indaki ve Personel Class'indaki
        // tum özellikleri inherit etmis olur.




    }


}
