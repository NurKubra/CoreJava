package javaders.day36exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/main/java/javaders/day36exception/TestFile");

            int i=0;
            while((i=fis.read())!=-1){
                System.out.println((char)i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong or the file does not exist");
        } catch (IOException e) {
            System.out.println("Some characters could not be read");
        }

        /*
        icice catch lerde parent olan alta yazilir (IO)
         */
        /*
        Add 'catch' clause(s): try'dan sonra coklu catch yaz
        Add exception to method signature : exception'i method signature'dan sonra yaz
        Replace 'FileNotFoundException' with more genric 'IOExeption' : tek catch ve catch icinde IO yazalim
        Surround with try/catch : try icinde try yapiyim (yani nested)
         */
    }
}
