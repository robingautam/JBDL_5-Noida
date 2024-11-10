package exceptionhandling;

public class AgeNotValidException extends Exception
{

    AgeNotValidException(String mesg){
        super(mesg);
    }
}
