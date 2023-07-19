package javaders.day25polymorphism;

public class StudentRunner {

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println(s1.getStdId());  // Student classinda olusturdugumuz get methodu ile
                                            //id'nin degeri görülebilri yaptik, Bu sayede bu class'a cagirarak yazdirabildik.
        System.out.println(s1.getGpa());

        System.out.println(s1.isSuccessful());  //false

        s1.setGpa(3.89);
        System.out.println(s1.getGpa());  //3.87 ==> 3.89 a cevirdik.
        //Burda ki degistirilmis güncel deger ==> Objede degisir.
        //Burda degismesini saglamak icin Student classinda set() methoduyla izin verdik.
        ////"get"ve "set" methodlari class'a dokunmaz objeleri degistirir

    }
}
