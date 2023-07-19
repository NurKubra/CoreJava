package practice.day_14_practice;

public class C01_Varargs {

    public static void main(String[] args) {
        /*
        Parametre olarak bir int ve istediginiz kadar String alan bir method olusturunuz,
        En uzun String'in harf sayisi ile int parametre degerini carpip
        sonucu yazdiriniz.
         */
        int sayi=5;
        String str1 ="Zulal";
        String str2 ="Zeynep";
        String str3 ="Ali";
        carpim(sayi,str1,str2,str3);
    }

    private static void carpim(int sayi, String...str) {
        String enUzunKelime="";
        for(String w: str){
            if(w.length()>enUzunKelime.length()){    //gelen her bir kelimenin uzunlugu en uzunKelime String'inden uzun mu diye kontrol ediyoruz
                enUzunKelime =w;      //en uzun kelime kontynrina attim
            }
        }
        System.out.println(enUzunKelime.length()*sayi);  //en uzun kelimeini lenght'i ile sayi carptik  //30
    }


}
