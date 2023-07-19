package javaders.day43lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {
        Course turkishDay = new Course("Turkish DayTime QA", 213, "Spring", 97); //parametreli cont. kullandik
        Course turkishNight = new Course("Turkish NightTime QA", 245, "Winter", 98); //parametreli cont. kullandik
        Course englischDay = new Course("English DayTime Java Dev", 121, "Spring", 91); //parametreli cont. kullandik
        Course englischNight = new Course("English NightTime Java Dev", 137, "Winter", 95); //parametreli cont. kullandik

        List<Course> courseList = new ArrayList<>();  //Course benim olusturdugum bir data type
        //Lambdada List kullaniyoruz.
        //data tipimiz Course !!!
        courseList.add(turkishDay);
        courseList.add(turkishNight);
        courseList.add(englischDay);
        courseList.add(englischNight);


        System.out.println(isAvgScoreGreaterThanANumber(courseList, 90));
        System.out.println(isAnyCourseNameContainsQa(courseList, "QA"));
        System.out.println(getCourseNamesWhoseAvgMax(courseList));
        System.out.println(getCourseBetterThanLastTwo(courseList));
        //[ Course{courseNmae='Turkish DayTime QA', numOfStudents=213, season='Spring', avarageScore='97'},
        // Course{courseNmae='Turkish NightTime QA', numOfStudents=245, season='Winter', avarageScore='98'} ]
        //tek bir List de istenen iki kursu döndü
        System.out.println(getHighestThird(courseList));
        System.out.println(getCourseWhoseRegisteredStudentLessThanNumber(courseList,150));
    }

    //Exaple 1: Tum avarage score'larin 90'dan buyuk olup olmadiigni kontrol eden method'u olusturunuz.

    public static boolean isAvgScoreGreaterThanANumber(List<Course> courseList, int avg) {  //parametre koyarsak her sayi icin bu methodu kullanilir hale getirdik
        return courseList.
                stream().
                allMatch(t -> t.getAvarageScore() > avg);//butun kurslarin avar. degeri 90'dan buyukse true doner.


    }

    //Exaple 2: En az bir course ismninin QA icerip icermdigini kontrol eden method'u olusturunuz.
    public static boolean isAnyCourseNameContainsQa(List<Course> courseList, String word) {

        return courseList.
                stream().
                anyMatch(t -> t.getCourseNmae().contains(word));
    }

    ////Exaple 3: En yuksek avarage score'a sahip kurs ismni veren kodu yaziniz.

    public static String getCourseNamesWhoseAvgMax(List<Course> courseList) {
        //konteynira koyarsak tekrar tekrar kullanabiliriz
        Course course = courseList.
                stream().
                sorted(Comparator.comparing(Course::getAvarageScore).reversed()).
                findFirst().
                get();  //findFirst Optional olarak verir (4 datayi da iceren bir data verir) get()'e ceviridk

        return course.getCourseNmae();  //burda 4  datayi iceren datada sadece birini aldik

        //ikinnci yol:
       /* return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAvarageScore).reversed()).
                findFirst().
                get().getCourseNmae();
        */
    }

    //Example 4: Avarage score'u dusuk olan ilk iki course disindaki tum kurslari return eden methodu olusturun

    public static List<Course> getCourseBetterThanLastTwo(List<Course> courseList) {  //birden fazla course döncegi icin List kulandik
        return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAvarageScore)).
                skip(2).  //ilk ikiyi bosver demek
                        collect(Collectors.toList());  //List'e cevirdik
    }

    //Example 5: Avarage score'u ustten ucuncu olan dusuk olan kursu return eden methodu olusturun

    public static Course getHighestThird(List<Course> courseList) {  //Bir tan eistedigi icin List<Course> degil Course yaptik

        return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAvarageScore).reversed()).
                skip(2).       //ilk ikiyi bosver
                        limit(1).//geriye kalanlarin ilkini alir, 2 dersek geri kalanlari ilk ikisini alir
                        collect(Collectors.toList()).
                get(0); // get() ile List'deki ilkini aldik

    }

    //Example 6: Ogrenci sayisi 150'den az kurslari return eden methodu olusturunuz.
    public static List<Course> getCourseWhoseRegisteredStudentLessThanNumber(List<Course> courseList, int numOfStd){
        return courseList.
                stream().
                filter(t->t.getNumOfStudents()<numOfStd).
                collect(Collectors.toList());  //stream'i List'e cevirdik

    }



    //alinti not
    /*
    Example 3: En yuksek average score'a sahip kurs ismini veren code'u yaziniz.
Kusr ismi verileceginden metodumuzu String yaptik. parametre olarak sadece List'imizi yazmamiz yeterli, cunku list icindeki skoru en yuksek olan belirlidir ve verebilir.

metod icine sirasiyla courseList.stream.sorted(burada sorted metodlarindan ikincisini sectik, Comparator.comparing
(Course::getAverageScore) ve reversed() yazdik. Cunku tersten yazilinca skoru en yuksek olan en basa gelecek ve
biz ilk elemani isteyecegiz. reversed sonrasi findFirst() methdou ile ilk elemani alabiliriz. Son kismina
get() yazdik. Alt kisimda kurs adini alabilmemiz icin return course.getCourseName(); yazdik. Main metod icinde kodu calistirinca ekranda
Turkish Nighttime QA yazildi.

stream(): sirasiyla tum elemanlar alt alta yazildi.
sorted(Comparator.comparing(Course::getAverageScore): Sirasiyla skorlar alt alta su sekilde yazilacak;
91
95
97
98
reversed(): 98 olan en uste gelecek;
98
97
95
91
findFirst(): Birinci elemani alacak
get(): sadece data type'ini degistiriyor. get methodu icine 98 girmis olacak.
return course.getCourseName: Bize en yuksek skora sahip kursun ismini verdi.
     */
}
