package javaders.day24inheritancepolymorphism;

public class Volvo extends Car {

    public void secure(){
        System.out.println("Volvo is the most secure car in the world..");

    }

    //bunu devreye sokmazsak override yapmaz böylece child classina ozel yazdirmaz.Direk Parent dakini kullanir.
    @Override  //Bu bir Annotation'dir; Override yapmanin kurallarini kontrol eder.
    public void move() {

        System.out.println("Volvo moves..");
    }
}
