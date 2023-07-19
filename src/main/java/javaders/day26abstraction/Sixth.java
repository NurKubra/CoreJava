package javaders.day26abstraction;

public class Sixth extends Courses{

    //Burdaki Override'i silersek hata verir.Cünkü parent class da "butun" child
    //class larda kullancagimiz methodlari override etcegimizi söyledik.

    @Override
    public void math() {
        System.out.println("Learn addition and subtraction");
    }
}
