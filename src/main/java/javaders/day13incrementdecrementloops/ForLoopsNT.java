package javaders.day13incrementdecrementloops;

public class ForLoopsNT {

    public static void main(String[] args) {
        //Verilen bir String`deki ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz.
        // Hello Java


        String st = "Kubra";

        for (int i=0; i<st.length(); i++){
            char ch = st.charAt(i);
            if(ch =='a'){
                break;  //Loopù herhangi bir sarta göre kirmak icin break keyword kullanilir.
            }else {
                System.out.print(ch);   //Kubr
            }
        }

        System.out.println("");
        //Example Verilen bir String deki son 'a'dan sonraki tum characterleri ters sirada yaziniz

        String u = "Tokatci";
        for (int i=u.length()-1; i>=0; i--){
            char ch2 =u.charAt(i);
            if (ch2=='a'){
                break;
            }else {
                System.out.print(ch2);
            }

        }





    }
}
