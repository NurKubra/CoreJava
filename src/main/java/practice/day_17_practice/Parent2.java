package practice.day_17_practice;

public class Parent2 {

     Parent2() {
        System.out.println("PARENT CLASS PARAMETRESIZ CONSTRUCTOR");

        //child daki tum construtor super() keywordundan dolayi once Parent class'daki
        //const. yazdirir.
         //Parametreli ya da parametresiz olmasi onemli degil ilk burdaki cont. calisir.
    }

    public Parent2(int x, int y, int z) {
        System.out.println("PARENT CLASS UC PARAMETRELI CONSTRUCTOR");
    }
}
