package test;

public class InvalidOrderException extends Exception{
    String invalidData;
    public InvalidOrderException(String invalidData){
        super();
        this.invalidData = invalidData;

    }
}
