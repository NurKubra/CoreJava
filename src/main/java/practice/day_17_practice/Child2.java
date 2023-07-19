package practice.day_17_practice;

public class Child2 extends Parent2{
    // Parent2 isminde bir class olusturunuz
    // Child2 class'ı, Parent2 class'a extends ediniz
    // Child2 class'da parametresiz, tek parametreli ve iki parametreli obje olusturunuz.
    // super() constructor'u kullanarak Parent2' den ekran cıktısı alınız

    //super() cont. ==> parent class'daki parametresiz cont. aliyordu

    /*
    Extends yapilan class'lardaki tum constructor'larin ilk satirinda biz gormesek bile
    super()  construtor call vardir. Dolayisiyla once parent class'dkai construtor calisir.
    Yani once gidip Parent2 deki const. calistirir. Sonra gelir super() in bir alt satirindan calismya devam eder.
     */

    /*
    Ozetle;
    hem bu class da hem de parent daki constructorlar icin; oncelikle bu class daki parametreli obje
    bu class daki parametreli cont. bulur . Sonra super() keywordundan dolayi Parent'a
    gider, orda eger super() keywordu parametreli ile ona uygun constr. secer ve getirir.
    Once getirdigini sonra burdaki const. yazdirir.!!
     */

    public Child2(int i) {  //1 parametteli cont. olusturdu
        super();  //Parnt -child iliskisi varsa super() cikar.
                  //Parent daki parametresiz Cont. calistirir ve sanra gelip alt satirlara gecer

        System.out.println("child class tek parametreli constructor");
        /*PARENT CLASS PARAMETRESIZ CONSTRUCTOR
          child class tek parametreli constructor  */ //seklinde yazdirir.
    }

    public Child2() {
        //super();
        //System.out.println("child class parametresiz constructor");
        //Not once parent'da varsa ordaki cont. sonra burdakini yazdirir.
          /*PARENT CLASS PARAMETRESIZ CONSTRUCTOR
          child class parametresiz constructor  */ //seklinde yazdirir.

        //ikinci durum
        super(5,10,15);
        System.out.println("child class parametresiz constructor");

        //eger super(); icine parametre yazarsak bu sefer Parent daki parametreli
        // constructor'i getirir.
        /*
        PARENT CLASS UC PARAMETRELI CONSTRUCTOR
        child class parametresiz constructor
         */ //seklinde yazdirir
    }

    public Child2(int a, int b) {
        super();
        System.out.println("child class iki parametreli constructor");
         /*PARENT CLASS PARAMETRESIZ CONSTRUCTOR
          child class iki parametreli constructor  */ //seklinde yazdirir

    }

    public static void main(String[] args) {
        Child2 obj1 = new Child2();  //Parametresiz cont. sahip obje ==> default cont. kullancak o yuzden basta  kizarmiyor.
                                     //Ama Parametreli cont. olusturunca default cont. öldü bu yüzden parametresiz cont. olusturulmali


        Child2 obj2 = new Child2(1);  //Tek parametreli cont. sahip obje


        Child2 obj3 = new Child2(2,3);   //Iki parametrli cont. sahip obje


    }
}
