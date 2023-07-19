package practice.day_13_practice;

public class C02_StaticKeyword {

    //Bu class calistiginda output ne olur? Calisma mantigi nedir?

    static int y; //static variable
    int x;        //instance variable

    public C02_StaticKeyword(int i) {
        x+=i;    //obj1 icin 2, obj2 icin 3 'dür!
        y+=i;    //static varibale'a cont. uzerinden hem 2 hem de 3 eklemis olduk!

        //parametli cont. icinde atama yapilan degerler yalnizca degisir.
        //Eger burda x ve y icin deger atamasaydik yeni degerler yazdirilmazdi
        //parametrsiz cont icinde de deger atamsi yapilabilir.

    }

    public static void main(String[] args) {

        C02_StaticKeyword obj1 = new C02_StaticKeyword(2);
        C02_StaticKeyword obj2 = new C02_StaticKeyword(3);

        System.out.println(obj1.x+ ","+ obj2.x+ ","+obj2.y+","+obj1.y);  //2,3,5,5
        System.out.println(y); //5 ==> obj uzeiden yazdirmasak da cnt. icinde yani atanan son degeri yazdirir.
        System.out.println(obj1.x+ ","+ obj2.x+ ","+y ); //2,3,5


    }
}
