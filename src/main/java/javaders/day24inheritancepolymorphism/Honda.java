package javaders.day24inheritancepolymorphism;

public class Honda extends Car{

    public void eco(){
        System.out.println("Honda engines are so economic..");
    }


    public String model ="Civic";
    public int price = 20000;

    public Honda(){
        System.out.println(this.model);   //this olursa bu class daki modeli al
        System.out.println(super.model);  //super olursa parent'daki modeli al demek
    }
}
