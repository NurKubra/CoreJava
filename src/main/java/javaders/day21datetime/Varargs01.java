package javaders.day21datetime;

public class Varargs01 {

    public static void main(String[] args) {
        System.out.println(add(5, 2, 4, 3));//14
        System.out.println(add(5, 2));//7
        System.out.println(add(5));//5
        System.out.println(add());//0

        getInitials("Ali Can", "Kemal Han", "Tuncay Cinar", "Ibrahim Cata;");


    }

    //Example 1:Toplama islemi yapan bir method olustur
    //Asagidaki gibi farkli methodlar olusturarak is yapamayiz
    //Cunku kullanici farkli sayidaki sayilari toplamak isteyebilir, her ihtimal icin bir method olusturmak
    //mumkun degildir.

   /* public int add(int a, int b){
        return a+b;
    }
    public int add(int a,int b, int c){
        return a+b+c;
    }
    public int add(int a, int b, int c, int d){
        return a+b+c+d;
    }

    */
    //Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
    //Bu yapiya "Varargs" denir.
    //"Varargs" arkada "Array" yapisini kullanir.
    //Varargs bos birakilabilir. Ama normal variable'lara mutlaka deger atanmali.
    /*
    1) Bir method parantezinde birden fazla "Varargs" kullanilamaz.
    (bir varargs zaten sinirsiz data alcagi icin ikincisi unused olur yani kullanilmayan data!)
    2) Bir method parantezinde birden fazla parametre kullanilcaksa "Vararg" en sonda olmalidir.
     */

    public static int add(int... a){
        int sum=0;
        for(int w:a){
            sum=sum+w;
        }
        return sum;
    }

    //Example 2 : Verilen isimlerin ilk harflerini console'a yazdiran methodu olusturunuz.

    public static void getInitials(String... s) {

        String initials = "";
        for (String w : s) {
            initials = initials + w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials = ""; // isim icin yeniden bosaltiyoruz.
        }

    }
}
