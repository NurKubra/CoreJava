package javaders.day13incrementdecrementloops;

public class ForLoops02 {

    public static void main(String[] args) {

        //Example 1: Verilen bir string'deki ilk 'a' harfinden önceki tum charakterleri console'a yazdiriniz.
        //          I love Java ==> I love J


        String s = "I love Java";

        for(int i=0 ; i<s.length() ; i++){
                                             //  System.out.print(s.charAt(i));  //butun indexleri tek tek yazdirir.
            if (s.charAt(i)=='a'){
                break;
            }
            System.out.println(s.charAt(i));
        }

        //2. yazim sekli

        for(int i=0 ; i<s.length() ; i++){
            char ch =s.charAt(i);
            if (ch =='a'){
                break;
            }
            System.out.println(ch);
        }

        //charAt() de bize char dondurur.
        //substring string dondurur.



        System.out.println("");

        //Example 2:Verilen bir String de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz.
        // Germany ==> yn

        String t = "Germany";

        for (int i=t.length()-1 ; i>=0 ; i--){
                                                       // System.out.print(a.charAt(i));  //bu kod tersten yazdirir.
            char c = t.charAt(i);
            if( c =='a'){                              //bu kod a yi buldugunda kosolu terketcek.
                break;
            }
            System.out.print(c);
        }

       //for icinde istedigimiz kadar variable olusturabilirz.
    }
}
