package practice.day_14_practice;

public class Child extends Parent {

    public static void main(String[] args) {
        // static Variable'lari ve staic methodlari farkli bir class'dan cagirmak icin
        // Class ismi kullanilir normalde ==> Ama burda Parent-Child iliskisi oldudugundan
        // direk cagirabiliriz.

        System.out.println(Parent.isim);  //Class ismi ile         ==> Ali
        System.out.println(isim);         //direk varaible ismi ile ==>Ali

        isim="Veli";
        System.out.println(isim);   //burda isim'e yeni deger atadigimiz icin "Veli" yazdirir

        System.out.println(soyIsim); //can (Parent class'dan geldi)
        soyIsim="Tan";
        System.out.println(soyIsim);  //Tan degerini yeni deger olarak soyisime esayn etttik
        System.out.println(Parent.soyIsim);  //Tan

        //static methodlari da static oldugundan; Class ismi yazmadan direk cagirabildik
        method1(); // parent static method1
        method2(); // parent static method2


        //********** instance **********
        // intance Variable ve instance methodlara farki bir classs'dan ulasmak icin
        // Obje olusturmamiz lazim !!

        Child obj1 = new Child();        //Burda Child clasinda obje olusturuduk
                                         //once gidip kendi class'ini yani child class'i tarar
                                         // ve yas instance degeri olup olmaidigna bakar yoksa
                                         //Parent e gider ve ordaki degeri alir.
        System.out.println(obj1.yas);     //30

        obj1.method3();                //parent instance method3
                                       //yine once kednisine bakar(obje Child class uzerinden acildigi icin) sonra parent class'a
                                       //eger Overriding yoksa direk ordaki methodu yazdirir.
        obj1.method4();                //parent instance methdo4
    }

}
