package javaders.day26abstraction;

public class CoursesRunner {

    public static void main(String[] args) {

        //  Courses j = new Courses(); abstract class dan method üretmeye izin vermedi

        Sixth s = new Sixth();   // child class dan obje olusturabilirz

    }

    public final double pi = 3.14;
    // ilk seferde deger atamasi kesinlikle yapilmali
    // ama sonrdan yeni deger atanmaz cünkü final yaptik=>  pi = 4.32;
}
