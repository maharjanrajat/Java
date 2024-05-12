import java.util.Scanner;

class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = sc.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = sc.nextInt();

        System.out.println("Enter the operation to be performed(+, -, *, /, %): ");
        String operation = sc.next();

        int result = performOperation(firstNumber, secondNumber, operation);

        System.out.println("Result = " + result);
    }

    public static int performOperation(int firstNumber, int secondNumber, String operation) {
        int result = 0;
        if (operation.equals("+")) {
            result = firstNumber + secondNumber;
        }

        else if (operation.equals("-")) {
            result = firstNumber - secondNumber;
        }

        else if (operation.equals("*")) {
            result = firstNumber * secondNumber;
        }

        else if (operation.equals("%")) {
            result = firstNumber % secondNumber;
        }

        else if (operation.equals("/")) {
            result = firstNumber / secondNumber;
        }
        
        else {
            System.out.println("Invalid operation");
        }
        return result;
    }
}