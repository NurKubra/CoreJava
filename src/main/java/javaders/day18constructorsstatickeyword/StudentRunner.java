package javaders.day18constructorsstatickeyword;

public class StudentRunner {

    public static void main(String[] args) {

        //static olan "numOfRegisteredStd" variable'ini cagirmak icin sadece class ismini kullandik,
        //object olusturmadik
        System.out.println(Student.numOfRegisteredStd);  //static olanlar class ismiyle cagrilir


         //static olmayan "num" variable'ini cagirmak icin object kullanilir.
        Student s1= new Student();
        System.out.println(s1.num);

        //not :static olan "numOfRegisteredStd" variable'ina object uzerinden de ulasabilirsiniz ama bu hatadir.
        System.out.println(s1.numOfRegisteredStd);

        //String manipulation daki methodlar static icermedigi icin object olusturmadan cagiramayiz!!
        //String. yazdigimizda obje olmadan static araciligyla cagirabildiklerimizi görürüz.



    }
}
