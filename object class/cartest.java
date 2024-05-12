import java.util.*;

class Cartest{
    public static void main(String[] args){
        System.out.println("Enter your choice from 1-2: ");
        Car Cars  = new Car();
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                Cars.start();
                break;
            case 2:
                Cars.stop();
                break;
            default:
                Cars.applybrake();
        }
    }
}
