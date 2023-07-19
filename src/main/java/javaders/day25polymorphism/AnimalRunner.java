package javaders.day25polymorphism;

public class AnimalRunner {

    public void move(){
        System.out.println("Animals move..");


    }
    public int add(int a, int b){ //Bu methodu kullanana toplami sonuc olarak dön diyoruz.
        return a+b;

    }

    public AnimalRunner create(){  //Bu methodu kullanana bu Objeyi ver diyoruz.
        return new AnimalRunner();

    }
    public Integer multiply(Integer a, Integer b){
        return a*b;
    }
    public final double circleArea(double r){ // Override edilemez!!
       return 3.14*r*r;
    }  //final methodlari Override edilemezler
                                                                   //Cunku final() body'i degistirmeye izin vermez

}


