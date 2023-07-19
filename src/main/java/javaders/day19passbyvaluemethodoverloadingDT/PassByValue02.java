package javaders.day19passbyvaluemethodoverloadingDT;

public class PassByValue02 {
    public static void main(String[] args) {
        String name ="Tom Hanks";
        System.out.println(name);  //Tom Hanks

        String updateName = updateName(name,"ali");
        System.out.println(updateName); //Tom Hanks ali
        //Pass by Value
        System.out.println(name);       //Tom Hanks

        //Pass by Reference
        name = updateName(name,"senior"); //Tom Hanks senior
        System.out.println(name);


    }
    public static String updateName (String name, String add){
        name = name + " " + add;
        return name;  //anlami ; updateName methodu ile name variable icindeki degeri return ediyor

    }

    //Not:







}
