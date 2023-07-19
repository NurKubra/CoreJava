package javaders.day24inheritancepolymorphism;

public class CarRunner {
    public static void main(String[] args) {


                                       //PARENT CLASS ==SUPER CLASS
                                       //CHILD CLASS == SUB CLASS
                                       //Interview ==> SUPER() her constructor'ın ilk satırında bulunur ve bizi parenttaki constructor'a taşır.
        Toyota t1 = new Toyota();      //parametre olmayan constructor'i kullancak.
                                       //Java ya Toyota olustur diyince önce Parent'i olusturuyor sonra Toyota'yi
                                       //Bu yüzden yazdirdigimizda once Car constructor 1 , sonra Toyota constructor 1 yazdirir.
                                       //super() kodu bizi yukariya tasiyan koddur.
        //Constructor'lar Inheritance da yukaridan asagiya dogru kullanilir !!!!
        t1.model ="Prius";
        System.out.println(t1.model);

    }
}









/*
        Java diyor ki once parent'i sonra child'i olustur. Burada once Car sonra Toyota'yi olusturduk.
        Java once Car'i calistirir. Yani once onu yazdirir, sonra asagidaki constructorlari calistirir.
        Biz Java'ya Toyota(); constructor'ini calistir, icinde parametre olmayani calistir dedik.
        Bu constructor Toyota uretecek, ama once parent'i olan Car'in uretilmesi gerekir.
        Her constructor'in ilk satirinda gorunmez kodu vardir. O da super() seklindedir.
        Super parent demektir. O yuzden once parent'e gidilir.
        Car'in da parent'i varsa oradaki constructor da super parantez nedeniyle kendi parent'ina gider.
        En tepeden Object Class'tan calismaya basladi asagilara kadar geldi.
        Bizi yukariya tasiyan kod su super keyword'udur. Bu sizi parent'daki constructor'a tasir.
 */