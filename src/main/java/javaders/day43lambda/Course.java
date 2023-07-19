package javaders.day43lambda;

public class Course {

    /*
    Icinde
     1) private variable'lar
     2)Parametreli ve parametresiz Const.lar
     3)Getter'lar
     4)Setter'lar
     5)toString Methodu barindiran class'lara "POJO" Class denir.
    POJO : Plain Old Java Object (API 'larda isimize yariyacak)
    (API da bize farkli formatlarda data verilcek, biz bu datalari pojo haline getirip kullaniriz.)

     */

    private String courseNmae;
    private int numOfStudents;
    private String season;
    private int avarageScore;


    //constructor
    public Course(String courseNmae, int numOfStudents, String season, int avarageScore) {
        this.courseNmae = courseNmae;
        this.numOfStudents = numOfStudents;
        this.season = season;
        this.avarageScore = avarageScore;
    }

    public Course() {  //default conts. da ekledik
    }



    //getter'lar

    public String getCourseNmae() {
        return courseNmae;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public String getSeason() {
        return season;
    }

    public int getAvarageScore() {
        return avarageScore;
    }


    //setter'lar


    public void setCourseNmae(String courseNmae) {
        this.courseNmae = courseNmae;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setAvarageScore(int avarageScore) {
        this.avarageScore = avarageScore;
    }

    //girilen tum degerlari okuyabilmek icin (bu kursun tum ozelliklerini ayni anda verir)
    @Override
    public String toString() {
        return "Course{" +
                "courseNmae='" + courseNmae + '\'' +
                ", numOfStudents=" + numOfStudents +
                ", season='" + season + '\'' +
                ", avarageScore='" + avarageScore + '\'' +
                '}';
    }


    //alinti not:
   /* Sagi tiklayip, generate'den constructor'i secip orada gordugumuz asagida yazdigimiz 4 variable'i secerek
    bu variablelarin parametre olarak girildigi otomatik bir constructor'imiz ve sonrasinda bir variable secmeden
    default constructor'imizi olusturduk.

    Variablelarimiz private oldugu ve onlari okumamiz gerektigi icin generate'den herbirini secip getter'lari ve
    degisiklik yapabilmek icin herbiri icin setter'lari olusturduk.

    Object'i olustururken tum ozellikleri ile gorup yazdirabilmemi icin toString methodunu yine generate'den secip
    olusturduk.
    */

}
