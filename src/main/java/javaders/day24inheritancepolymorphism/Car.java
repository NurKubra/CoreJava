package javaders.day24inheritancepolymorphism;

public class Car {

    //inhetritance da ortak ozellikler parente yazilir.
    //Java single inheritance'i destekler multiple inheritance'i desteklemez.
    //yani her child'in bir parent'e olmasini
    //Java da Parent'i olmayan tek clas Object (en tepedeki).

    //Class'i olusturuduguuzda Constructer'i göremeyiz ama aslinda vardir. Default Constructer aslinda
    //Object icindedir.

    //Ortak methodlar Parent'a konuldugu gibi ortak Variable'lar da parent'a eklenebilir
    //Yani methodlar yaninda Variable'lar da kullanilabilir.


    /*
    1)Inheritance de object olusturuken constructor'lar yukaridan asagiya(Parent)
    dogru calisir.
    2)Parent ve Super es anlamlidir, Child ve Sub es anlamlidir.
    3)Super() her constructor'in ilk satirinde gorunmez olarak bulunur.
    Isterseniz görünür sekilde de yazabilirsiniz.
    4) super() sizi parent class daki constructor'a tasir.
    5) this() sizi ayni class icindeki constructor'lar arasindaki gezmemizi saglar.
    6)"this" icinde bulundugunuz class'daki variable'lari cagirmaya yarar.
      "super" parent classdaki variable'lari cagirmaya yarar.
    7)Eger data type'lari arasinda IS-A ve HAS-A iliskisi varsa bu data typelarina "COVARIANT"denir.
     */
    /*
    Not : Parent dan Child'e HAS-A iliskisi vardir (Multi... icin yukardan asagi gelirsek).
          Child den Parent e IS-A ilskisi vardir (asagidan yukariya )
          Eger data type'lari arasinda IS-A ve HAS-A iliskisi varsa bu data typelarina "COVARIANT"denir.
          (Overreinig de bunu kullanicaz)

     */

    /*
    1)Polymorphism ==> Coklu sekil
     Yani bir methodun farkli sekillerde karsimiza cikmasi demek.
     Polymorphism = Overloading(+) + Overriding (-)
     Overiding : Parent deki methodu child deki methoda göre özellestirmeyi saglar
    2) Overridding,parent class daki methodu child'in ihtiyaclarina göre özellestirerek kullanmak demektir.
    3) Overridding de methodun body'si degistirilir.
    4) Overridding de method signature dokunulmaz, dokunursaniz Java kizar. (yani public void move(){} 'un move kismi)


     */

    public void move(){
        System.out.println("Cars move..");
    }


    public void getBreak(){
        System.out.println("Cars break..");
    }

    public void engine(){
        System.out.println("Cars have engine..");
    }

    public String model = "Car";
    public int price = 0;

    //constructor (return Type yazilmaz)
    public Car(){
        super(); //istersniz görünür yapabilirsiniz
        System.out.println("Car constructor 1");
    }

    public Car(int i){
        this();
        System.out.println("Car constructor 2");
    }
}
