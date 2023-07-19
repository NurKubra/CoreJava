package javaders.day13incrementdecrementloops;

public class IncrementDecrement {

    public static void main(String[] args) {

        //Increment
        int a = 5;
        System.out.println(a);  //5

        a=a+2;
        System.out.println(a);  //7

        a +=2;
        //Example 1: Bir tane int variable olusturun ve onu iki sekilde  5 arttirin

        int b =10;

        b=b+5;
        System.out.println(b);  //15
        b +=5;
        System.out.println(b);  //20

        //Decrement

        int c =8;
        System.out.println(c);  //8

        c=c-3;
        System.out.println(c);  //5

        c-=3;
        System.out.println(c);  //2

        //Increment 2;
        int d= 6;
        System.out.println(d);  //6

        d=d*2;
        System.out.println(d);  //12

        d *=2;
        System.out.println(d);  //24

        //Decrement 2;
        int e=24;
        System.out.println(e);   //24

        e=e/2;
        System.out.println(e);   //12

        e/=2;
        System.out.println(e);   //6

        //1 ile increment
        int f=12;
        //f=f+1;
        //f+=1;
        f++;

        //1 ile decrement
        int h=10;
        //h =h-1;
        //h-=1;
        h--;


        //post-increment ve pre-increment
         int i =10;
         int k =i++;   //==> Post Increment //10 arttirma yaptirmadan yazdirir
                       //variable isleminden sonra increment islemi yapildi.
        System.out.println(k);  //10 ==> i arttirilmadan k sepetine konuldugu icin k nin degri 10 olur
        System.out.println(i);  //10 ==> i satir sonunda arttirildigi icin i nin degeri 11 olur
         int m=15;
         int n=++m;    //==>Pre Increment   //16 önce arttir sonra yazdirir.
                       //variable isminden once increment yapildi.
        System.out.println(m);    //16 ==> m nin satri sonunda arttirildigi icin m in degeri 16 olur
        System.out.println(n);    //16 ==> m arttirildiktan sonra n sepetine konuldugu icin n nin degeri 16 olur


        int p =17;
        int r=p--;
        System.out.println(r);  //16
        System.out.println(p);  //17


        int s=20;
        int t=--s;
        System.out.println(s);  //19
        System.out.println(t);  //19

        /*
         *  1) Increment artirmak demektir Decrement azaltmak demektir
         *  2) Incerement toplama ve carpma ile Decrement cikarma yada bolme ile yapilabilir
         *  3) Increment ve Decrement 3 yolla yapilabilir
         *
         *       a)  int i = 12; ==> i = i +5;
         *       b)  int i = 12; ==> i +=5;
         *       c)  int i = 12; ==> i++;
         *           Note : 3. yol sadece 1 artirmak icin kullanilabilir
         *
         *
         *        a)  int i = 12; ==> i = i -5;
         *       b)  int i = 12; ==> i -=5;
         *       c)  int i = 12; ==> i--;
         *           Note : 3. yol sadece 1 azaltmak icin kullanilabilir
         *  */




    }

}
