package custom_exceptions;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String str){
        super(str);
    }
}
