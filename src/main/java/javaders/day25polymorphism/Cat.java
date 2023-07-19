package javaders.day25polymorphism;

public class Cat extends AnimalRunner {

    @Override
    public void move() {  //Override de method adi degistirilmez sadece body de degisiklik yapilir.

        //super.move(); super yazarsak parent deki kullanilir. Bu yüzden siliyoruz.
        System.out.println("Cats move...");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Cat create() {    //public Animal create() { olani Cat e cevirebildik
        return new Cat();   //dönüstürülen seyle Parent arasinda
                             // IS-A ilskisi varsa return Type degistirilebilir.
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return 2*a*b;
    }
}

    /*
    1) Parent daki method ile child de override edilen methodun Acess Modifierlari ayni olabilir

   *** 2) Child da Override edilen method'un access modifier'indan dar olamaz
    (yani paretn public iken child protected olamaz)

    3) Parent daki methodun acsess modifier'i Child da Override edilen
    methodu'un acess modifier'indan dar olabilir.
    (yani Parent protected iken child public olabilir.)

    4)Method'un Return Type "primitive" ise Overriddinng yapildiginda Return Type degistirilemez.

    5) Methodu'un Return Type'i "void "ise Overriding yapildiginda return type degistirilemez.

    6)Child'da Override edilen method'un "return type"i ile Parent'taki method'un
     "return type"i arasinda IS-A iliskisi
     varsa "return type"degisitirilebilir, aksi takdirda degistirilemez.
     (Non-primitive icin de bu gecerli )
     Mesela ; Integer Wrapper Class ile Long Wrapper Class arasinda IS-A ilskisi yoktur
     o yüzden return type Integer oldugunda Long'a degistirilemez.

     7) Return type Wrapper class oldugunda Overriding yaparken "return type"degismez

     8) "final method"lar Override edilemezler.
         "final method"larin bodysi degistirilemez ama Override ederken method body i degistiririz bu bir celiskidir.
         Bu yüzden java "final method"larin Override edilmesine musaade etmez.

     9)"static method"lar Override edilemez.Cunku "static method"lar tum child'lar icin ortak method'lardir
       Bir child'in ortak method'u degistirdiginde diger Child'lar bundan etkilenir.
       Bu etkilenme ummadik sonuclar ortaya cikarabilir.
       Bu yuzden Java "static method"larin Override edilmesine musaade etmez.





    Parent public iken child de override ettigimiz methodu daha daha bir Access modifier'e
    ceviremyeyiz.
    */