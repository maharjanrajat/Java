package custom_exceptions;

class TestCustomExpection1 {
    public static void main(String[] args) {
        try {
            valid(3);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    static void valid(int age) throws InvalidAgeException{
        if (age<18) {
            throw new InvalidAgeException("Age below 18 is not valid to vote.");
        }
        else{
            System.out.println("Welcome to vote.");
        }
    }
}
