package javaders.day37exceptionsenum;

public class IllegalException extends RuntimeException  {  //Bu sefer Exception degil RuntimeException yaptik (Exception ==> Compile Time Exc)

    /*
    1)Eger Runtime Custom Exception uretmek isterseniz; RuntimeException class'a extend etmelisiniz.

     */
    public IllegalException(){
        super();
    }

    public IllegalException(String message){
        super(message);
    }
}
