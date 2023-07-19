package javaders.day18constructorsstatickeyword;

public class StaticNonStaticBlocks02 {

    //1.constructor parametresiz
    public StaticNonStaticBlocks02(){
        //System.out.println("I am constructor");
        System.out.println("Constructor 1");

    }
    //2.constructor parametreli
    public StaticNonStaticBlocks02(int price){
        //System.out.println("I am constructor");
        System.out.println("Constructor 2");
    }
    //3.constructor parametreli
    public StaticNonStaticBlocks02(String name){
        //System.out.println("I am constructor");
        System.out.println("Constructor 3");
    }
    //4.constructor parametreli
    public StaticNonStaticBlocks02(boolean isOld){
        //System.out.println("I am constructor");
        System.out.println("Constructor 4");
    }

    //Non-static block : constructor'larda calistirilmasi gerekn ortak kodlari icerir.
    //non-static block icindeki kodlar her constructor icin kullanilir.
    //Birden fazla non sttaic block varsa üsttekki önce calistirilir.

    {  //bir tane static icine bir kere hepsi icin yaziyoruz.
        System.out.println("I am constructor - ilk");  //bu yukardaki her kodun icinde ayri ayri calisir.
        //asagidaki kod once non-static kodu görür sonra yukardaki kodlari görür!!!!!
    }
    {
        System.out.println(" I am constructor - ikinci ");  //iki tane olursa ustteki önce calistirilir.
    }

    public static void main(String[] args) {
        StaticNonStaticBlocks02 obj1 = new StaticNonStaticBlocks02();
        StaticNonStaticBlocks02 obj2 = new StaticNonStaticBlocks02(12);
        StaticNonStaticBlocks02 obj3 = new StaticNonStaticBlocks02("Shirt");
        StaticNonStaticBlocks02 obj4 = new StaticNonStaticBlocks02(false);
    }
}
