package javaders.day22StringBuilder;

public class Sbf01 {

    /*
    1) StringBuffer Javada String ureten Class'dir.
    2)StringBuffer,StrignBuilder'a cok benzer, yani ikisi de "mutable" Strign verir,
    3)StringBuffer "multi-thread"dir ama StringBuilder "multi-thread" degildir.
    > whatsup da görüntülü konusma yaparken ses, görüntü gidiyor, ayni anda alarm calabilyior
    ya da resim gönderiliyor ==> application 'larin birden fazla isi ayni anda yapmasi "Multi thread" 'dir
    ==> Kullancagimiz data tek bir is yapcaksa StringBuffer tek bir is yapcaksa StringBuilder tercih edilri.
    4)Java StringBuffer'i StringBuilder'dan önce olusturudu.(bir iste cok is varsa yavas calisir)
    5) StringBuilder "multi-thread" olmadigindan StringBuffer'dan daha hizli calisir.
    ==> normalde ayni isi yaparlar
    6)"multi-thread" yapilirken yapilan islerin siralamsi onem arz eder, yapilan isleri
      mantikli bir siraya koymak "synchronization" olarak adlandirilir.
      StringBuffer "multi-thread" oldugu icin ayni zamanda "synchronized"dir.

    3 tane String olan Class ogrendik;
    1)immutable string lazimsa: String Class
    2)mutable string lazimsa : StringBuilder veya StringBuffer;
                               i)StringBuilder'i multi-thread gerekmezse kullanilir
                               ii)StringBuffer'i multi-thread gerekirse kullaniirz


        ==> multi-thread zamandan kazandirir. Ama yapilan islerde siralama cok önemlidir

     */

    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer("Java");



    }
}
