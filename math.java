//import java.lang.Math;
import java.util.Random;

class randomNumberExample1 {

    public static void main(String args[]) {

       /*  System.out.println("Random Num1:"+ Math.random());
        System.out.println("Random Num2:"+ Math.random());
        System.out.println("Random Num3:"+ Math.random());
        System.out.println("Random Num4:"+ Math.random());
*/
        Random random = new Random();

        System.out.println(random.nextInt(1000));
    }
}

// enum and decimal
