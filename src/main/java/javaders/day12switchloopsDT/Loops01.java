package javaders.day12switchloopsDT;

public class Loops01 {
    public static void main(String[] args) {
        //Example 1: Ekrana 5 kere "Hi" yazdiriniz

        //1.yol
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //kodu tekrarlamak istenmez ve tavsiye edilmez
        /*
        Code Standards
        1)Tekrar (Repetition) olmamalidir.
        2)Dynamic olmalidir.
        3)Tamir (Fix) ve update kolay yapilabilmelidir.
         */
         //2.yol
        //Ayni adimlar tekrar tekrar yapilmasi gerektiginde "Loop"lar kullanilir.
        //4 tane "Loop" var;
        //1) for.loop 2)while-loop 3)do-while loop 4)for-each loop

        //1) for-loop

        /*for ( Baslangic degeri;Loop calisma sarti;Arttirma/Eksiltme){
            //Caliscak kodlar
        }
         /*
         Baslangic degeri   ;   Loop Calisma Sarti    ;    Arttirma/Eksiltme
         bir kere calisir        cok kez calisir            cok kez calisir
         */


         for(int i= 1        ;            i<6          ;       i++            ){

             //i variablenda 1 den basla 6 a kadar olan kisimda birden baslayip bese kadar arttir.i++ ==> i yi 1 arttir demek
                 System.out.println("Hi");
        }


    //Example 2: 11'den 14'e kadar tum sayilari ekrana yazdirin

        for (int i =11  ;   i<15   ; i++  ){

            System.out.println(i);   //11,12,13,14

        }

        //ilk kisim genelde i kullanilir ; loop'umun baslangic döngusunu olusturuyorum.

    //Example 3: 40 dan 23 e kadar tum cift sayilari ekrana yazdiriniz

        for (int i =40; i>22  ;i--){
            if ((i&2)==0){
                System.out.println(i);
            }
        }
    // Example 4: 18 den 56 a kadar tum tek sayilari ekrana yazdirin

        for (int i =18; i<57 ; i++){
            if(i%2!=0){
                System.out.print(i+" ");  //yan yana yazdirir..print yaptik
            }
        }




    }

}
