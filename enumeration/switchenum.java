enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class switchenum {
    public static void main(String[] args) {
        Level myVal = Level.MEDIUM;

        switch(myVal) {
            case LOW:
            System.out.println("Low Level");
            break;

            case MEDIUM:
            System.out.println("Medium Level");
            break;

            case HIGH:
            System.out.println("High Level");
            break;
        }
    }
}
