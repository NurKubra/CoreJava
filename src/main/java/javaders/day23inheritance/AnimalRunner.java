package javaders.day23inheritance;

public class AnimalRunner {

    public static void main(String[] args) {

        Cat c1 = new Cat();
        //sadece meow'u kullanabilirken, extens eklersek Animal Class'indaki methodlari da kullanabilir(eat(),drink())
        c1.meow();
        c1.eat();
        c1.drink();

        Dog d1 =new Dog();
        d1.bark();
        d1.eat();
        d1.drink();

        Bird b1 = new Bird();
        b1.tweet();
        b1.eat();
        b1.drink();

    }
}
