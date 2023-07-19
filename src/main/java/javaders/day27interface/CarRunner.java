package javaders.day27interface;

public class CarRunner {

    public static void main(String[] args) {

        Engine.stop();  //stop() methodu static oldugundan interface ismi ile ulastim.
                        //Engine icindeki sadece static olanlara ulasilabilir.

        Honda h = new Honda(); //Eger method static degilse obje ile cagirilir.
        h.eco();                //eco() methodu static olmadigindan (default method) "object" ismi ile ulastim.



       //Engine e = new Engine(); //interface'lerden obje olusturulamaz cunku yarim methoddur.
                                    // ama child daki cagirarak yapabiliriz.
                                    // o yüzden child den obje urettik yani Honda'dan .



    }
}
